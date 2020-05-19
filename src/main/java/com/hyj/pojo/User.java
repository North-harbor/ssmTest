package com.hyj.pojo;

public class User {
    private int id;
    private String stuName;
    private int stuAge;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }

    public User() {
    }

    public User(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public User(int id, String stuName, int stuAge) {
        this.id = id;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
}
