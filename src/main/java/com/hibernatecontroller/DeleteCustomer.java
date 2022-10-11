package com.hibernatecontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernatedto.Customer;

public class DeleteCustomer {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kruthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Customer customer = new Customer();
		customer = entityManager.find(customer.getClass(), 2);

		if (customer != null) {

			entityManager.getTransaction().begin();
			entityManager.remove(customer);
			System.out.println("Customer deleted sucessfully!!!");
			entityManager.getTransaction().commit();

		} else {

			System.out.println("No customer with specified Id!!!");

		}

		entityManager.close();
		entityManagerFactory.close();

	}

}
