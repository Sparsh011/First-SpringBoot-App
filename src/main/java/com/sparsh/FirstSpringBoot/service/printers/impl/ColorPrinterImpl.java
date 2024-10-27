package com.sparsh.FirstSpringBoot.service.printers.impl;

import com.sparsh.FirstSpringBoot.service.printers.BluePrinter;
import com.sparsh.FirstSpringBoot.service.printers.ColorPrinter;
import com.sparsh.FirstSpringBoot.service.printers.GreenPrinter;
import com.sparsh.FirstSpringBoot.service.printers.RedPrinter;

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
