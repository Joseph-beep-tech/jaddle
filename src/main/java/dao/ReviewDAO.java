package dao;

import models.Review;

import java.util.List;

public interface ReviewDAO {
    //create
    void add(Review review);

    //read
    List<Review> getAll();
    List<Review> getAllReviewsByRestaurant(int restaurantId);

    //update
    //omit for now

    //delete
    void deleteById(int id);
    void clearAll();
}