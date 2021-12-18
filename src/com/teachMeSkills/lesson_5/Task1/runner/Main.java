package com.teachMeSkills.lesson_5.Task1.runner;

import com.teachMeSkills.lesson_5.Task1.card.CreditCard;

import java.util.Scanner;

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
public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("123", 16.55f);
        CreditCard card2 = new CreditCard("12-456", 165f);
        CreditCard card3 = new CreditCard("2-315", 223.65f);

        Scanner scanner = new Scanner(System.in);
        boolean needMenu = true;
        int cardNumb = 0;
        float amount = 0.0f;

        while (needMenu) {
            int menuItem = menuInfo(0);

            if (menuItem == 3) {
                needMenu = false;
                break;
            } else if (menuItem == 0) {
                cardNumb = getNumbCard();
                System.out.println("Введите сумму, которую хотите положить на карту " + cardNumb + " ");
                amount = scanner.nextFloat();
                if (cardNumb == 1) {
                    card1.addAmount(card1.currentAmount, amount);
                } else if (cardNumb == 2) {
                    card2.addAmount(card2.currentAmount, amount);
                } else if (cardNumb == 3) {
                    card3.addAmount(card3.currentAmount, amount);
                }
            } else if (menuItem == 1) {
                cardNumb = getNumbCard();
                System.out.println("Введите суммy, которую хотите снять с карты " + cardNumb + " ");
                amount = scanner.nextFloat();
                if (cardNumb == 1) {
                    card1.cashOut(card1.currentAmount, amount);
                } else if (cardNumb == 2) {
                    card2.cashOut(card2.currentAmount, amount);
                } else if (cardNumb == 3) {
                    card3.cashOut(card3.currentAmount, amount);
                }
            } else if (menuItem == 2) {
                cardNumb = getNumbCard();
                if (cardNumb == 1) {
                    System.out.println("Card 1:");
                    card1.allAboutCard();
                } else if (cardNumb == 2) {
                    System.out.println("Card 2:");
                    card2.allAboutCard();
                } else if (cardNumb == 3) {
                    System.out.println("Card 3:");
                    card3.allAboutCard();
                }
            } else if (menuItem == 22) {
                System.out.println("Card 1:");
                card1.allAboutCard();
                System.out.println("Card 2:");
                card2.allAboutCard();
                System.out.println("Card 3:");
                card3.allAboutCard();
            }

            menuItem = menuInfo(1);
            if (menuItem == 1) {
                needMenu = true;
            } else {
                needMenu = false;
            }
        }
    }

    public static int menuInfo(int kindMenu) {
        Scanner scanner = new Scanner(System.in);
        int menuItem = 0;
        if (kindMenu == 0) {
            System.out.println();
            System.out.println("Чтобы положить деньги на карту, введите 0");
            System.out.println("Чтобы снять деньги с карты, введите 1");
            System.out.println("Чтобы просмотреть информацию о карте, введите 2");
            System.out.println("Чтобы просмотреть информацию обо всех картах, введите 22");
            System.out.println("Чтобы закрыть программу, введите 3");
            menuItem = scanner.nextInt();
        } else if (kindMenu == 1) {
            System.out.println();
            System.out.println("Желаете выполнить еще одну операцию?");
            System.out.println("Если Да - введите 1, если нет - введите 0");
            menuItem = scanner.nextInt();
        }
        return menuItem;
    }

    public static int getNumbCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер карты ");
        int cardNumb = scanner.nextInt();
        return cardNumb;
    }
}

