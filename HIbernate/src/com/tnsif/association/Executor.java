package com.tnsif.association;

import javax.persistence.EntityManager;

import com.tnsif.hibernate.JPAIUtil;

public class Executor {
	public static void main(String[] args) {
		EntityManager em=JPAIUtil.getEntityManager();
		
		Address addressObjOne=new Address();
		addressObjOne.setAddressId(1);
		addressObjOne.setCity("Nashik");
		addressObjOne.setState("Maharashtra");
		addressObjOne.setZipcode("422009");
		addressObjOne.setStreet("Kamatwade");
		
		Student studObjOne=new Student();
		studObjOne.setStudentId(1);
		studObjOne.setName("Ashutosh");
		studObjOne.setAddress(addressObjOne);
		
		em.getTransaction().begin();
		em.persist(addressObjOne);
		em.persist(studObjOne);
		em.getTransaction().commit();
		
		//find address
		Address addr=em.find(Address.class, 1);
		System.out.println(addr);
		
		
	}
}
