package com.ty_many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_many_to_one_uni.dto.Bank;

public class BankDAO {
	

	public void saveBank(Bank bank) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vino");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityManager entityManager = gEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bank);
		entityTransaction.commit();

	}
	
//	public void updateBank(Bank bank,int id) {
//		EntityManager entityManager = gEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		entityManager.find(Bank.class, bank.getId())
//	}
}
