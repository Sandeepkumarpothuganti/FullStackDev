package staticBlockDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class StaticBlockDemo {

    static {
        System.out.println("staticblock1");
    }

    static {
        System.out.println("staticblock2");
    }

    public StaticBlockDemo() {
        super();
    }

    {
        System.out.println("IIB1");
    }

    public static void main(String[] args) {
        StaticBlockDemo obj = new StaticBlockDemo();
    }

}
