package com.iit.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iit.model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

	Member findByEmail(String email);
}
