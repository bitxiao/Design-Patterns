package com.pedalo.abstractfactory;

public class MacOSButton implements Button {
    @Override
    public void print() {
        System.out.println("You have create a macos button.");
    }
}
