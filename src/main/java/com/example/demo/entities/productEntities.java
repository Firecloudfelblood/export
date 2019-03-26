package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class productEntities {

    @Id
    public String id;
    public String item;
    public String price;
    public String productId;
    public String catId;
    public String oum;
    public productEntities(){}

    public productEntities(String item, String price, String productId, String catId, String oum) {
        this.item = item;
        this.price = price;
        this.productId = productId;
        this.catId = catId;
        this.oum = oum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getOum() {
        return oum;
    }

    public void setOum(String oum) {
        this.oum = oum;
    }

    @Override
    public String toString() {
        return "productEntities{" +
                "item='" + item + '\'' +
                ", price='" + price + '\'' +
                ", productId='" + productId + '\'' +
                ", catId='" + catId + '\'' +
                ", oum='" + oum + '\'' +
                '}';
    }
}
