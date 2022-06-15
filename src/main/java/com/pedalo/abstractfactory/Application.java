package com.pedalo.abstractfactory;

/**
 * 客户端代码
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void print() {
        button.print();
        checkbox.print();
    }
}
