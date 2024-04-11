package com.example.enterpriseindividuelllaboration.repositories;

import com.example.enterpriseindividuelllaboration.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
