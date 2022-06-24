package com.mycompany.products1;

public class Contruction extends Products {

    private String brush;

    public Contruction(String brush, double quantity, double price) {
        super(quantity, price);
        this.brush = brush;
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    @Override
    public String toString() {
        return super.toString() + "brush=" + brush;
    }

}
