package org.example.provider;

import org.example.service.CurrencyConverter;

public class Won implements CurrencyConverter {

    public String convert(int a){
        return a*130.306 + " South Korean Won";
    }
}
