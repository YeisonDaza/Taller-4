package com.mycompany.products1;

public class Electric extends Products {

    private double percentageEletric;
    private boolean promotion;

    public Electric(double percentageEletric, boolean promotion, double quantity, double price) {
        super(quantity, price);
        this.percentageEletric = percentageEletric;
        this.promotion = promotion;
    }

    public double getPercentageEletric() {
        return percentageEletric;
    }

    public void setPercentageEletric(double percentageEletric) {
        this.percentageEletric = percentageEletric;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public double getPrice() {
        if (isPromotion()) {
            return super.getPrice()* 0.9;
        } else {
            return super.getPrice();

        }

    }

    @Override
    public String toString() {
        return super.toString() + "percentageEletric=" + percentageEletric + ", promotion=" + promotion;
    }

}
