package com.demotest;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest1 {

    @Test
    public void sum() {
        System.out.println("Sum");
        int a = 10;
        int b = 20;
        int sum = a + b;
        Assert.assertEquals(30, sum);
    }

    @Test
    public void dif() {
        System.out.println("Difference");
        int a = 20;
        int b = 10;
        int dif = a - b;
        Assert.assertEquals(10, dif);
    }
}
