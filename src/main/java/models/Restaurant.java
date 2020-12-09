package models;

public class Restaurant {
    private String name;
    private String zipcode;
    private String email;
    private String address;
    private String website;
    private String phone;
    private int id;


    public Restaurant(String name, String zipcode, String email, String address, String website, String phone){
    this.name = name;
    this.zipcode = zipcode;
    this.email = email;
    this.address = address;
    this.website = website;
    this.phone = phone;

    }
}