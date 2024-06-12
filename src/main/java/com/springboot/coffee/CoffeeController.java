package com.springboot.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/v1/coffees")
@Validated // 모든 메서드 파라미터에 PathVariable 검증
public class CoffeeController {
    // 1. DTO 클래스 및 유효성 검증을 적용하세요.
    @PostMapping
    public ResponseEntity postCoffee(@Valid @RequestBody CoffeePostDto coffeePostDto)  { // 객체가 생성되야 밑에 코드가 실행댐

        return new ResponseEntity<>(coffeePostDto, HttpStatus.CREATED);
    }

    // 2. DTO 클래스 및 유효성 검증을 적용하세요.
    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@Positive @PathVariable("coffee-id") @Min(1) Long coffeeId, //MIN(1) 은 클래스위에 어노태이션
                                      @Valid @RequestBody CoffeePatchDto coffeePatchDto) {

        coffeePatchDto.setCoffeeId(coffeeId);

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
