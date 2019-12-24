package com.example.demo;

import javax.persistence.*;

@Table(name = "onlineaccounts")
@Entity
public class OnlineAccount {

    private long userid;
    private String password;


    public OnlineAccount() {

    }
    public OnlineAccount(long userid, String password) {
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
