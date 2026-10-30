package tr.istiklal.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matris boyutu (n): ");
        int n = input.nextInt();
        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int)(Math.random() * 2);
                System.out.print(m[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();
        int maxR = -1, maxC = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) if (m[i][j] == 1) count++;
            if (count > maxR) { maxR = count; rows.clear(); rows.add(i); }
            else if (count == maxR) rows.add(i);
        }

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) if (m[i][j] == 1) count++;
            if (count > maxC) { maxC = count; cols.clear(); cols.add(j); }
            else if (count == maxC) cols.add(j);
        }

        System.out.println("En çok 1 olan satırlar: " + rows);
        System.out.println("En çok 1 olan sütunlar: " + cols);
    }
}