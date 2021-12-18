package com.teachMeSkills.lesson_5.Task2.computer;

public class Computer {
    int cost;
    String model;
    public HDD hdd;
    public RAM ram;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        hdd = new HDD();
        ram = new RAM();
    }

    public Computer(int cost, String model, HDD hdd, RAM ram) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void getInfoAboutComputer(){
        System.out.println("Cost " + this.cost);
        System.out.println("Model " + this.model);
        System.out.println("HDD " + this.hdd);
        System.out.println("RAM " + this.ram);
    }
}
