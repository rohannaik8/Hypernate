package com.xworkz.hybernatedemo.Runner;

import com.xworkz.hybernatedemo.DAO.RestaurantDAO;
import com.xworkz.hybernatedemo.entity.ResturantEntity;

public class Tester{
	
	public static void main(String[] args) {
		ResturantEntity resturantEntity= new ResturantEntity();
		resturantEntity.setId(10);
		resturantEntity.setName("udupi");
		resturantEntity.setContactNo(456789123);
		resturantEntity.setRating(3.8);
		resturantEntity.setType("non-veg");
		
		RestaurantDAO restaurantDAO = new RestaurantDAO();
		restaurantDAO.saveRestaurant(resturantEntity);
		System.out.println("saves succefully");
	}
}
