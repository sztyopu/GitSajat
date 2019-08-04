package com.company.data;

public class TransporterShip {
    private Long id;
    private String type;
    private String name;
    private int capacity;


    public TransporterShip(){
    }

    public TransporterShip(Long id, String type, String name, int capacity){
        this.id = id;
        this. type = type;
        this.name = name;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
