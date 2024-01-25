package org.VariantAbstractClass;

import org.VariantAbstractClass.Shapes.*;


public class Demo {
    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();
        namePrinter.printName(new Circle());
        namePrinter.printName(new Qube());
        namePrinter.printName(new Triangle());
        namePrinter.printName(new Rectangle());
        namePrinter.printName(new Pentagon());
    }
}

