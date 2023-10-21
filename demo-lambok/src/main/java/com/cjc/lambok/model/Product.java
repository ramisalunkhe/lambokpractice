package com.cjc.lambok.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	private int productId;
	private String productName;
	private double productPrice;

}
