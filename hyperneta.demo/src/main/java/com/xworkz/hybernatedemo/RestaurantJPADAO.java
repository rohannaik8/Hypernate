package com.xworkz.hybernatedemo;



import com.xworkz.hybernatedemo.entity.ResturantEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RestaurantJPADAO {
	
	public void saveRestaurant(ResturantEntity entity) {

		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );
        
		 EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	      entitymanager.persist(entity);
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );

}

}
