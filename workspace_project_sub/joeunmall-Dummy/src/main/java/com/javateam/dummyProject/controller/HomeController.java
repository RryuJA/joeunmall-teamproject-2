package com.javateam.dummyProject.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javateam.dummyProject.service.UserService;
import com.javateam.dummyProject.dao.ProductDAO;
import com.javateam.dummyProject.dao.ProductImageDAO;
import com.javateam.dummyProject.dao.ProductOptionDAO;
import com.javateam.dummyProject.dao.UserDAO;
import com.javateam.dummyProject.domain.ProductImageVO;
import com.javateam.dummyProject.domain.ProductOptionVO;
import com.javateam.dummyProject.domain.ProductVO;
import com.javateam.dummyProject.domain.UserVO;
import com.javateam.dummyProject.service.InquiryService;
import com.javateam.dummyProject.service.OrderService;
import com.javateam.dummyProject.service.ProductImageService;
import com.javateam.dummyProject.service.ProductOptionService;
import com.javateam.dummyProject.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	private UserService userSvc;
	private ProductService productSvc;
	private ProductImageService productImageSvc;
	private ProductOptionService productOptionSvc;
	private InquiryService inquirySvc;

	private UserDAO userDAO;
	private ProductDAO productDAO;
	private ProductImageDAO productImageDAO;
	private ProductOptionDAO productOptionDAO;
	
	@Autowired
	public HomeController(UserService userSvc, ProductService productSvc, ProductImageService productImageSvc, 
						  ProductOptionService productOptionSvc, UserDAO userDAO, ProductDAO productDAO, 
						  ProductImageDAO productImageDAO, ProductOptionDAO productOptionDAO) {
		this.userSvc = userSvc;
		this.productSvc = productSvc;
		this.productImageSvc = productImageSvc;
		this.productOptionSvc = productOptionSvc;
		this.inquirySvc = inquirySvc;
		
		this.userDAO = userDAO;
		this.productDAO = productDAO;
		this.productImageDAO = productImageDAO;
		this.productOptionDAO = productOptionDAO;
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
		//inquirySvc.dummyData();
		
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
		
		//--------------------------------------------------------------------------------------------------
		
		return "home"; 
	}

}
