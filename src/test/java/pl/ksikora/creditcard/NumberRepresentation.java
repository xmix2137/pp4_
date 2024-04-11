package pl.ksikora.creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NumberRepresentation {

    @Test
    void floatTest(){
        float a = 0.002f;
        float b = 0.003f;
        System.out.println("Float");
        System.out.println(a - b);
    }
    @Test
    void FloatTest(){
        double a = 0.02;
        double b = 0.03;
        System.out.println("Double");
        System.out.println(b - a);
    }

    @Test
    void BigDecimalTest(){
        BigDecimal a = new BigDecimal(0.02);
        BigDecimal b = new BigDecimal(0.03);

        System.out.println("Big Dedcimal");
        System.out.println(a.subtract(b));

    }
}
