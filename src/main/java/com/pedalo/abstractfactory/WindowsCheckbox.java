package com.pedalo.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void print() {
        System.out.println("You have create a windows checkbox.");
    }
}
