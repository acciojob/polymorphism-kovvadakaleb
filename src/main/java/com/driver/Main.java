package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y) {
            return 1;
        }
        public int product(int x, int y, int z) {
            return 1;
        }
        public double product(double x, double y) {
            return 1;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.product(20,30);
        p.product(20,30,40);
        p.product(20.0,30.0);
    }
}