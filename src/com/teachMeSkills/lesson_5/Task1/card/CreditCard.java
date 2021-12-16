package com.teachMeSkills.lesson_5.Task1.card;

/**
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * 	Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 * 	Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 * 	Добавьте метод, который выводит текущую информацию о карточке.
 * 	Напишите программу, которая создает три объекта класса CreditCard у которых заданны номер счета и начальная сумма
 * 	Тестовый сценарий для проверки:
 * 		Положите деньги на первые две карточки и снимите с третьей.
 * 		Выведите на экран текущее состояние всех трех карточек.
 */
public class CreditCard {
    public String accountNumber;
    public float currentAmount;

    public CreditCard(String accountNumber, float currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void addAmount(float currentAmount, float addingAmount) {
        System.out.println("текущая сумма = " + currentAmount);
        currentAmount += addingAmount;
        this.currentAmount = currentAmount;
        System.out.println("Текущая сумма = " + this.currentAmount);
    }

    public void cashOut(float currentAmount, float deductibleAmount) {
        System.out.println("Текущая сумма = " + currentAmount);
        currentAmount -= deductibleAmount;
        this.currentAmount = currentAmount;
        System.out.println("Текущая сумма = " + this.currentAmount);
    }

    public void allAboutCard() {
        System.out.println("Номер счета - " + this.accountNumber);
        System.out.println("Текущая сумма = " + this.currentAmount);
    }


}
