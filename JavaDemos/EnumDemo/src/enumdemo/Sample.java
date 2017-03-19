/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumdemo;


enum Season {

    SUMMER, WINTER, RAINY
}

public class Sample {

    enum Direction {

        EAST, WEST, NORTH, SOUTH
    }

    enum SATISFACTIONLEVEL {

        BAD(0), AVG(5), GOOD(10);
        private int value;

        private SATISFACTIONLEVEL() {
        }

        private SATISFACTIONLEVEL(int value) {
            this.value = value;
        }

        void display() {
            System.out.println(value);
        }

    }

    public static void main(String[] args) {
        SATISFACTIONLEVEL bad = SATISFACTIONLEVEL.BAD;
        bad.display();
        SATISFACTIONLEVEL avg = SATISFACTIONLEVEL.AVG;
        avg.display();
    }

}
