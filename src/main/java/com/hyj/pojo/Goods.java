package com.hyj.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import javax.xml.crypto.Data;
import java.util.Date;
public class Goods {

    private int id;
    private String name;
    private String price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date time;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", time=" + time +
                '}';
    }

    public Goods(String name, String price, Date time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public Goods(int id, String name, String price, Date time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public Goods() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
