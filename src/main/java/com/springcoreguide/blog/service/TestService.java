package com.springcoreguide.blog.service;

import com.springcoreguide.blog.domain.Member;
import com.springcoreguide.blog.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TestService {
    final private MemberRepository memberRepository;

    public List<Member> getAllMembers(){
        return memberRepository.findAll();
    }
}
