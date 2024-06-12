package com.springboot.coffee;

import com.springboot.member.MemberPostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.HashMap;
import java.util.Map;

@RestController
@Validated
@RequestMapping("/v1/coffees")
public class CoffeeController {
    // 1. DTO 클래스 및 유효성 검증을 적용하세요.
    @PostMapping
    // @Valid가 없으면 유효성 검사가 있어도 검사를 안함
    public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto) {
        return new ResponseEntity<>(coffeePostDto, HttpStatus.CREATED);
    }

    // 2. DTO 클래스 및 유효성 검증을 적용하세요.
    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@Min(1) @PathVariable("coffee-id") long coffeeId,
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);
//        coffeePatchDto.setEngName("Americano");
//        coffeePatchDto.setKorName("아메리카노");
//        coffeePatchDto.setPrice(1500);
        return new ResponseEntity<>(coffeePatchDto, HttpStatus.OK);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId: " + coffeeId);

        // not implementation

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        System.out.println("# get Coffees");

        // not implementation

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId) {
        // No need business logic

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
