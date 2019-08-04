package com.company.data;

public class Tree {
    private Long id;
    private int year;
    private String name;
    private String type;

    public Tree(){

    }

    public Tree(Long id, int year, String name, String type){
        this.id = id;
        this.year = year;
        this.name = name;
        this.type = type;

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
