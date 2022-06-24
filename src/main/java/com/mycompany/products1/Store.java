package com.mycompany.products1;

public class Store {

    private Products[][] shelving;

    public Store(int filas, int columnas) {
        shelving = new Products[filas][columnas];

    }

    public Store() {
        shelving = new Products[5][5];

    }

    public void addProducts(Products b) {

        boolean found = false;
        for (int i = 0; i < shelving.length && !found; i++) {
            for (int j = 0; j < shelving[0].length && !found; j++) {
                if (shelving[i][j] == null) {
                    shelving[i][j] = b;
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Producto añadido");
        } else {
            System.out.println("No se ha logrado añadir el producto");

        }

    }

    public void removeProducts(int code) {

        boolean found = false;
        for (int i = 0; i < shelving.length && !found; i++) {
            for (int j = 0; j < shelving[0].length && !found; j++) {
                if (shelving[i][j] != null) {
                    if (shelving[i][j].getCode() == code) {
                        shelving[i][j] = null;
                        found = true;
                    }
                }
            }
        }

        if (found) {
            System.out.println("Producto eliminado");
        } else {
            System.out.println("No existe el product");

        }

    }

    public void showProducts() {

        for (int i = 0; i < shelving.length; i++) {
            for (int j = 0; j < shelving[0].length; j++) {
                if (shelving[i][j] != null) {
                    System.out.println("fila: " + i + ", columna: " + j + " Productos: " + shelving[i][j].toString());
                }
            }
        }
    }

    public double CalculatePriceProducts() {

        double totalPrice = 0;
        for (int i = 0; i < shelving.length; i++) {
            for (int j = 0; j < shelving[0].length; j++) {
                if (shelving[i][j] != null) {
                    totalPrice += shelving[i][j].getPrice();
                }
            }
        }

        return totalPrice;
    }

    public double CalculatePriceProductsColumns(int columna) {

        double totalPrice = 0;
        if (columna >= 0 && columna <= shelving[0].length) {

            for (int i = 0; i < shelving.length; i++) {

                if (shelving[i][columna] != null) {
                    totalPrice += shelving[i][columna].getPrice();
                }
            }
        } else {
            System.out.println("La columna debe estar entre 0 y " + shelving[0].length);
        }

        return totalPrice;

    }
}
