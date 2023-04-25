package org.example.provider;

import org.example.service.CurrencyConverter;

public class Peso implements CurrencyConverter {

    public String convert(int a){
        return a*79.179 + " Chilean Peso";
    }
}
