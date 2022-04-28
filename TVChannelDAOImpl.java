package com.xworkz.tv.dao;

import com.xworkz.tv.entity.TVChannel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class TVChannelDAOImpl implements TVChannelDAO {

	public void saveChannel(TVChannel tvChannel) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction tx=null;
		try {
			factory= Persistence.createEntityManagerFactory("tv");
			entityManager = factory.createEntityManager();
			tx= entityManager.getTransaction();
			tx.begin();
			entityManager.persist(tvChannel);
			tx.commit();
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			if(entityManager !=null)
				entityManager.close();
		}
	}
	public void getChannel() {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;	
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("tv");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			TVChannel channel=entityManager.find(TVChannel.class, 2);
//			System.out.println("channel_id="+channel.getChannelId());
//			System.out.println("channel_name="+channel.getChannelName());
//			System.out.println("language="+channel.getLanguage());
//			System.out.println("cost="+channel.getPrice());
			System.out.println(channel.toString());
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
			e.printStackTrace();
		} finally {
			if (entityManager != null)
				entityManager.close();
		}
	}
}
