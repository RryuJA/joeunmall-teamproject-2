package com.javateam.dummyProject.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.javateam.dummyProject.domain.ProductOptionVO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProductOptionDAO {
	
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String PRODUCT_OPTION_INSERT = "INSERT INTO product_option_tbl VALUES("
												+ "?, ?, ?)";		//상품옵션번호, 상품번호, 상품옵션
    
	public void insertProductOptionTBL(ProductOptionVO vo) {
		log.info("PRODUCT_OPTION_TBL INSERT");
		jdbcTemplate.update(PRODUCT_OPTION_INSERT, 
							vo.getProductOptionIndex(), vo.getProductIndex(), vo.getProductOptionValue());
		
	}
}
