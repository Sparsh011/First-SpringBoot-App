package com.sparsh.FirstSpringBoot.service.printers.impl;

import com.sparsh.FirstSpringBoot.service.printers.GreenPrinter;

public class HindiGreenPrinterImpl implements GreenPrinter {
    @Override
    public void print() {
        System.out.println("hara");
    }
}
