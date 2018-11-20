package com.teamsankya.electrafutura.controller;

import java.io.IOException;
import java.util.List;

import javax.transaction.TransactionScoped;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.teamsankya.electrafutura.dto.ProductInfoBean;
import com.teamsankya.electrafutura.util.ProductServiceManager;

@Controller
public class ProductController {
	@Autowired
	@Qualifier("service")
	private ProductServiceManager service;
	

	final static Logger LOGGER = Logger.getLogger(ProductController.class);
	@RequestMapping(path = "/search",method = RequestMethod.POST)
	public String getProduct(ModelMap map,@RequestParam(name="productName") String productName) throws IOException {
		
		LOGGER.info("inside ProductController");
		LOGGER.info(productName);

		List<ProductInfoBean> bean = service.getProduct(productName);
		map.addAttribute("productbean", bean);
		if(bean.size() ==0) {

			LOGGER.info(" inside failure block");
			return "failure";
		}
		LOGGER.info("The product : "+bean);
		LOGGER.info("inside success block");
		
		
		return "success";

	}

}


