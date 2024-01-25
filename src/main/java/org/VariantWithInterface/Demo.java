package org.VariantWithInterface;

import org.VariantWithInterface.Shapes.*;

public class Demo {
    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();
        namePrinter.printName(new Circle());
        namePrinter.printName(new Quad());
        namePrinter.printName(new Triangle());
        namePrinter.printName(new Rectangle());
        namePrinter.printName(new Pentagon());
    }
}
