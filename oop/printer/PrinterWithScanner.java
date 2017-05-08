package oop.printer;

/**
 * Created by Олександр on 08.05.2017.
 */
public class PrinterWithScanner extends Printer {

    public PrinterWithScanner(){
        super();
    }

    public void scan(){
        if(this.isTurnedOn()){
            System.out.println("The image was scanned.");
        }else {
            System.out.println("The printer isn't turned on.");
        }
    }
}
