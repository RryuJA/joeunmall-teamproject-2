package com.javateam.dummyProject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javateam.dummyProject.service.UserService;
import com.javateam.dummyProject.dao.InquiryDAO;
import com.javateam.dummyProject.dao.OrderDAO;
import com.javateam.dummyProject.dao.OrderProductDAO;
import com.javateam.dummyProject.dao.ProductDAO;
import com.javateam.dummyProject.dao.ProductImageDAO;
import com.javateam.dummyProject.dao.ProductOptionDAO;
import com.javateam.dummyProject.dao.ReviewDAO;
import com.javateam.dummyProject.dao.UserDAO;
import com.javateam.dummyProject.domain.InquiryVO;
import com.javateam.dummyProject.domain.OrderProductVO;
import com.javateam.dummyProject.domain.OrderVO;
import com.javateam.dummyProject.domain.ProductImageVO;
import com.javateam.dummyProject.domain.ProductOptionVO;
import com.javateam.dummyProject.domain.ProductVO;
import com.javateam.dummyProject.domain.ReviewVO;
import com.javateam.dummyProject.domain.UserVO;
import com.javateam.dummyProject.service.InquiryService;
import com.javateam.dummyProject.service.OrderProductService;
import com.javateam.dummyProject.service.OrderService;
import com.javateam.dummyProject.service.ProductImageService;
import com.javateam.dummyProject.service.ProductOptionService;
import com.javateam.dummyProject.service.ProductService;
import com.javateam.dummyProject.service.ReviewService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	private UserService userSvc;
	private ProductService productSvc;
	private ProductImageService productImageSvc;
	private ProductOptionService productOptionSvc;
	private OrderProductService orderProductSvc;
	private OrderService orderSvc;
	private InquiryService inquirySvc;
	private ReviewService reviewSvc;

	private UserDAO userDAO;
	private ProductDAO productDAO;
	private ProductImageDAO productImageDAO;
	private ProductOptionDAO productOptionDAO;
	private OrderProductDAO orderProductDAO;
	private OrderDAO orderDAO;
	private InquiryDAO inquiryDAO;
	private ReviewDAO reviewDAO;
	
	@Autowired
	public HomeController(UserService userSvc, ProductService productSvc, ProductImageService productImageSvc, ProductOptionService productOptionSvc, 
						  OrderProductService orderProductSvc, OrderService orderSvc, InquiryService inquirySvc, ReviewService reviewSvc,
						  UserDAO userDAO, ProductDAO productDAO, ProductImageDAO productImageDAO, ProductOptionDAO productOptionDAO, 
						  OrderProductDAO orderProductDAO, OrderDAO orderDAO, InquiryDAO inquiryDAO, ReviewDAO reviewDAO) {
		this.userSvc = userSvc;
		this.productSvc = productSvc;
		this.productImageSvc = productImageSvc;
		this.productOptionSvc = productOptionSvc;
		this.orderProductSvc = orderProductSvc;
		this.orderSvc = orderSvc;
		this.inquirySvc = inquirySvc;
		this.reviewSvc = reviewSvc;
		
		this.userDAO = userDAO;
		this.productDAO = productDAO;
		this.productImageDAO = productImageDAO;
		this.productOptionDAO = productOptionDAO;
		this.orderProductDAO = orderProductDAO;
		this.orderDAO = orderDAO;
		this.inquiryDAO = inquiryDAO;
		this.reviewDAO = reviewDAO;
	}
	
	@GetMapping("/")
	public String home(Model model) throws ClassNotFoundException, IOException {
		
		//log.info("home");
		
		//--------------------------------------------------------------------------------------------------
		
		// 직렬화 (실행X)
		//userSvc.dummyData();
		//productSvc.crawlProducts();
		//productImageSvc.dummyData();
		//productOptionSvc.dummyData();
		
		// OrderProductService: 고객번호, 상품번호, 상품옵션번호 필요
		/*orderProductSvc.setUserDummy(userDAO.selectUserTBLRandom());
		orderProductSvc.setProductDummy(productDAO.selectProductTBLRandom());
		orderProductSvc.dummyData();*/
		
		//OrderService: 고객번호, 진행상태번호, 결제유형번호 필요
		/*orderSvc.setUserDummy(userDAO.selectUserTBLAll());
		orderSvc.setProductDummy(productDAO.selectProductTBLAll());
		orderSvc.setOrderProductDummy(orderProductDAO.selectOrderProductTBLAll());
		orderSvc.dummyData();*/
		
		//InquiryService: 고객번호 필요
		/*inquirySvc.setUserDummy(userDAO.selectUserTBLRandom());
		inquirySvc.dummyData();*/
		
		//ReviewService: 상품번호, 주문번호 필요
		/*reviewSvc.setProductDummy(productDAO.selectProductTBLAll());
		reviewSvc.setOrderDummy(orderDAO.selectOrderTBLAll());
		reviewSvc.setOrderProductDummy(orderProductDAO.selectOrderProductTBLFirstOption());
		reviewSvc.dummyData();*/
		
		//--------------------------------------------------------------------------------------------------
		
		// 역직렬화 후 화면에 출력
		//model.addAttribute("userList", userSvc.getUserListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\UserListDummy.ser"));
		//model.addAttribute("prList", productSvc.getProductListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductListDummy.ser"));
		//model.addAttribute("prImageList", productImageSvc.getProductImageListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductImageListDummy.ser"));
		//model.addAttribute("prOptionList", productOptionSvc.getProductOptionListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductOptionListDummy.ser"));
		
		//--------------------------------------------------------------------------------------------------
		
		// 역직렬화 후 더미데이터 삽입 (한번만 실행가능, 여러번 실행X)
		// 한번 실행한 이후 다시 실행시, PK중복으로 오류발생함
		
		// UserVO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\UserListDummy.ser
		/*List<UserVO> userList = userSvc.getUserListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\UserListDummy.ser"); 
		for(int i=0; i<userList.size(); i++) {
			userDAO.insertUserTBL(userList.get(i));
		}*/
		
		// ProductVO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductListDummy.ser
		/*List<ProductVO> productList = productSvc.getProductListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductListDummy.ser");
		for(int i=0; i<productList.size(); i++) {
			productDAO.insertProductTBL(productList.get(i));
		}*/
		
		// ProductImageDAO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductImageListDummy.ser
		/*List<ProductImageVO> productImageList = productImageSvc.getProductImageListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductImageListDummy.ser"); 
		for(int i=0; i<productImageList.size(); i++) {
			productImageDAO.insertProductImageTBL(productImageList.get(i));
		}*/
		
		// ProductOptionDAO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductOptionListDummy.ser
		/*List<ProductOptionVO> productOptionList = productOptionSvc.getProductOptionListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductOptionListDummy.ser"); 
		for(int i=0; i<productOptionList.size(); i++) {
			productOptionDAO.insertProductOptionTBL(productOptionList.get(i));
		}*/
		
		// OrderProductDAO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\OrderProductListDummy.ser
		/*List<OrderProductVO> orderProductList = orderProductSvc.getOrderProductListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\OrderProductListDummy.ser"); 
		for(int i=0; i<orderProductList.size(); i++) {
			orderProductDAO.insertOrderProductTBL(orderProductList.get(i));
		}*/
		
		// OrderDAO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\OrderListDummy.ser
		/*List<OrderVO> orderList = orderSvc.getOrderListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\OrderListDummy.ser"); 
		for(int i=0; i<orderList.size(); i++) {
			orderDAO.insertOrderTBL(orderList.get(i));
		}*/
		
		// InquiryDAO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\InquiryListDummy.ser
		/*List<InquiryVO> inquiryList = inquirySvc.getInquiryListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\InquiryListDummy.ser"); 
		for(int i=0; i<inquiryList.size(); i++) {
			inquiryDAO.insertInquiryTBL(inquiryList.get(i));
		}*/
		
		// ReviewDAO
		// C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ReviewListDummy.ser
		/*List<ReviewVO> reviewList = reviewSvc.getReviewListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ReviewListDummy.ser"); 
		for(int i=0; i<reviewList.size(); i++) {
			reviewDAO.insertReviewTBL(reviewList.get(i));
		}*/
		
		//--------------------------------------------------------------------------------------------------
		
		// UserTBL에 저장된 데이터 1개 랜덤 추출 (테스트 출력)
		//model.addAttribute("userList", userDAO.selectUserTBLRandom());
		
		return "home"; 
	}

}
