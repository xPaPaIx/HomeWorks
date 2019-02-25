package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader vvod = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите число строк треугольника: ");
        int stroki = Integer.parseInt(vvod.readLine());
        int[][] treug = new int[stroki][stroki];
        for (int i = 0; i < stroki; i++) {
            treug[i] = new int[i + 1];
            for (int j = 0; j < treug[i].length; j++) {
                treug[i][0] = 1;
                treug[i][treug[i].length - 1] = 1;

            }
        }

        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < treug[i].length; j++) {
                if (!(treug[i][j] == 1)) {
                    treug[i][j]=treug[i-1][j-1]+treug[i-1][j];
                }

            }

        }

        for (int i = 0; i < stroki; i++) {
            for (int j = 0; j < treug[i].length; j++) {
                System.out.print(treug[i][j]);
            }

            System.out.println();
        }
    }
}

