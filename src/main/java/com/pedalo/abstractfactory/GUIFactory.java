package com.pedalo.abstractfactory;

/**
 * 抽象工厂
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
