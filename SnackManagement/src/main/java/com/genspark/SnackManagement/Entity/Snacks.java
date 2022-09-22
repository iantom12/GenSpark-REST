package com.genspark.SnackManagement.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Snacks")
public class Snacks {

    @Id
    @Column(name = "Chip_Name")
    private String name;
    private String brand;
    private String flavor;

    public Snacks(){}

    public Snacks(String brand, String flavor) {
        this.brand = brand;
        this.flavor = flavor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
}
