package com.teachMeSkills.lesson_5.Task4.computer;

import java.lang.reflect.Type;

public class Computer {
    int cost;
    String model;
    public HDD hdd;
    public RAM ram;
    public TypeComputer typeComputer;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        hdd = new HDD();
        ram = new RAM();
    }

    public Computer(int cost, String model, HDD hdd, RAM ram, TypeComputer typeComputer) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
        this.typeComputer = typeComputer;
    }

    public void getInfoAboutComputer(){
        System.out.println("Cost " + this.cost);
        System.out.println("Model " + this.model);
        System.out.println("HDD " + this.hdd);
        System.out.println("RAM " + this.ram);
    }

    @Override
    public String toString() {
        return
                "cost = " + cost +
                ", model = '" + model + '\'' +
                ", hdd = " + hdd +
                ", ram = " + ram +
                ", typeComputer = " + typeComputer ;
    }
}
