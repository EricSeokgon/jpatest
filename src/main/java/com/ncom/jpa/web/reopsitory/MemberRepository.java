package com.ncom.jpa.web.reopsitory;

import com.ncom.jpa.web.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findMemberByName(String name);
    //Member findMemberByName(@Param("name") String memberName);
}
