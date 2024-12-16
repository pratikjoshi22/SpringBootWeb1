package com.pratik.SpringBootWeb1.Model;

public class Alien {

    private String aname;
    private int aid;

    public String getAname() {
        return aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aname='" + aname + '\'' +
                ", aid=" + aid +
                '}';
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
}
