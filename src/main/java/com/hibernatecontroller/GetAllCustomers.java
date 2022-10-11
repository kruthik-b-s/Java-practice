package com.hibernatecontroller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernatedto.Customer;

public class GetAllCustomers {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kruthik");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Query query = entityManager.createQuery("from Customer");

		List<Customer> list = query.getResultList();

		for (Customer li : list) {
			System.out.println(li);
			System.out.println("-----------------------");
		}

	}

}
