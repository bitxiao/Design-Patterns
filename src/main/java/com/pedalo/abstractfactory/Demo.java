package com.pedalo.abstractfactory;

/**
 * 抽象工厂是一种创建型设计模式， 它能创建一系列相关的对象， 而无需指定其具体类。
 */
public class Demo {
    /**
     * 程序配置
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = configureApplication();
        app.print();
    }

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}
