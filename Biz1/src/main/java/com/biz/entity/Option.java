package com.biz.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TB_option")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Option {
	
	@Id
	private int order_id;
	private int quantities;
	private String hi;
	private String size;
	private String ice;

}
