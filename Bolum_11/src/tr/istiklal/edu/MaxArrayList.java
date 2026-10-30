package tr.istiklal.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxArrayList {
    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) return null;
        int maxVal = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > maxVal) maxVal = list.get(i);
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Sayıları girin (0 sonlandırır): ");
        int val = input.nextInt();
        while (val != 0) {
            list.add(val);
            val = input.nextInt();
        }
        System.out.println("En büyük eleman: " + max(list));
    }
}