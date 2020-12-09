package models;

import java.util.Objects;

public class Review{
    private String content;
    private String writtenBy;
    private int id;
    private int rating;
    private int restaurantId;//will be used to connect restaurant to Review (one-to-to-many)

    public Review(String content, String writtenBy, int rating, int restaurantId){
        this.content = content;
        this.restaurantId = restaurantId;
        this.rating = rating;
        this.writtenBy = writtenBy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWrittenBy() {
        return writtenBy;
    }

    public void setWrittenBy(String writtenBy) {
        this.writtenBy = writtenBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Review)) return false;
        Review review = (Review) o;
       return rating == review.rating &&
               id == review.id &&
               writtenBy == review.writtenBy &&
               Objects.equals (content, review.content) &&
               Objects.equals (writtenBy, review.writtenBy);
    }

    @Override
    public int hashCode(){
        return Objects.hash (content, id, rating, writtenBy, restaurantId);
    }
}