package com.springboot.coffee;
import com.springboot.member.NotSpace;
import lombok.Getter;
import lombok.Setter;
import java.lang.Integer;
import javax.validation.constraints.*;

@Getter
@Setter
public class CoffeePostDto {
    @Pattern( regexp = "^[가-힣]+$" ,message = "공백이 없는 한글만 입력할 수 있습니다 ")
    private String korName;

    @NotSpace(message = "영문명은 공백이 아니어야 합니다")
    @Pattern( regexp = "^(?!\\s*$)[A-Za-z]+( [A-Za-z]+)*$", message = "공백만으로는 구성되지 않는 영문(대소문자)만 허용됩니다, 워드 사이에 한칸의 공백만 허용됩니다.")
    private String engName;

    @NotNull (message = "가격은 필수로 입력해야 합니다")
    @Min( value = 100, message = "100이상의 숫자를 입력하여 주세요")
    @Max( value = 50000, message = "50000 이하의 숫자를 입력하여주세요")
    private Integer price;
}
