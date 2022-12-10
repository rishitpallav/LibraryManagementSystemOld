package com.iit.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iit.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

	Member findByEmail(String email);
	
	@Query(value = "SELECT * FROM member WHERE email = ?1", nativeQuery = true)
	public Member selectMemberByEmail(String email);
}
