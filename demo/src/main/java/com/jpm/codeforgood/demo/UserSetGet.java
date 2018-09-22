/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.codeforgood.demo;

/**
 *
 * @author ryankim
 */
public class UserSetGet {
    
     //List of all data variables from USERS
    private int user_id;
    private String name;
    private int age;
    private String gender;
    private String email_address;
    private String phone_number;
    private int zipcode;
    private int user_credit;

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setUser_credit(int user_credit) {
        this.user_credit = user_credit;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public int getZipcode() {
        return zipcode;
    }

    public int getUser_credit() {
        return user_credit;
    }  
}
