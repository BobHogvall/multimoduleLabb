package org.example.provider;

import org.example.service.CurrencyConverter;

public class Euro implements CurrencyConverter {

    public String convert(int a){
        return a*0.088 + " Euro";
    }
}
