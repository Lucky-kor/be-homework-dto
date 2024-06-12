package com.springboot.coffee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class PostCoffeeDto {
	@NotBlank(message = "공백만 들어오면 안됩니다.")
	@Pattern(regexp = "^[ㄱ-ㅎ|가-힣]+$",message = "한글만 들어와야 됩니다.")
	private String korName;

	@NotBlank(message = "공백만 들어오면 안됩니다.")
	@Pattern(regexp = "^(?!\\s)(?!.*\\s$)(?!.*\\s\\s).*$", message = "입력값은 앞뒤에 공백이 없어야 하며, 문자열 사이의 공백은 하나여야 합니다.")
	@Pattern(regexp = "^[A-Za-z\\s]+$", message = "입력값은 알파벳 대소문자만 포함해야 합니다.")
	private String engName;

	@Min(value = 100,message = "100이상의 숫자로 입력해주세요.")
	@Max(value = 50000,message = "50000이하의 숫자로 입력해주세요.")
	private int price;
}
