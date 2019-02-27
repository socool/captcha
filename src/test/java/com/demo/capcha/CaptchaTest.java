package com.demo.capcha;

import org.junit.Assert;
import org.junit.Test;

public class CaptchaTest {
    @Test
    public void firstPatternLeftOperandShouldBe1(){
        Captcha captcha = new Captcha(1,1,1,1);
        Assert.assertEquals("1 + One",captcha.toString());
    }

}