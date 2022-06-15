package com.pedalo.factory;

/**
 * 工厂，基础创建者
 */
public abstract class Dialog {
    public void renderWindows() {
        // other code...
        Button okButton = createButton();
        okButton.render();
    }

    abstract Button createButton();
}
