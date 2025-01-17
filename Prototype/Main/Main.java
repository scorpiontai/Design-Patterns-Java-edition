package Prototype.Main;

import Prototype.Interface.Shape;
import Prototype.Main.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("dfd");
        circle.draw();

        Shape circle2 = circle.clone();
        circle2.draw();
    }
}
