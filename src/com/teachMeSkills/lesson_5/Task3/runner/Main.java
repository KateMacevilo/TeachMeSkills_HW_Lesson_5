package com.teachMeSkills.lesson_5.Task3.runner;

import com.teachMeSkills.lesson_5.Task3.atm.ATM;

import java.util.Scanner;

/**
 * Создать класс, описывающий банкомат.
 * 	Набор купюр, находящихся в банкомате должен задаваться тремя свойствами:
 * 	количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
 * 	Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
 * 	При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * 	Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ATM atm = new ATM();
        System.out.println("Введите количество купюр по 20, которые нужно положить ");
        atm.setBill20(scanner.nextInt());
        System.out.println("Введите количество купюр по 50, которые нужно положить ");
        atm.setBill50(scanner.nextInt());
        System.out.println("Введите количество купюр по 100, которые нужно положить ");
        atm.setBill100(scanner.nextInt());

        System.out.println("Введите сумму, которую хотите снять ");
        int cash = scanner.nextInt();

        if (!atm.getCash(cash)) {
            System.out.println("Не хватает купюр, чтобы выдать данную сумму. В банкомате купюры только 20, 50 и 100");
        }

    }
}
