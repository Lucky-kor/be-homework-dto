package com.springboot.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class MemberResponseDto {
    private long memberId;
    private String name;
    private String email;
    private String phone;

    public MemberResponseDto() {
    }

    public MemberResponseDto(long memberId, String name, String email, String phone) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}
