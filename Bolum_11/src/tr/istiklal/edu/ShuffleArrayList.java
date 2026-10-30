package tr.istiklal.edu;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) list.add(i);
        System.out.println("Orijinal: " + list);
        shuffle(list);
        System.out.println("Karıştırılmış: " + list);
    }
}