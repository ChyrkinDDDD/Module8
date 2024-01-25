package org.VariantWithInterface;

public interface IShape {
    default void printName(){
        System.out.println(getClass().getSimpleName());
    }
}
