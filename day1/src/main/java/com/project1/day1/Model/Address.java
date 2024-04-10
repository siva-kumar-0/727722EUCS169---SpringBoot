package com.project1.day1.Model;

public class Address 
{
    String name,streetname,pincode;
    int dn;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStreetname() {
        return streetname;
    }
    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }
    public String getPincode() {
        return pincode;
    }
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
    public int getDn() {
        return dn;
    }
    public void setDn(int dn) {
        this.dn = dn;
    }
    public Address(String name, String streetname, String pincode, int dn) {
        this.name = name;
        this.streetname = streetname;
        this.pincode = pincode;
        this.dn = dn;
    }
    

}
