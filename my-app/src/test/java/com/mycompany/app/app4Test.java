package com.mycompany.app;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

import jdk.internal.jline.internal.TestAccessible;

public class app4Test {
    @Test
    public void count1() {
        Assert.assertEquals(2, app4.GCD(4, 2));
    }

    @Test
    public void count2() {
        Assert.assertEquals(1, app4.GCD(5, 3));
    }

    @Test
    public void count3() {
        Assert.assertEquals(100, app4.GCD(100, 0));
    }

    @Test
    public void count4() {
        Assert.assertEquals(0, app4.GCD(0, 0));
    }

    @Test
    public void count5() {
        Assert.assertEquals(1, app4.GCD(13, 17));
    }

    @Test
    public void count6() {
        Assert.assertEquals(3, app4.GCD(15, 3));
    }

    @Test
    public void count7() {
        Assert.assertEquals(20, app4.GCD(100, 20));
    }

    @Test
    public void count8() {
        Assert.assertEquals(10, app4.GCD(0, 10));
    }
}