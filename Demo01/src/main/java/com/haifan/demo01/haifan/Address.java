package com.haifan.demo01.haifan;

public class Address {
    private String provice;
    private String city;


    public Address() {
    }

    public Address(String provice, String city) {
        this.provice = provice;
        this.city = city;
    }

    /**
     * 获取
     * @return provice
     */
    public String getProvice() {
        return provice;
    }

    /**
     * 设置
     * @param provice
     */
    public void setProvice(String provice) {
        this.provice = provice;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "address{provice = " + provice + ", city = " + city + "}";
    }
}
