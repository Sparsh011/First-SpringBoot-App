package com.sparsh.FirstSpringBoot.service.impl;

import com.sparsh.FirstSpringBoot.service.BluePrinter;
import com.sparsh.FirstSpringBoot.service.ColorPrinter;
import com.sparsh.FirstSpringBoot.service.GreenPrinter;
import com.sparsh.FirstSpringBoot.service.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public void print() {
        redPrinter.print();
        greenPrinter.print();
        bluePrinter.print();
    }
}
