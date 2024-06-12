package com.springboot.coffee;

import com.springboot.member.MemberPostDto;
import org.apache.coyote.Response;
import org.springframework.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.*;

@RestController
@Validated
@RequestMapping("/v1/coffees")
public class CoffeeController{
    @PostMapping
    public ResponseEntity postCoffee(@RequestParam("korName") String korName,
                                     @RequestParam("engName") String engName,
                                     @RequestParam("price") int price){
        Map<String, Object> map = new HashMap<>();
        map.put("korName",korName);
        map.put("engName",engName);
        map.put("price",price);

        return new ResponseEntity<>(map, HttpStatus.CREATED);

        public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto){
            return new ResponseEntity<>(coffeePostDto,HttpStatus.CREATED);
        }
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") long coffeeId,
                                      @RequestParam("korName") String korName,
                                      @RequestParam("price") int price){
        Map<String,Object> body = new HashMap<>();
        body.put("coffeeId",coffeeId);
        body.put("korName",korName);
        body.put("engName","김라떼");
        body.put("price",price);
        return new ResponseEntity<>(body,HttpStatus.OK);

        public ResponseEntity patchCoffee(@Min(1) @PathVariable("coffee-id") long coffeeId, @Valid @RequestBody CoffeePatchDto coffeePatchDto){
            coffeePatchDto.setCoffeeId(coffeeId);
            coffeePatchDto.setEngName("latte");
            coffeePatchDto.setKorName("라떼");
            coffeePatchDto.setPrice(1000);
            return new ResponseEntity<>(coffeePatchDto,HttpStatus.OK);
        }
        @GetMapping("/{coffee-id}")
        public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId){
            System.out.println("coffeeId: "+ coffeeId);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        @GetMapping
        public ResponseEntity getCoffees(){
            System.out.println("get coffees");
            return new ResponseEntity<>(HttpStatus.OK);
        }
        @DeleteMapping("/{coffee-id}")
        public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
}