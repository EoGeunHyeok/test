package com.cod.TripInJeju.member.repository;


import com.cod.TripInJeju.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByUsername(String username);
    boolean existsByLoginId(String loginId);

    Member findByLoginId(String loginId);

    Optional<Member> findByNickname(String nickname);
}