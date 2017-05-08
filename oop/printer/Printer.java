package oop.printer;

/**
 * Created by Олександр on 08.05.2017.
 */
public class Printer {

    private boolean isTurnedOn;
    private int ink;    //чорнила

    public Printer(){
        isTurnedOn = false;
        ink = 3;
    }

    public void turnOn(){
        this.isTurnedOn = true;
    }

    public void turnOff(){
        this.isTurnedOn = false;
    }

    public void print(String document){
        if(isTurnedOn()){
            if(ink > 0){
                System.out.println("Document \"" + document + "\" was printed.");
                ink--;
            }else {
                System.out.println("Document \"" + document + "\" wasn't printed. The ink has run out.");
            }
        }else {
            System.out.println("The printer isn't turned on.");
        }
    }

    //заправити краску
    public void FillInInc(int inkAmount){
        if(isTurnedOn()){
            this.ink += inkAmount;
        }else {
            System.out.println("The printer isn't turned on.");
        }
    }

    @Override
    public String toString() {
        return "Printer status isTurnedOn=" + isTurnedOn + ", inkAmount=" + ink + ".";
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
