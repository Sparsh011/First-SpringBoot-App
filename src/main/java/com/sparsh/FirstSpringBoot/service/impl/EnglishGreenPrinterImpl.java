package com.sparsh.FirstSpringBoot.service.impl;

import com.sparsh.FirstSpringBoot.service.GreenPrinter;

public class EnglishGreenPrinterImpl implements GreenPrinter {
    @Override
    public void print() {

        System.out.println("Green");
    }
}
