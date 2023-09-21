package com.fornula.domain.payment.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;

import com.fornula.domain.payment.dto.Payments;
import com.fornula.domain.payment.repository.ItemPaymentSuccessRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PaymentsServiceImpl implements PaymentsService{
 
	private final ItemPaymentSuccessRepository itemPaymentSuccessRepository;
	
	@Override
	public void PaymentSalesSuccess(int itemIdx) {
		itemPaymentSuccessRepository.insertSalesItem(itemIdx);
		
	}

	@Override
	public void PaymentPurchaseSuccess(int itemIdx, int memberIdx) {
		itemPaymentSuccessRepository.insertPurchaseItem(itemIdx, memberIdx);
		
	}
	
	   //결제 확인 및 결제 취소를 위해 필요한 토큰을 제공받아 반환하는 메소드
	@Override
	public String getAccessToken(Payments payment) {
		
        String accessToken="";
		//토큰 발급을 요청하기 위한 api의 url주소
		String apiUrl="https://api.iamport.kr/users/getToken";
		
		//요청 api에게 전달될 값을 json 형식의 문자열로 저장
		String data="{\"imp_key\":\"3224055247302743\", \"imp_secret\":\"3wwm8hp4iifVWgCN0W38sfq1LV2ulJ3c9Pkv16HV80Ad4Fs5JkoGmyOgmkK45N0QXKbXNMQcpQ0J010s\"}";
		try {
			URL url = new URL(apiUrl);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoOutput(true);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-type", "application/json");
			
			try(OutputStream out=con.getOutputStream()) {
				byte[] requestData=data.getBytes("utf-8");
				out.write(requestData);
				out.close();
			}catch (Exception e) {
				e.printStackTrace();
		
			}
			int responseCode=con.getResponseCode();
			
			if(responseCode == 200) {
				BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
				String input="";
				String result="";
				while((input = br.readLine()) != null ) {
					result+= input;
				}
				br.close();
				
				System.out.println("result(Token) = "+result);
				
				JSONParser parser = new JSONParser();
				JSONObject jsonObject =(JSONObject)parser.parse(result);
				JSONObject responseObject =(JSONObject)jsonObject.get("response");
				accessToken=(String)responseObject.get("access_token");
				
			}
		  }	catch (Exception e) {
			  e.printStackTrace();
		}
		
		
		
		return accessToken;
		
	}
   //결제 완료 후 결제 정보 api를 요청하여 결제정보를 반환하는 메소드
	@Override
	public Payments getPayment(String accessToken, String impUid) {
		//응답결과를 저장하기 위한 객체 생성
		Payments payment1 = new Payments();
		
		String apiUrl="https://api.iamport.kr/payments/"+impUid;
		try {
			URL url = new URL(apiUrl);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			con.setRequestProperty("Authorization", accessToken);
			
			int responseCode=con.getResponseCode();

			if(responseCode == 200) {
				//응답결과를 제공받기 위한 입력스트림을 확장하여 저장
				BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
				
				//입력스트림으로 응답결과를 얻어와 저장
				String input="";
				String result="";
				while((input = br.readLine()) != null) {
					result+=input;
				}
				br.close();
			
				System.out.println("result(payment) = "+result);

				
				//응답결과(JSON 형식의 문자열)를 Java 객체로 변환하여 파싱 처리 
				JSONParser parser=new JSONParser();
				JSONObject jsonObject=(JSONObject)parser.parse(result);
	
				JSONObject responseObject=(JSONObject)jsonObject.get("response");
				
				payment1.setImpUid((String)responseObject.get("imp_uid"));
				payment1.setMerchantUid((String)responseObject.get("merchant_uid"));
				payment1.setAmount((Long)responseObject.get("amount"));
				payment1.setStatus((String)responseObject.get("status"));
				//payment1.setItemIdx((int) responseObject.get("item_idx"));
				
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return payment1;
	}

	@Override
	public String cancelPayment(String accessToken, Payments payment) {
		//결재 취소를 요청하기 위한 API의 URL 주소
				String apiUrl="https://api.iamport.kr/payments/cancel";
				//요청 API에게 전달될 값을 JSON 형식의 문자열로 표현하여 저장
				// => {"imp_uid" : 결재고유값, "checksum" : 취소금액} 
				String data="{\"imp_uid\":\""+payment.getImpUid()+"\", \"checksum\":\""+payment.getAmount()+"\"}";
				
				System.out.println(data);
				
				String returnValue="";
				try {
					URL url = new URL(apiUrl);
					HttpURLConnection con=(HttpURLConnection)url.openConnection();
					con.setDoOutput(true);//응답결과를 반환하기 위해 필드값 변경
					con.setRequestMethod("POST");//요청 방식을 변경하기 위해 필드값 변경
					con.setRequestProperty("Content-Type", "application/json");//전달값의 형식을 변경하기 위해 필드값 변경
					con.setRequestProperty("Authorization", accessToken);
					
					//API 요청에 필요한 값을 출력스트림을 제공받아 전달
					try(OutputStream out=con.getOutputStream()) {
						byte[] requestDate=data.getBytes("utf-8");
						out.write(requestDate);
						out.close();
					} catch (Exception e) {
						e.printStackTrace();
					}

					//응답코드를 반환받아 저장
					int responseCode=con.getResponseCode();

					if(responseCode == 200) {//정상적은 응답 결과를 제공받은 경우
						returnValue="success";	
					} else {
						returnValue="fail";	
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				return returnValue;
			}



}
