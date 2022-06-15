package com.pedalo.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void print() {
        System.out.println("You have create windows button.");
    }
}
