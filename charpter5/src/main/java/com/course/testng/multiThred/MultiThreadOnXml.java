package com.course.testng.multiThred;

import org.testng.annotations.Test;


public class MultiThreadOnXml
{
    @Test(groups = "test_g1")
    public void test1(){
        System.out.println("ThreadId : "+ Thread.currentThread().getId());
    }

    @Test(groups = "test_g1")
    public void test2(){
        System.out.println("ThreadId : "+ Thread.currentThread().getId());
    }
    @Test(groups = "test_g1")
    public void test3(){
        System.out.println("ThreadId : "+ Thread.currentThread().getId());
    }

    @Test(groups = "test_g2")
    public void test4(){
        System.out.println("ThreadId : "+ Thread.currentThread().getId());
    }
}
