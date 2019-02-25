package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSquare {

    public static void main(String[] args) throws IOException {

        boolean Magic = false;
        BufferedReader numblines = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ведите число строк Магик квадрата: ");
        int stroki = Integer.parseInt(numblines.readLine());
        int[][] kvadrat = new int[stroki][stroki];
        int[] vertik = new int[stroki];
        int[] horiz = new int[stroki];
        int[] diagon = new int[2];
        for (int i = 0; i < stroki; i++) {
            System.out.println("Введите числа " + (i + 1) + " строки");
            for (int j = 0; j < stroki; j++) {
                kvadrat[i][j] = Integer.parseInt(numblines.readLine());

            }
        }

        System.out.println("Ваш квадрат: ");
        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < stroki; j++) {
                System.out.print(kvadrat[i][j] + " ");
            }

            System.out.println();

        }
        for (int i = 0; i < stroki; i++) {
            diagon[0] = diagon[0] + kvadrat[i][i];
            diagon[1] = diagon[1] + kvadrat[stroki - 1 - i][i];
            for (int j = 0; j < stroki; j++) {
                vertik[i] = vertik[i] + kvadrat[i][j];
                horiz[i] = horiz[i] + kvadrat[j][i];

            }

        }

        for (int i = 0; i < stroki - 1; i++) {
            if (horiz[i] == horiz[i + 1] && vertik[i] == vertik[i + 1] && diagon[0] == diagon[1] && horiz[i] == vertik[i] && diagon[0] == vertik[i]) {
                Magic = true;
            } else Magic = false;

        }

        System.out.println(Magic ? "Квадрат магический" : "Квадрат не магический");
    }
}
