package main;

import shape.*;

public class Main {
    public static void main(String[] args) {
        Circle hinhtron1 =new Circle(4.5);
        System.out.println("Information Pre change");
        hinhtron1.getPrimeter();
        System.out.println(hinhtron1);
        System.out.println(hinhtron1.getPrimeter());

        double k= Math.floor(Math.random()*100);
        hinhtron1.resize(k);
        System.out.println(k);
        System.out.println("Information After change");
        hinhtron1.getPrimeter();
        System.out.println(hinhtron1);
        System.out.println(hinhtron1.getPrimeter());
    }
}
