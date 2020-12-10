
package dao;

import models.FoodType;

import java.util.List;

public interface FoodtypeDAO {
    //create
    void add(FoodType foodtype);

    //void addFoodTypeToRestaurant(FoodType foodType, Restaurant restaurant);

    //read
    List<FoodType> getAll();
    // List<Restaurant> getAllRestaurantsForAFoodType(int id);

    //update
    //omit for now

    //delete
    void deleteById(int id);
    void clearAll();
}