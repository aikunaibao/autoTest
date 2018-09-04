package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.lang.reflect.Method;


public class Parameter {
    @Parameters({"name","age"})
    @Test
    public void showParameter(String name,String age){
        System.out.println("name = "+name+" , age = "+age );
    }
    @Test(dataProvider = "dataprovider1")
    public void getdataprovider(String name,String age){
        System.out.println("getdataprovider 数据情况： name = "+name+" , age = "+age );
    }

    @Test(dataProvider = "dataprovider1")
    public void getdataprovider1(String name,String age){
        System.out.println("getdataprovider1 数据情况:name = "+name+" , age = "+age );
    }

    @DataProvider(name = "dataprovider1",parallel=true)
    public Object[][] dataprovide(Method method){
        if(method.getName().equals("getdataprovider"))
        return new Object[][]{{"lily","1"},{"tagee","3"},{"tagee","3"},{"tagee","3"},{"tagee","3"},{"tagee","3"},{"tagee","3"},{"tagee","3"}};
        else{
            return new Object[][]{{"lily","1"},{"sandi","3"},{"hewiii","3"}};
        }
    }
}
