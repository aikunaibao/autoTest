package com.course.testng.suite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestApp {
    @Test(enabled=true, dataProvider = "dataprovider1",threadPoolSize=2, invocationCount=3)
    public void showAppMessage(String name ,String age){
        System.out.println("这个是app测试 ！");
        System.out.println("name = "+name+" , age = "+age );
    }

    @DataProvider(name = "dataprovider1")
    public Object[][] dataprovide(){
        return new Object[][]{{"lily","1"},{"tagee","3"}};
    }
}
