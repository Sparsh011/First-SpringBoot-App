package com.sparsh.FirstSpringBoot.service.printers.impl;

import com.sparsh.FirstSpringBoot.service.printers.GreenPrinter;

public class EnglishGreenPrinterImpl implements GreenPrinter {
    @Override
    public void print() {

        System.out.println("Green");
    }
}
