package com.example.youlv.designpattern.cash;

/**
 * Created by youlv on 16-7-7.
 * 打折
 */
public class CashRebate extends CashSuper {

    private double moneyRebate = 1d;

    public CashRebate(String moneyRebate) {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
