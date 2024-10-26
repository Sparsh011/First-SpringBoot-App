package com.sparsh.FirstSpringBoot.service.impl;

import com.sparsh.FirstSpringBoot.service.RedPrinter;

public class EnglishRedPrinterImpl implements RedPrinter {
    @Override
    public void print() {
        System.out.println("Red");
    }
}
