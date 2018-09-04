package com.course.testng.multiThred;

import org.testng.annotations.Test;

public class MultiThreadClass {
    @Test(invocationCount = 10 , threadPoolSize=10)
    public void test1(){
        System.out.println("ThreadId : "+ Thread.currentThread().getId());
    }

}
