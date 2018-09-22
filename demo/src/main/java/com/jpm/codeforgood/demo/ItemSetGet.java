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
public class ItemSetGet {
    //List of all data variables from ITEMS
    private int item_id; 
    private String item_type; 
    private float item_price; 
    private int item_quantity; 
    private String item_description;
    private String item_name;

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public void setItem_price(float item_price) {
        this.item_price = item_price;
    }

    public void setItem_quantity(int item_quantity) {
        this.item_quantity = item_quantity;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getItem_id() {
        return item_id;
    }

    public String getItem_type() {
        return item_type;
    }

    public float getItem_price() {
        return item_price;
    }

    public int getItem_quantity() {
        return item_quantity;
    }

    public String getItem_description() {
        return item_description;
    }

    public String getItem_name() {
        return item_name;
    }
    
    
}
