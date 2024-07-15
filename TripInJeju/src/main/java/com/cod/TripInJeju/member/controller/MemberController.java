package com.cod.TripInJeju.member.controller;


import com.cod.TripInJeju.member.form.MemberForm;
import com.cod.TripInJeju.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("/signup")
    public String showSignup() {
        return "member/signup";
    }

    @PostMapping("/signup")
    public String signup(@Valid MemberForm memberForm) {
        memberService.signup(memberForm.getUsername(), memberForm.getPassword(), memberForm.getEmail(), memberForm.getNickname());

        return "redirect:/member/login";
    }
}
