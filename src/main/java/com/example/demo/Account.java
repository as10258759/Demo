package com.example.demo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "accounts")
@Entity
public class Account {

    private long userid;
    private String password;

    public Account() {

    }

    public Account(long userid, String password) {
        this.userid = userid;
        this.password = password;
    }


    @Id
    @Column(name = "userid", nullable = false)
    public long getUserid() {
        return userid;
    }
    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}