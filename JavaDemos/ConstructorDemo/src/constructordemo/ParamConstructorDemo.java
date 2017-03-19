/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructordemo;


public class ParamConstructorDemo {

    int i;

    public ParamConstructorDemo(int param1) {
        i = param1;
        System.out.println("Im a single parameterised const with int as parameter...");
    }

    public ParamConstructorDemo(char c) {
        System.out.println("Im a single parameterised const with character as parameter...");
    }

    public ParamConstructorDemo(char c, int i) {
        System.out.println("Im a single parameterised const with character and int as parameters...");
    }

    public static void main(String[] args) {
//        ParamConstructorDemo obj = new ParamConstructorDemo();
        char c = 5;
        ParamConstructorDemo objInt = new ParamConstructorDemo(10);
        ParamConstructorDemo objChar = new ParamConstructorDemo(c);
        ParamConstructorDemo objCharInt = new ParamConstructorDemo(c, 10);
    }

}
