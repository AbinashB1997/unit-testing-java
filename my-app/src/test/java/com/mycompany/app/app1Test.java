package com.mycompany.app;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class app1Test {
    @Test
    public void count1() {
        Assert.assertEquals(5, app1.countOnes("101010101"));
    }

    @Test
    public void count2() {
        Assert.assertEquals(6, app1.countOnes("101110101"));
    }

    @Test
    public void count3() {
        Assert.assertEquals(4, app1.countOnes("100010101"));
    }

    @Test
    public void count4() {
        Assert.assertEquals(1, app1.countOnes("10000000"));
    }

    @Test
    public void count5() {
        Assert.assertEquals(3, app1.countOnes("1011"));
    }

    @Test
    public void count6() {
        Assert.assertEquals(5, app1.countOnes("11111"));
    }

    @Test
    public void count7() {
        Assert.assertEquals(0, app1.countOnes("0000000000000000000000"));
    }
}