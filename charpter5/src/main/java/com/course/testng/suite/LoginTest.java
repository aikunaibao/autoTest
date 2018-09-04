package com.course.testng.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void loginTaobao(){
        System.out.println("TAObao登录成功");
    }
    @BeforeMethod
    public void beforeMethods(){
        System.out.println("BeforeMethods这个是方法之前运行");
    }

    @AfterMethod
    public void afterMethods(){
        System.out.println("AfterMethods这个是在方法之后运行的");
    }
}
