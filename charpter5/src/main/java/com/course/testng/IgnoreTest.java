package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
}
