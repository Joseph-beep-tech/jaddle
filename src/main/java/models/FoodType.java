package models;

import java.util.Objects;

public class FoodType{
    private String name;
    private int id;

    public FoodType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if(this ==  o) return true;
        if (!(o instanceof FoodType)) return false;
        FoodType foodType = (FoodType) o;
        return id == foodType.id &&
                Objects.equals (name, foodType.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash (id, name);
    }
}
