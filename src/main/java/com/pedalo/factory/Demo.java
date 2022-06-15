package com.pedalo.factory;

/**
 * 客户端代码
 * <p>
 * 工厂方法是一种创建型设计模式， 解决了在不指定具体类的情况下创建产品对象的问题。
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void runBusinessLogic() {
        dialog.renderWindows();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }
}
