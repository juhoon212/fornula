package com.fornula.domain.member.service;

import org.springframework.stereotype.Service;

import com.fornula.domain.member.repository.MypageInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MypageInfoServiceImpl {
   private final MypageInfoRepository mypageInfoRepository;
   
}
