package com.dicoding.submission1;

public class Player {
    private String name;
    private String detail;
    private String salary;
    private String current_club;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBirthOfDate() {
        return birth_of_date;
    }

    public void setBirthOfDate(String birthOfDate) {
        this.birth_of_date = birthOfDate;
    }

    private String birth_of_date;
    private int photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCurrent_club() {
        return current_club;
    }

    public void setCurrent_club(String current_club) {
        this.current_club = current_club;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
