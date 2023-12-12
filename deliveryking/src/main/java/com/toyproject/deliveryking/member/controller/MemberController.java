package com.toyproject.deliveryking.member.controller;

import com.toyproject.deliveryking.member.service.MemberServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MemberController {

    private final MemberServiceImpl service;

    public void signup() {
        service.signup();
    }
}
