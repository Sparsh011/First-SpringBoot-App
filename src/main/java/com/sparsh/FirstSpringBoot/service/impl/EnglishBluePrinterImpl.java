package com.sparsh.FirstSpringBoot.service.impl;

import com.sparsh.FirstSpringBoot.service.BluePrinter;

public class EnglishBluePrinterImpl implements BluePrinter {
    @Override
    public void print() {
        System.out.println("Blue");
    }
}
