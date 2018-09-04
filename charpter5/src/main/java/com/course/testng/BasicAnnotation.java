package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @BeforeMethod
    public void beforeMethods(){
        System.out.println("BeforeMethods这个是方法之前运行！");
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

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite这个是套件之后运行的！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite这个是套件之后运行的！");
    }
}

