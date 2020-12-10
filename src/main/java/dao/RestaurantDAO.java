
package dao;

import models.FoodType;
import models.Restaurant;

import java.util.List;

public interface RestaurantDAO {
    //create
    void add (Restaurant restaurant);
    void addRestaurantToFoodType(Restaurant restaurant, FoodType foodType);

    //read
    List<Restaurant> getAll();
    Restaurant findById(int id);
     List<FoodType> getAllFoodTypesForARestaurant(int restaurantId);

    //update
    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    //delete
    void deleteById(int id);
    void clearAll();
}