package com.pedalo.factory;

/**
 * 具体创建者
 */
public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
