package com.teachMeSkills.lesson_5.Task2.computer;

public class RAM {
    public String name;
    public int volume;

    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", volume=" + volume;
    }
}
