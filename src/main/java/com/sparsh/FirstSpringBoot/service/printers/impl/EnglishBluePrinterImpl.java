package com.sparsh.FirstSpringBoot.service.printers.impl;

import com.sparsh.FirstSpringBoot.service.printers.BluePrinter;

public class EnglishBluePrinterImpl implements BluePrinter {
    @Override
    public void print() {
        System.out.println("Blue");
    }
}
