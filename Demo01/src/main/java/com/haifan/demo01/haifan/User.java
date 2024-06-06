package com.haifan.demo01.haifan;

public class User {
    private String name;
    private String age;
    private Address address;

    public User() {
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }


    /**
     * 获取
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "User{name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
