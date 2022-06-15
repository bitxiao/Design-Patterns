package com.pedalo.builder;

/**
 * 生成器是一种创建型设计模式， 使你能够分步骤创建复杂对象。
 */
public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());
    }
}
