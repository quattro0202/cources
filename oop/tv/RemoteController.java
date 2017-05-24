package oop.tv;

import oop.tv.logic.ControlPanel;
import oop.tv.logic.RemoteTV;
import oop.tv.logic.TV;

public class RemoteController {
    public static void main(String[] args) {
        TV tv = new RemoteTV();
        ControlPanel panel = new ControlPanel(tv);
        panel.previousChanel();
    }
}
