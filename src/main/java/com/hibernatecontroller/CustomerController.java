package com.hibernatecontroller;

import javax.persistence.*;

import com.hibernatedto.Customer;

public class CustomerController {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kruthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Customer customer = new Customer();
		// Id generated automatically by Entity annotated class
		customer.setAge(22);
		customer.setEmail("sumanthgowda07@gmail.com");
		customer.setName("Sumanth");
		customer.setPhone(9332213219L);

		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
