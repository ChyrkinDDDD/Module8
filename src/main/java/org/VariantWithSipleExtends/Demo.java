package org.VariantWithSipleExtends;

import org.VariantWithSipleExtends.Shapes.*;

public class Demo {
    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();
        namePrinter.printName(new Qube());
        namePrinter.printName(new Circle());
        namePrinter.printName(new Pentagon());
        namePrinter.printName(new Triangle());
        namePrinter.printName(new Quad());
    }
}
