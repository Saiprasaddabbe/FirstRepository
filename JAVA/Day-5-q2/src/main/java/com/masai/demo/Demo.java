package com.masai.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Product;
import com.masai.utility.EMUtil;

public class Demo {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
//		Product product1 = new Product();
//		product1.setProductName("Shoes");
//		product1.setPrice(599);
//		product1.setQuantity(8);
//		
//		Product product2 = new Product();
//		product2.setProductName("Shirt");
//		product2.setPrice(499);
//		product2.setQuantity(8);
//		
//		Product product3 = new Product();
//		product3.setProductName("Jeans");
//		product3.setPrice(899);
//		product3.setQuantity(8);
//		
//		Product product4 = new Product();
//		product4.setProductName("T-shirt");
//		product4.setPrice(499);
//		product4.setQuantity(8);
//		
//		Product product5 = new Product();
//		product5.setProductName("blazer");
//		product5.setPrice(1500);
//		product5.setQuantity(8);
//		
//		
//		em.getTransaction().begin();
//		em.persist(product1);
//		em.persist(product2);
//		em.persist(product3);
//		em.persist(product4);
//		em.persist(product5);
//		em.getTransaction().commit();

//		 Query nq =  em.createNamedQuery("getProductNameAndQuantity");
//		
//		   List<Object[]> orr = nq.getResultList();
//		   for(Object[] or: orr) {
//			String ProductName = (String)or[0]; 
//			int ProductQuanity = (int)or[1];
//			System.out.println("Product Name : "+ProductName);
//			System.out.println("Product Quanity : "+ProductQuanity);
//			System.out.println("==============================");
//		}

//		Query nq = em.createNamedQuery("getProductPriceById");
//		nq.setParameter("pid", 10);
//		int price = (int) nq.getSingleResult();
//		   
//		System.out.println(price);

//		String jpql = "from Product where productId=:pid";
//		TypedQuery<Product> q = em.createQuery(jpql, Product.class);
//		q.setParameter("pid", 8);
//		Product product =  q.getSingleResult();
//
//		System.out.println(product);

//		String jpql = "select p.price from Product p";
//		TypedQuery<Integer> q = em.createQuery(jpql,Integer.class);
//
//		List<Integer> list = q.getResultList();
//		System.out.println(list);
//
//		String jpql = "select p.productName from Product p where p.quantity<5";
//		TypedQuery<String>q =   em.createQuery(jpql,String.class);
//		List<String> list = q.getResultList();
//		System.out.println(list);
		
		em.close();

	}

}