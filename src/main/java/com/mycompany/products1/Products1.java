package com.mycompany.products1;

public class Products1 {

    public static void main(String[] args) {

        Store a = new Store();

        Products b;

        //Añado bebidas (un poco de todo)
        //La forma de hacerlo es opcional
        for (int i = 0; i < 10; i++) {
            switch (i % 2) {
                case 0:
                    b = new Contruction("brush", 15, 15000);
                    a.addProducts(b);
                    break;
                case 1:
                    b = new Electric(0.2, true, 15, 10000);
                    a.addProducts(b);
                    break;
            }
        }

        //Muestro las bebidas
        a.showProducts();

        //Calculo el precio de todas las bebidas
        System.out.println("Precio de todos los productos: " + a.CalculatePriceProducts());

        //Elimino una bebida en concreto
        a.removeProducts(2);

        //Muestro las bebidas
        a.showProducts();
        System.out.println("Precio de todos los productos:" + a.CalculatePriceProducts());

    }

}
