package com.teamsankya.electrafutura.mainclass;

import java.util.List;

import com.teamsankya.electrafutura.dao.ProductDao;
import com.teamsankya.electrafutura.dto.ProductInfoBean;

public class ProductMainClass {
	public static void main(String[] args)
	{
		ProductDao  dao = new ProductDao();
		 List<ProductInfoBean>bean=dao.getAllProduct();
		   for(ProductInfoBean bean2:bean)
		   {
			   System.out.println(bean2);
		   }
	}
}
