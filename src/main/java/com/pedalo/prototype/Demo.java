package com.pedalo.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型是一种创建型设计模式， 使你能够复制对象， 甚至是复杂对象， 而又无需使代码依赖它们所属的类。
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> circles = new ArrayList<>();
        List<Shape> circlesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.color = "red";
        circle.radius = 15;
        circles.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        circles.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        circles.add(rectangle);

        cloneAndCompare(circles, circlesCopy);
    }

    private static void cloneAndCompare(List<Shape> circles, List<Shape> circlesCopy) {
        for (Shape shape : circles) {
            circlesCopy.add(shape.clone());
        }

        for (int i = 0; i < circles.size(); i++) {
            if (circles.get(i) != circlesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (circles.get(i).equals(circlesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
