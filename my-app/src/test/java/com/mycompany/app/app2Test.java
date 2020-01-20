package com.mycompany.app;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class app2Test {
    @Test
    public void count1() {
        Assert.assertEquals(true, app2.isPalindrome("a"));
    }

    @Test
    public void count2() {
        Assert.assertEquals(true, app2.isPalindrome(" "));
    }

    @Test
    public void count3() {
        Assert.assertEquals(true, app2.isPalindrome("aba"));
    }

    @Test
    public void count4() {
        Assert.assertEquals(false, app2.isPalindrome("abcd"));
    }

    @Test
    public void count5() {
        Assert.assertEquals(true, app2.isPalindrome("ccccccccccccccc"));
    }

    @Test
    public void count6() {
        Assert.assertEquals(false, app2.isPalindrome("abcdefgh"));
    }

    @Test
    public void count7() {
        Assert.assertEquals(true, app2.isPalindrome("ppqqpp"));
    }
}