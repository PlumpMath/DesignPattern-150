package com.example.youlv.designpattern.cash;

/**
 * Created by youlv on 16-7-7.
 * 正常收费
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
