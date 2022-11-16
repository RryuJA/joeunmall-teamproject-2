package com.javateam.dummyProject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javateam.dummyProject.domain.OrderVO;

import lombok.extern.slf4j.Slf4j;

/**
 * @author RJA
 */

@Repository
@Slf4j
public class OrderDAO {
	
	private JdbcTemplate jdbcTemplate;
	
    @Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	private final String ORDER_INSERT = "INSERT INTO order_tbl VALUES("
										+ "?, ?, ?, ?, ?, "		//주문번호, 고객번호, 진행상태번호, 결제유형번호, 주문일자
										+ "?, ?, ?, ?, ?, "		//총액, 수령인, 우편번호, 주소, 상세주소
										+ "?, ?)";				//연락처, 배송메시지

	private final String ORDER_SELECT_ALL = "SELECT * FROM order_tbl";
	
	public void insertOrderTBL(OrderVO vo) {
		log.info("ORDER_TBL INSERT");
		jdbcTemplate.update(ORDER_INSERT, 
							vo.getOrderIndex(), vo.getUserIndex(), vo.getOrderStateIndex(), vo.getPaymentIndex(),
							vo.getOrderDate(), vo.getOrderPrice(), vo.getOrderName(), vo.getOrderPost(), 
							vo.getOrderAddress(), vo.getOrderAddressDetail(), vo.getOrderMobile(), vo.getOrderMessage());
	}
	
	public List<OrderVO> selectOrderTBLAll() {
		log.info("ORDER_TBL SELECT ALL DATA");
		
		List<OrderVO> vo = jdbcTemplate.query(ORDER_SELECT_ALL, new RowMapper<OrderVO>() {
			@Override
			public OrderVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				OrderVO orderProduct = new OrderVO();
				
				orderProduct.setOrderIndex(rs.getString(1));
				orderProduct.setUserIndex(rs.getString(2));
				orderProduct.setOrderStateIndex(rs.getString(3));
				orderProduct.setPaymentIndex(rs.getString(4));
				orderProduct.setOrderDate(rs.getDate(5));
				orderProduct.setOrderPrice(rs.getInt(6));
				orderProduct.setOrderName(rs.getString(7));
				orderProduct.setOrderPost(rs.getString(8));
				orderProduct.setOrderAddress(rs.getString(9));
				orderProduct.setOrderAddressDetail(rs.getString(10));
				orderProduct.setOrderMobile(rs.getString(11));
				orderProduct.setOrderMessage(rs.getString(12));

				return orderProduct;
			}
		});
		
		return vo;
	}
	
}

