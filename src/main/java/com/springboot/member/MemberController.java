package com.springboot.member;

import com.springboot.member.mapstruct.MemberMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/v1/members")
@Validated
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper memberMapper;

    public MemberController(MemberService memberService,MemberMapper memberMapper) {
        this.memberService = memberService;
        this.memberMapper = memberMapper;
    }

    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberPostDto) {

//        Member member = new Member();
//        member.setEmail(memberDto.getEmail());
//        member.setName(memberDto.getName());
//        member.setPhone(memberDto.getPhone());
        Member member = memberMapper.memberPostDtoToMember(memberPostDto);

        Member response = memberService.createMember(member);
        return new ResponseEntity<>(mapper.memberToMemberResponseDto(response), HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Min(1) long memberId,
                                      @Valid @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);

        Member member = memberMapper.memberPatchDtoToMember(memberPatchDto);
//        member.setMemberId(memberPatchDto.getMemberId());
//        member.setName(memberPatchDto.getName());
//        member.setPhone(memberPatchDto.getPhone());

        Member response = memberService.updateMember(member);

        // No need Business logic
        MemberResponseDto responseDto = memberMapper.memberToMemberResponseDto(response);

        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") @Min(1) long memberId) {
        System.out.println("# memberId: " + memberId);

        Member response = memberService.findMember(memberId);

        MemberResponseDto responseDto = memberMapper.memberToMemberResponseDto(response);


        // not implementation
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");
        List<Member> response = memberService.findMembers();

        // not implementation
//        List<MemberResponseDto> responseDtos = new ArrayList<>();
//        for(Member member : response){
//            MemberResponseDto responseDto = memberMapper.memberToMemberResponseDto(member);
//            responseDtos.add(responseDto);
//        }\

        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") @Min(1) long memberId) {
        System.out.println("# memberId: " + memberId);
        // No need business logic
        memberService.deleteMember(memberId);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    // 회원 정보는 구현해야 할 실습이 없습니다!
}
