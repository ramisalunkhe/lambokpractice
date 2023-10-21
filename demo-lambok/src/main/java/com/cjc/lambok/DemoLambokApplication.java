package com.cjc.lambok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cjc.lambok.model.Product;

@SpringBootApplication
public class DemoLambokApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLambokApplication.class, args);
		Product p=new Product(1,"fgf",1234);
		System.out.println(p);
	}

}
