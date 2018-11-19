package com.teamsankya.electrafutura.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.teamsankya.electrafutura.dto.ProductInfoBean;


public class ProductDao {
	private static final Configuration CONFIGURATION = new Configuration();
	private static final SessionFactory FACTORY = CONFIGURATION
			.configure("hibernate.cfg.xml")
			.buildSessionFactory();

	   
		
		public List<ProductInfoBean> getAllProduct()
		 {      
			    Session session= FACTORY.openSession();
			    String hql = "from EmployeeInfoBean";
				Query<ProductInfoBean> query=session.createQuery(hql);
				List<ProductInfoBean> bean = query.list();
				session.close();
				return bean;                 
	      }
		
}


