package com.example.enterpriseindividuelllaboration.Services;

import com.example.enterpriseindividuelllaboration.entities.Member;
import com.example.enterpriseindividuelllaboration.exceptions.ResourceNotFoundException;
import com.example.enterpriseindividuelllaboration.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService implements MemberServiceInterface {
    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member getMemberById(int id) {
        return memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Member", "id", id));
    }



    @Override
    public Member addNewMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member updateMember(Member member) {
        Member excistingMember = memberRepository.findById(member.getId()).orElseThrow(() -> new ResourceNotFoundException("Member", "id", member.getId()));
        excistingMember.setFirstName(member.getFirstName());
        excistingMember.setLastName(member.getLastName());
        excistingMember.setAddress(member.getAddress());
        excistingMember.setEmail(member.getEmail());
        excistingMember.setPhone(member.getPhone());
        excistingMember.setDateOfBirth(member.getDateOfBirth());
        return memberRepository.save(excistingMember);
    }

    @Override
    public void deleteMember(int id) {
        memberRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Member", "id", id));
        memberRepository.deleteById(id);
    }
}
