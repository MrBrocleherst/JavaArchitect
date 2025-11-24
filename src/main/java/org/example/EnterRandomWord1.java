package org.example;

public class EnterRandomWord1 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 3  ) {

            double random = Math.random();
            double randomBig = random * 33 + 1072;
            int randomBigFloor = (int) Math.floor(randomBig);
            char letter = (char) randomBigFloor;
            System.out.print(letter);

            char o1 = 'а';
            char o2 = 'я';
            char o3 = 'ю';
            char o4 = 'о';
            char o5 = 'е';
            char o6 = 'у';
            char o7 = 'и';
            char o8 = 'ё';

            double random2 = Math.random(); // [0;1]
            double randomBig2 = random2 * 8 + 1;
            int randomBigFloor2 = (int) Math.floor(randomBig2);

            if (randomBigFloor2 == 1) System.out.print(o1);
            if (randomBigFloor2 == 2) System.out.print(o2);
            if (randomBigFloor2 == 3) System.out.print(o3);
            if (randomBigFloor2 == 4) System.out.print(o4);
            if (randomBigFloor2 == 5) System.out.print(o5);
            if (randomBigFloor2 == 6) System.out.print(o6);
            if (randomBigFloor2 == 7) System.out.print(o7);
            if (randomBigFloor2 == 8) System.out.print(o8);

            x++;
        }
    }
}
