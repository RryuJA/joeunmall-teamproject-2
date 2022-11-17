package com.javateam.dummyProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javateam.dummyProject.domain.OrderProductVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author RJA
 */

@Repository
@Slf4j
public class OrderProductDAO {
	
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String ORDER_PRODUCT_INSERT = "INSERT INTO order_product_tbl VALUES("
												+ "?, ?, ?, ?, ?)";		//주문상품번호, 고객번호, 상품번호, 상품옵션번호, 상품개수
	
	private final String ORDER_PRODUCT_SELECT_ALL = "SELECT * FROM order_product_tbl";
	
	private final String ORDER_PRODUCT_SELECT_FIRST_OPTION = "SELECT * FROM order_product_tbl WHERE SUBSTR(order_product_index, 20, 1) = 1";
	
	public void insertOrderProductTBL(OrderProductVO vo) {
		log.info("ORDER_PRODUCT_TBL INSERT");
		jdbcTemplate.update(ORDER_PRODUCT_INSERT, 
							vo.getOrderProductIndex(), vo.getUserIndex(), vo.getProductIndex(), 
							vo.getProductOptionIndex(), vo.getProductCount());
		
	}
	
	public List<OrderProductVO> selectOrderProductTBLAll() {
		log.info("ORDER_PRODUCT_TBL SELECT ALL DATA");
		
		List<OrderProductVO> vo = jdbcTemplate.query(ORDER_PRODUCT_SELECT_ALL, new RowMapper<OrderProductVO>() {
			@Override
			public OrderProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderProductVO orderProduct = new OrderProductVO();
				
				orderProduct.setOrderProductIndex(rs.getString(1));
				orderProduct.setUserIndex(rs.getString(2));
				orderProduct.setProductIndex(rs.getString(3));
				orderProduct.setProductOptionIndex(rs.getString(4));
				orderProduct.setProductCount(rs.getInt(5));

				return orderProduct;
			}
		});
		
		return vo;
	}
	
	public List<OrderProductVO> selectOrderProductTBLFirstOption() {
		log.info("ORDER_PRODUCT_TBL SELECT FIRST OPTION DATA");
		
		List<OrderProductVO> vo = jdbcTemplate.query(ORDER_PRODUCT_SELECT_FIRST_OPTION, new RowMapper<OrderProductVO>() {
			@Override
			public OrderProductVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderProductVO orderProduct = new OrderProductVO();
				
				orderProduct.setOrderProductIndex(rs.getString(1));
				orderProduct.setUserIndex(rs.getString(2));
				orderProduct.setProductIndex(rs.getString(3));
				orderProduct.setProductOptionIndex(rs.getString(4));
				orderProduct.setProductCount(rs.getInt(5));

				return orderProduct;
			}
		});
		
		return vo;
	}
	
}

