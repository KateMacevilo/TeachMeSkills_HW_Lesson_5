package com.teachMeSkills.lesson_5.Task3.atm;

public class ATM {
    int bill20;
    int bill50;
    int bill100;
    public int allMoney;

    public ATM() {
    }

    public ATM(int bill20, int bill50, int bil100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bil100;
    }

    public void setBill20(int bill20) {
        this.bill20 = bill20;
    }

    public void setBill50(int bill50) {
        this.bill50 = bill50;
    }

    public void setBill100(int bill100) {
        this.bill100 = bill100;
    }


    public boolean getCash (int cash){
        if ((cash % 10 != 0) || (cash < 20) || (cash == 30)){
            return false;
        }
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        while (cash != 0){
            if ((cash >= 100) && ((cash - 100) % 20 == 0) && (bill100 > 0)){
                cash -= 100;
                bill100 -= 1;
                count100 += 1;
            } else if ((cash >= 50) && (cash % 20 != 0) && (bill50 > 0)) {
                cash -= 50;
                bill50 -= 1;
                count50 += 1;
            } else if ((cash >= 20) && (bill20 > 0)){
                cash -= 20;
                bill20 -= 1;
                count20 += 1;
            } else if (cash == 10){
                return false;
            }

        }
        System.out.println("кол-во 20 - "+ count20+ " кол-во 50 - "+ count50 + " кол-во 100 - "+ count100);
        return true;
    }
}
