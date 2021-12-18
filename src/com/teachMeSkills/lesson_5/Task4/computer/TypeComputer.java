package com.teachMeSkills.lesson_5.Task4.computer;

public enum TypeComputer {

    DESKTOP ("Десктоп"),
    LAPTOP ("Ноутбук");

    private  String title;

    TypeComputer(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return
                title ;
    }
}
