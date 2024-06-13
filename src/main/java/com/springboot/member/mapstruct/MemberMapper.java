package com.springboot.member.mapstruct;

import com.springboot.member.MemberPatchDto;
import com.springboot.member.MemberPostDto;
import com.springboot.member.MemberResponseDto;
import org.mapstruct.Mapper;
import com.springboot.member.Member;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto(Member member);
    List<MemberResponseDto> MembersToMembersResponseDtos(List<Member> members);
}
