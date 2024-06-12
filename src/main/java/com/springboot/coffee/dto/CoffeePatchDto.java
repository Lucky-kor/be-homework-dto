package com.springboot.coffee.dto;

import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePatchDto {

//    @Min(1)
    private long coffeeId;
  //비워놔도 NULL 들어가도록 수정해야한다
    //한글은 NOTSPACE 써도 영어는 안된다

    @NotSpace(message = "이름은 공백이 아니어야 합니다.")
    @Pattern(regexp = "^[가-힣]*$" , message = "한글만 입력하셔야 합니다.")
    //이렇게 하면 ㄱ ㄴ ㅎ 이렇게 자음 들어올 수 없다.
    //패턴 정규표현식은 문자열에만 쓰인다
    //NULL 은 보지않아서 통과한다
    //단 하나라도 문자열이 있어야지만 참고한다 문자열 없으면 아예 보지 않음
    //NotSpace 쓰거나 밑에 패턴쓰기
    private String korName;
    //비워놔도 NULL 들어가도록 수정해야한다
    //한글은 NOTSPACE 써도 영어는 안된다


//    @NotBlank
//    @Pattern()
    //패턴이 null 값 통과시키니까 이것도 이렇게만 작성해도 null 통과된다
    @Pattern(regexp = "^[a-zA-Z]*$" , message = "영문만 입력해야 합니다")
    private String  engName;

    @Min(value = 100)
    @Max(value = 50000)
    private Integer price;
}
