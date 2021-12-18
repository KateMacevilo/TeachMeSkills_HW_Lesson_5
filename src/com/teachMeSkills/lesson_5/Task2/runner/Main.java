package com.teachMeSkills.lesson_5.Task2.runner;

import com.teachMeSkills.lesson_5.Task2.computer.Computer;
import com.teachMeSkills.lesson_5.Task2.computer.HDD;
import com.teachMeSkills.lesson_5.Task2.computer.RAM;

/**
 * Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD.
 * 	Для полей RAM и HDD следует создать свои собственные классы.
 * 	Классы для RAM и HDD должны иметь конструктор по умолчанию и конструктор со всеми параметрами.
 * 	Класс RAM имеет поля "название" и "объем"
 * 	Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний)
 * 	Класс Computer должен иметь два констурктора:
 * 		- первый - с параметрами стоимость и модель,
 * 		- второй - со всеми полями
 * 	При создании объекта "компьютер" с помощью первого констуктора должны создаватьс поля RAM и HDD с помощью конструкторов по умолчанию.
 * 	В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
 * 	Тестовый сценарий для проверки:
 * 		создать объект "компьютер 1" с помощью первого конструктора и вывести информацию на экран
 * 		создать объект "компьютер 2" с помощью второго конструктора и вывести информацию на экран
 */
public class Main {
    public static void main(String[] args) {
        RAM ram1 = new RAM("Kingston FURY", 8);
        HDD hdd1 = new HDD("Seagate", 16, "внешний");
        RAM ram2 = new RAM("SkyHawk", 16);
        HDD hdd2 = new HDD("Crucial", 32, "внутренний");

        Computer computer1 = new Computer(100, "Lenovo");
        computer1.hdd = hdd1;
        computer1.ram = ram1;
        Computer computer2 = new Computer(150, "Macbook", hdd2, ram2);

        System.out.println("Computer1:");
        computer1.getInfoAboutComputer();

        System.out.println();

        System.out.println("Computer2:");
        computer2.getInfoAboutComputer();

    }
}
