package com.mycompany.app;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

import jdk.internal.jline.internal.TestAccessible;

public class app3Test {
    @Test
    public void count1() {
        Assert.assertEquals(false, app3.isPrime(10));
    }

    @Test
    public void count2() {
        Assert.assertEquals(true, app3.isPrime(7));
    }

    @Test
    public void count3() {
        Assert.assertEquals(false, app3.isPrime(12));
    }

    @Test
    public void count4() {
        Assert.assertEquals(true, app3.isPrime(11));
    }

    @Test
    public void count5() {
        Assert.assertEquals(true, app3.isPrime(17));
    }

    @Test
    public void count6() {
        Assert.assertEquals(false, app3.isPrime(1));
    }

    @Test
    public void count7() {
        Assert.assertEquals(false, app3.isPrime(0));
    }

    @Test
    public void count8() {
        Assert.assertEquals(true, app3.isPrime(2));
    }
}