package com.fornula.domain.item.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fornula.domain.item.dto.Item;
import com.fornula.domain.item.dto.ItemPayment;
import com.fornula.domain.item.service.ItemPaymentService;
import com.fornula.domain.item.service.ItemPaymentSuccessService;
import com.fornula.domain.member.dto.Member;
import com.fornula.domain.member.dto.mypage.InfoCategory;
import com.fornula.domain.util.session.SessionConst;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class PaymentSuccessController {

	 private final ItemPaymentSuccessService service;
	 
		
		@GetMapping("/paymentSuccess/{itemIdx}")
		public String postPayment(@PathVariable Integer itemIdx, HttpSession session, Model model) {
			
			log.info("itemIdx = {}", itemIdx);
			
			Member member = (Member)session.getAttribute(SessionConst.Login_Member);
			log.info("member.getId() = {}", member.getId());
			
			
			service.PaymentSalesSuccess(itemIdx);
			
		    service.PaymentPurchaseSuccess(itemIdx,member.getMemberIdx());
			 
		    model.addAttribute("message", "결제 성공하였습니다.");
		    
		    return "common-success"; 
		} 
		
		@GetMapping("/cls/jq/kakaopay.cls")
		@ResponseBody
		public String kakaopay() {
			try {
				URL address = new URL("https://kapi.kakao.com/v1/payment/ready");
				HttpURLConnection con = (HttpURLConnection) address.openConnection();
				con.setRequestMethod("POST");
				con.setRequestProperty("Authorization", "KakaoAK 61cb5bab7894790f4ed89cdbfa64e868");
				con.setRequestProperty("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
				con.setDoOutput(true);
			    String parameter="cid=TC0ONETIME&partner_order_id=partner_order_id&partner_user_id=partner_user_id&item_name=초코파이&quantity=1&total_amount=2200&tax_free_amount=0&approval_url=https://localhost/cls/jq/pay.cls"
						+ "&cancel_url=https://localhost/cancel&fail_url=https://localhost/fail";
			    OutputStream out = con.getOutputStream();
			    DataOutputStream dataOut = new DataOutputStream(out);
			    dataOut.writeBytes(parameter);
			    dataOut.close();
			    
			    int resultCode = con.getResponseCode();
			    
			    InputStream in;
			    if(resultCode ==200) {
			    	in = con.getInputStream();
			    	
			    }else {
			    	in = con.getErrorStream();
			    }
			    InputStreamReader reader = new InputStreamReader(in);
			    BufferedReader bufferedReader = new BufferedReader(reader);
			    return bufferedReader.readLine();
			    
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		    return "{\"result\":\"NO\"}"; 
		}
		
	}


