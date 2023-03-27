package com.java.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        Vendor vendor1=new Vendor(10,"Hatrry");
        Vendor vendor2=new Vendor(20,"Amit");
        Vendor vendor3=new Vendor(30,"Gupta");
        Vendor vendor4=new Vendor(40,"Gupta");


        productsList.add(new Product(1,"HP Laptop",25000f,vendor1));
        productsList.add(new Product(2,"Dell Laptop",30000f,vendor1));
        productsList.add(new Product(3,"Lenevo Laptop",28000f,vendor2));
        productsList.add(new Product(4,"Sony Laptop",28000f,vendor3));
        productsList.add(new Product(5,"Apple Laptop",90000f,vendor4));

        System.out.println(productsList.stream().filter(c -> c.price>20000).map(p->p.price).collect(Collectors.toList()));
        //System.out.println(productsList.stream().flatMap(p->p.).collect(Collectors.toList()));

        //productsList.stream().filter(p->p.price>2000f).map(p->p.price).collect(Collectors.toList());
        List<Float> productPriceList2 =productsList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
    }
}
class Product{
    int id;
    String name;
    float price;
    Vendor vName;
    public Product(int id, String name, float price,Vendor vName) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.vName = vName;
    }

}
class Vendor {
    int vid;
    String vName;
    public Vendor(int vid,String vName){
        this.vid=vid;
        this.vName=vName;
    }
}