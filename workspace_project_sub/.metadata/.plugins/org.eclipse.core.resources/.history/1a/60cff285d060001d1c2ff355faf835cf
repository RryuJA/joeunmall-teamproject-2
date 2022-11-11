package com.javateam.dummyProject.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javateam.dummyProject.domain.ProductImageVO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProductImageDAO {
	
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String PRODUCT_IMAGE_INSERT = "INSERT INTO product_image_tbl VALUES("
												+ "?, ?, ?)";		//상품이미지번호, 상품번호, 상품상세이미지경로
    
	public void insertProductImageTBL(ProductImageVO vo) {
		log.info("PRODUCT_IMAGE_TBL INSERT");
		jdbcTemplate.update(PRODUCT_IMAGE_INSERT, 
							vo.getProductImageIndex(), vo.getProductIndex(), vo.getProductDetailImage());
		
	}
}
