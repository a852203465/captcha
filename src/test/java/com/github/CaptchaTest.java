package com.github;

import com.github.captcha.*;
import org.junit.Test;

import java.io.FileOutputStream;

/**
 * 测试类
 * @author Rong.Jia
 * @date 2019/11/14 13:16
 */
public class CaptchaTest {

    @Test
    public void test() throws Exception {
        for (int i = 0; i < 10; i++) {
            SpecCaptcha specCaptcha = new SpecCaptcha();
            specCaptcha.setLen(4);
            specCaptcha.setFont(i, 32f);
            System.out.println(specCaptcha.text());
            specCaptcha.out(new FileOutputStream("F:\\" + i + ".png"));
        }
    }

    @Test
    public void testGIf() throws Exception {
        for (int i = 0; i < 10; i++) {
            GifCaptcha gifCaptcha = new GifCaptcha();
            gifCaptcha.setLen(5);
            gifCaptcha.setFont(i, 32f);
            System.out.println(gifCaptcha.text());
            gifCaptcha.out(new FileOutputStream("F:\\" + i + ".gif"));
        }
    }

    @Test
    public void testHan() throws Exception {
        for (int i = 0; i < 10; i++) {
            ChineseCaptcha chineseCaptcha = new ChineseCaptcha();
            System.out.println(chineseCaptcha.text());
            chineseCaptcha.out(new FileOutputStream("F:\\" + i + ".png"));
        }
    }

    @Test
    public void testGifHan() throws Exception {
        for (int i = 0; i < 10; i++) {
            ChineseGifCaptcha chineseGifCaptcha = new ChineseGifCaptcha();
            System.out.println(chineseGifCaptcha.text());
            chineseGifCaptcha.out(new FileOutputStream("F:\\" + i + ".gif"));
        }
    }

    @Test
    public void testArit() throws Exception {
        for (int i = 0; i < 10; i++) {
            ArithmeticCaptcha specCaptcha = new ArithmeticCaptcha();
            specCaptcha.setLen(3);
            specCaptcha.setFont(i, 28f);
            System.out.println(specCaptcha.getArithmeticString() + " " + specCaptcha.text());
            specCaptcha.out(new FileOutputStream("F:\\" + i + ".png"));
        }
    }

    @Test
    public void testBase64() throws Exception {
        GifCaptcha specCaptcha = new GifCaptcha();
        System.out.println(specCaptcha.toBase64(""));
    }













}
