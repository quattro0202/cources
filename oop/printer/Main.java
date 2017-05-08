package oop.printer;

/**
 * Created by Олександр on 08.05.2017.
 */
public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        System.out.println(printer);

        printer.turnOn();
        System.out.println(printer);

        printer.print("Новий документ(2)");
        printer.print("Новий документ(2)");
        printer.print("Новий документ(2)");
        printer.print("Новий документ(2)");
        System.out.println(printer);

        printer.FillInInc(2);
        System.out.println(printer);

        PrinterWithScanner printerWithScanner = new PrinterWithScanner();
        printerWithScanner.scan();
        printerWithScanner.print("Some document");

        printerWithScanner.turnOn();
        printerWithScanner.scan();
        printerWithScanner.print("Some document");
        System.out.println(printerWithScanner);


    }
}
