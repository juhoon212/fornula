package com.fornula.domain.expert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
// �슦由� �뼱李⑦뵾 AJAX �궗�슜�븷嫄곕씪 �뿬湲곗꽑 �솗�씤�븯�뒗 �슜�룄濡쒕쭔 �옉�꽦�븿 異뷀썑�뿉 �뿬湲� �떦 蹂�寃쏀븷 寃� -> �븿
public class ExpertController {
	//�쟾臾멸� �룷�듃�뤃由ъ삤
	@RequestMapping(value = "/expertmypage")
	public String mypage() {
		log.info("ExpertController �겢�옒�뒪�쓽 mypage() 硫붿냼�뱶 �떎�뻾");
		return "expert-mypage";
	}	
}