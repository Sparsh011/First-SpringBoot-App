package com.sparsh.FirstSpringBoot.service.printers.impl;

import com.sparsh.FirstSpringBoot.service.printers.RedPrinter;

public class EnglishRedPrinterImpl implements RedPrinter {
    @Override
    public void print() {
        System.out.println("Red");
    }
}
