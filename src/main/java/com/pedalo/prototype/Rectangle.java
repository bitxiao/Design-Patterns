package com.pedalo.prototype;

import java.util.Objects;

public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle() {
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            width = target.width;
            height = target.height;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width && height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
