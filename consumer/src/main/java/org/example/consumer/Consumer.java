package org.example.consumer;

import org.example.service.CurrencyConverter;

import java.util.Scanner;
import java.util.ServiceLoader;

public class Consumer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Currency converter.
                Insert the amount of SEK you want to convert:""");
        int amount = scanner.nextInt();

        ServiceLoader<CurrencyConverter> currencyConverters = ServiceLoader.load(CurrencyConverter.class);


        for (var currencyConverter : currencyConverters) {
            System.out.println(currencyConverter.convert(amount));
        }


    }
}
