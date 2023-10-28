 package com.tnsif.jpaintro.inheritance.classpertable;

import javax.persistence.EntityManager;

import com.tnsif.hibernate.JPAIUtil;

public class Executor {
	public static void main(String[] args) {
		EntityManager em=JPAIUtil.getEntityManager();
		
		//add vehicle record
		Vehicle vobj=new Vehicle();
		vobj.setType("Four Wheeler");
		vobj.setModelNo(1234);
		vobj.setCompany("Ford");
		
		Vehicle vobjOne=new Vehicle();
		vobjOne.setType("Four Wheeler");
		vobjOne.setModelNo(4321);
		vobjOne.setCompany("Mahindra");
		
		Car carObjOne=new Car();
		carObjOne.setModelNo(222);
		carObjOne.setCompany("Honda");
		carObjOne.setFuelType("Petrol");
		carObjOne.setAverage(17);
		carObjOne.setPrice(100000);
		carObjOne.setType("Four Wheeler");
		
		em.getTransaction().begin();
		em.persist(vobj);
		em.persist(vobjOne);
		em.persist(carObjOne);
		em.getTransaction().commit();
		
	}
}
