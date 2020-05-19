package com.hyj.pojo;

public class Goods {
    private int id;
    private String name;
    private String price;
    private String time;

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public Goods() {
    }

    public Goods(String name, String price, String time) {
        this.name = name;
        this.price = price;
        this.time = time;
    }

    public Goods(int id, String name, String price, String time) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
