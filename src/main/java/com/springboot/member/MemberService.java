package com.springboot.member;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    public Member createMember(Member member){
        Member createdMember = member;
        return createdMember;

    }

    public Member updateMember(Member member){
        Member updatedMember= member;
        return updatedMember;
    }

    public Member findMember(long memberId){
        Member member = new Member(memberId,"daseul","daseul@naver.com","010-1234-1234");

        return member;
    }

    public List<Member> findMembers(){
       List<Member> members = List.of(
               new Member(1,"러키","lucky@gamil.com","010-3212-1231"),
               new Member(2,"겨울","winter@gamil.com","010-8282-7185"),
               new Member(3,"봄봄","spring@gamil.com","010-4333-4443")
       );
       return members;

    }

    public void deleteMember(long memberId){

    }
}
