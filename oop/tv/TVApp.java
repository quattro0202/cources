package oop.tv;


import oop.tv.logic.ControlPanel;
import oop.tv.logic.SimpleTV;
import oop.tv.logic.TV;
import oop.tv.logic.TVSignalListener;

public class TVApp {
    public static void main(String[] args) {
        TV tv = new SimpleTV();
        TVSignalListener listener = new TVSignalListener(tv);
        listener.listen();

    }
}
