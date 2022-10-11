package com.hibernatecontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernatedto.Customer;

public class UpdateCustomer {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kruthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Customer customer = new Customer();
		customer = entityManager.find(customer.getClass(), 1);

		if (customer != null) {

			customer.setPhone(7829681657L);
			entityManager.getTransaction().begin();
			entityManager.merge(customer);
			entityManager.getTransaction().commit();

		} else {

			System.out.println("No customer with specified Id!!!");

		}

	}

}
