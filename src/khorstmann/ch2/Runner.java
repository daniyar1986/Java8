package khorstmann.ch2;

import java.text.NumberFormat;

public class Runner {
    public static void main(String[] args) {
        CreditCardForm form = new CreditCardForm();
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 123.58;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));

        //inner class is private
        Invoce invoce = new Invoce();
        invoce.addItem("Blackwell Toaster", 2, 19.95);

        //inner class is public
        Invoce.Item item = new Invoce.Item("Blackwell Toaster", 2, 19.95);

    }
}
