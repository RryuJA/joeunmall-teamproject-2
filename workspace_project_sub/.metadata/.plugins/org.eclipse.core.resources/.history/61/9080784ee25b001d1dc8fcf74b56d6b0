package com.javateam.dummyProject.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {
	
	public void testPrint() {
		System.out.println(makePaymentIndex());
		System.out.println(makeOrderDate());
		System.out.println(makeOrderName());
		System.out.println(makeOrderIndex());
	}

	private String[] paymentNum = {"PAY1", "PAY2", "PAY3"};
	
	/**
	 * 주문번호 형식 : ﻿000000_000
	 * '주문일자 6자리'_'주문일자의 주문순서 3자리'
	 * @return 주문번호
	 */
	private String makeOrderIndex() {
		SimpleDateFormat format = new SimpleDateFormat("yyMMdd");
		String result = format.format(makeOrderDate());
		
		return null;
	}
	
	/**
	 * 고객번호 형식 : 0000000
	 * '가입년도 4자리' (+) '해당년도 가입 순서 3자리'
	 * (FK)USER_TBL﻿
	 * @return 고객번호
	 */
	private String makeUserIndex() {
		return null;
	}
	
	/**
	 * 진행상태번호 형식 : STA0
	 * STA (+) '진행상태번호'  (진행상태번호는 1~9까지만 가능)
	 * (FK)ORDER_STATE_TBL
	 * @return 진행상태번호
	 */
	private String makeOrderStateIndex() {
		return null;
	}
	
	/**
	 * 결제유형번호 형식 : PAY0
	 * PAY (+) '결제유형번호'  (결제유형번호는 1~3까지만 가능)
	 * (FK)PAYMENT_TBL
	 * @return 결제유형번호
	 */
	private String makePaymentIndex() {
		String result = this.paymentNum[(int)(Math.random() * 3)];
		return result;
	}
	
	/** 
	 * @return 주문일자
	 * @throws ParseException 
	 */
	private Date makeOrderDate() {
			
		String result = "2022-";
		
		int month = (int)(Math.random() * 12 + 1);
		result += (month < 10 ? "0"+month+"-" : month+"-");
		
		int date = (int)(Math.random() * 30 + 1);
		result += (date < 10 ? "0"+date : date+"");
		
		System.out.println(result);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {	// parse 함수 사용 시 ParseException 처리 필요
			Date resultDate = format.parse(result);
			return resultDate;
		} catch(ParseException e) {
			System.out.println(e.getMessage());
		}
		
		return null;
	}
	
	/**
	 * 상품 금액 더한 값이 저장되어야함 (추후 추가)
	 * @return 총 금액
	 */
	private int makeOrderPrice() {
		return 0;
	}
	
	/**
	 * @return 수령인
	 */
	private String makeOrderName() {
		String name = "";
		
		String first[] = {"김","이","박","최","주","임","엄","성","남궁","독고","황","황보","송","오","유","류","윤","장","정","추"};  
        String middle[] = {"","숙","갑","영","순","선","원","우","이","운","성"};  
    	String last[] = {"영","수","희","빈","민","정","순","주","연","영"}; 
    	
    	name = first[(int)Math.floor(Math.random() * first.length)];
		name += middle[(int)Math.floor(Math.random() * middle.length)];
		name += last[(int)Math.floor(Math.random() * last.length)];
		
		return name;
	}
	
	/**
	 * @return 우편번호
	 */
	private String makeOrderPost() {
		return null;
	}
	
	/**
	 * @return 주소
	 */
	private String makeOrderAddress() {
		return null;
	}
	
	/**
	 * @return 상세주소
	 */
	private String makeOrderAddressDetail() {
		return null;
	}
	
	/**
	 * @return 연락처
	 */
	private String makeOrderMobile() {
		return null;
	}
	
	/**
	 * @return 배송메시지
	 */
	private String makeOrderMessage() {
		return null;
	}
	
}
