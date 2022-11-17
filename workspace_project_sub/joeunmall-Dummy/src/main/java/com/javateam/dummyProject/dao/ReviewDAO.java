package com.javateam.dummyProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javateam.dummyProject.domain.ReviewVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author RJA
 */

@Repository
@Slf4j
public class ReviewDAO {
	
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String REVIEW_INSERT = "INSERT INTO review_tbl VALUES("
											+ "?, ?, ?, ?, ?)";		//리뷰번호, 상품번호, 주문번호, 리뷰작성일자, 리뷰내용		
	public void insertReviewTBL(ReviewVO vo) {
		log.info("REVIEW_TBL INSERT");
		jdbcTemplate.update(REVIEW_INSERT, 
							vo.getReviewIndex(), vo.getProductIndex(), vo.getOrderIndex(), 
							vo.getReviewDate(), vo.getReviewContent());
	}
	
}

