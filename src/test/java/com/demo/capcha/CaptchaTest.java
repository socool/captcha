package com.demo.capcha;

import org.junit.Assert;
import org.junit.Test;

public class CaptchaTest {
    @Test
    public void firstPatternLeftOperandShouldBe1(){
        Captcha captcha =new Captcha();
        Assert.assertEquals("1 + One",captcha.toString());
    }

}