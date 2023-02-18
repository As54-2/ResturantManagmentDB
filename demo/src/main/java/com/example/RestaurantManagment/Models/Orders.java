package com.example.RestaurantManagment.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)

    private Long orderId ;
    private  Float total;

    private OrderDetails orderDetails;



    public  Orders() {}


    public Orders(float total ,OrderDetails orderDetails )
    {
        this.total=total;
        this.orderDetails=orderDetails;
        this.orderId=orderId;


    }

    public long getOrderID(){
        return  orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId=orderId;
    }

    public Float getOrderTotal (){
        return total;
    }
    public void setOrderTotal(float total){
        this.total=total;
    }

    public OrderDetails getOrderDetails (){
        return orderDetails;
    }
    public void setOrderDetails(OrderDetails orderDetails){
        this.orderDetails=orderDetails;
    }




}
