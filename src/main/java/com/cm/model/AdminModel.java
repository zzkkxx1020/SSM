package com.cm.model;

public class AdminModel {
    private int admin_id;
    private String admin_name;
    private int admin_pwd;
    private int admin_power;
    private String admin_location;

    public int getAdmin_id() {
        return admin_id;
    }
    public String getAdmin_name() {
        return admin_name;
    }

    public int getAdmin_pwd() {
        return admin_pwd;
    }

    public int getAdmin_power() {
        return admin_power;
    }

    public String getAdmin_location() {
        return admin_location;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public void setAdmin_pwd(int admin_pwd) {
        this.admin_pwd = admin_pwd;
    }

    public void setAdmin_power(int admin_power) {
        this.admin_power = admin_power;
    }

    public void setAdmin_location(String admin_location) {
        this.admin_location = admin_location;
    }

    public AdminModel(int admin_id, String admin_name, int admin_pwd, int admin_power, String admin_location) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_pwd = admin_pwd;
        this.admin_power = admin_power;
        this.admin_location = admin_location;
    }

    public AdminModel() {
    }

    @Override
    public String toString() {
        return "AdminModel{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", admin_pwd=" + admin_pwd +
                ", admin_power=" + admin_power +
                ", admin_location='" + admin_location + '\'' +
                '}';
    }
}
