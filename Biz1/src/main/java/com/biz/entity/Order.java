package com.biz.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_ORDER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	@Id
	private int order_id;
	private String user_id;
	private String cafe_id;
	private Date time;
	private String menu_name;
	private int quantities;
	private String payment;
	private String status;

}
