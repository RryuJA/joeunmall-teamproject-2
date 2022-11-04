package com.javateam.dummyProject.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.javateam.dummyProject.service.UserService;
import com.javateam.dummyProject.service.OrderService;
import com.javateam.dummyProject.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	
	@Autowired
	UserService userSvc;
	
	@Autowired
	ProductService productSvc;
	//OrderService orderSvc;
	
	@GetMapping("/")
	public String home(Model model) throws ClassNotFoundException, IOException {
		
		//log.info("home");
		
		//직렬화
		//userSvc.dummyData();
		//productSvc.crawlProducts();
		
		//역직렬화
		model.addAttribute("userList", userSvc.getUserListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\UserListDummy.ser"));
		model.addAttribute("prList", productSvc.getProductListFromSerFile("C:\\joeunmall-teamproject2\\workspace_project_sub\\joeunmall-Dummy\\src\\main\\resources\\ser\\ProductListDummy.ser"));
		
		return "home"; 
	}

}
