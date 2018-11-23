package com.domain.country.entity;

import javax.persistence.Id;

public class Country {
    @Id
    private Integer id;
    private String  countryname;
    private String  countrycode;

    //省略 getter 和 setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}