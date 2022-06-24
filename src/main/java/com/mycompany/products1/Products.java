
package com.mycompany.products1;


public class Products {
    
    private static int codeid=1;
   
    private int code;
    private double price;
    private double quantity;
    
    public Products(double quantity,double price){
        
        this.code=codeid++;
        
        this.quantity=quantity;
        this.price=price;
   
    } 

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  "code=" + code + ", price=" + price + ", quantity=" + quantity + " ";
    }
    

    
    
}