package com.teachMeSkills.lesson_5.Task4.computer;

public class HDD {
    public String name;
    public int volume;
    public String type;


    public HDD() {
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'';
    }
}
