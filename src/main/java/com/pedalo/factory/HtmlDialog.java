package com.pedalo.factory;

/**
 * 具体创建者
 */
public class HtmlDialog extends Dialog {

    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
