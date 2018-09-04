package com.course.testng;

import org.testng.annotations.Test;

public class Timeout {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(100000);
        System.out.println("测试成功");
    }
}
