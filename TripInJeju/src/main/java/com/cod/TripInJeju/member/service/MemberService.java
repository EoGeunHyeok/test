package com.cod.TripInJeju.member.service;

import com.cod.TripInJeju.member.entity.Member;
import com.cod.TripInJeju.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public Member signup(String username, String password, String email, String nickname) {
        Member member = Member.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .email(email)
                .nickname(nickname)
                .createDate(LocalDateTime.now())
                .build();
        memberRepository.save(member);

        return member;
    }
}
