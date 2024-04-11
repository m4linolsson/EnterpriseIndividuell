package com.example.enterpriseindividuelllaboration.Services;

import com.example.enterpriseindividuelllaboration.entities.Member;

import java.util.List;

public interface MemberServiceInterface {

    List<Member> getAllMembers();

    Member getMemberById(int id);

    Member addNewMember(Member member);

    Member updateMember(Member member);

    void deleteMember(int id);
}
