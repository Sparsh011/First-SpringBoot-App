package com.sparsh.FirstSpringBoot.config;

import com.sparsh.FirstSpringBoot.service.printers.BluePrinter;
import com.sparsh.FirstSpringBoot.service.printers.ColorPrinter;
import com.sparsh.FirstSpringBoot.service.printers.GreenPrinter;
import com.sparsh.FirstSpringBoot.service.printers.RedPrinter;
import com.sparsh.FirstSpringBoot.service.printers.impl.ColorPrinterImpl;
import com.sparsh.FirstSpringBoot.service.printers.impl.EnglishBluePrinterImpl;
import com.sparsh.FirstSpringBoot.service.printers.impl.EnglishRedPrinterImpl;
import com.sparsh.FirstSpringBoot.service.printers.impl.HindiGreenPrinterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The {@link PrinterConfig} class is a Spring configuration class that defines
 * and provides the necessary beans for the application's printer services. Used for Dependency Injection.
 * We can provide any instance of Green/Red/Blue printer here and implementation won't change.
 */
@Configuration
public class PrinterConfig {
    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinterImpl();
    }

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinterImpl();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new HindiGreenPrinterImpl();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, GreenPrinter greenPrinter, RedPrinter redPrinter) {
        return new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }
}
