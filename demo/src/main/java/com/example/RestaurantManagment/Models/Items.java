package com.example.RestaurantManagment.Models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity


public class Items implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)

    private Long itemId ;

    private String itemName;

    private float price;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Categories category;

    @ManyToOne
    @JoinColumn(name="order_details_id")
    private OrderDetails orderDetails;

    public  Items() {}


    public Items( String itemName , float price)
    {
        this.itemId=itemId;
        this.price=price;
        this.itemName=itemName;


    }

    public long getItemID(){
        return  itemId;
    }
    public void setItemId(Long tableId){
        this.itemId=itemId;
    }

    public String getItemName(){
        return  itemName;
    }
    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public float getItemPrice(){
        return  price;
    }
    public void setItemPrice(float price){
        this.price=price;
    }



}

