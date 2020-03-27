package khorstmann.ch2;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardForm {
    private int nonStatic = 0;
    private static final ArrayList<Integer>
            expirationYear = new ArrayList<>();

    static {
        int year = LocalDate.now().getYear();

        for (int i = year; i < year + 20; i++) {
            expirationYear.add(i);
        }
    }

    public static int nextlnt(int low, int high, int number) {
        return low + number;
        // Статическая переменная generator вполне доступна
    }


}
