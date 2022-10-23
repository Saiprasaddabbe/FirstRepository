package com.masai.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Collage;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {

		EntityManager em = EMUtil.providEntityManager();
        String jpql = "from Student where collage_collageId=1";
        Query q =  em.createQuery(jpql);
        List<Student> list=  q.getResultList();
       System.out.println(list);
        
        
	}

}
