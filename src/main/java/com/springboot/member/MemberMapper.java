//package com.springboot.member;
//
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Component  // (1)
//public class MemberMapper {
//    // (2) MemberPostDto를 Member로 변환
//    public Member memberPostDtoToMember(MemberPostDto memberPostDto) {
//
//        Member member = new Member(0L,
//                memberPostDto.getName(),
//                memberPostDto.getEmail(),
//                memberPostDto.getPhone());
//        return member;
//    }
//
//    public Member memberPatchDtoToMember(MemberPatchDto memberPatchDto){
//        Member member = new Member(
//                memberPatchDto.getMemberId(),
//                memberPatchDto.getName(),
//                null,
//                memberPatchDto.getPhone()
//                );
//
//        return member;
//    }
//
//    public MemberResponseDto memberToMemberResponseDto(Member member){
//        MemberResponseDto memberResponseDto = new MemberResponseDto(
//                member.getMemberId(),
//                member.getName(),
//                member.getEmail(),
//                member.getPhone()
//        );
//        return memberResponseDto;
//    }
//
//    public List<MemberResponseDto> membersToMemberResponseDtos(List<Member> response){
//
//        List<MemberResponseDto> responseDtos = response.stream().map(this::memberToMemberResponseDto)
//                .collect(Collectors.toList());
//
////        List<MemberResponseDto> responseDtos = new ArrayList<>();
////        for(Member member : response){
////            MemberResponseDto responseDto = this.memberToMemberResponseDto(member);
////            responseDtos.add(responseDto);
////        }
//
//        return responseDtos;
//    }
//}
