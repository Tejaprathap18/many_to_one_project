package com.ty_many_to_one_uni.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ty_many_to_one_uni.dto.Branch;

public class BranchDAO {
		public EntityManager gEntityManager() {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vino");
			return entityManagerFactory.createEntityManager();
		}

	public void saveBranch(List<Branch> list) {
		EntityManager entityManager = gEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		for(Branch branch:list) {
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
		}
		
	}
}

