package com.pedalo.factory;

/**
 * 具体产品
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("html button render.");
        onCLick();
    }

    @Override
    public void onCLick() {
        System.out.println("html button on click.");
    }
}
