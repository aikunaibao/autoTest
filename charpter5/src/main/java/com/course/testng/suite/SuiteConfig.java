package com.course.testng.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println(" before suit test 开始了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suit test 开始了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 开始了");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 开始了");
    }

    @BeforeMethod
    public void beforeMethods(){
        System.out.println("BeforeMethods这个是方法之前运行");
    }

    @AfterMethod
    public void afterMethods(){
        System.out.println("AfterMethods这个是在方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这个是类之前运行的！");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这个是类之后运行的！");
    }
}
