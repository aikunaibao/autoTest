package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "Server")
    public void test1()
        {
        System.out.println("groupTest1");
    }
    @Test(groups = "Server")
    public void test2(){

                System.out.println("groupTest2");
    }
    @Test(groups = "client")
    public void test3()
    {
        System.out.println("groupTest3");
    }
    @Test(groups = "client")
    public void test4(){

        System.out.println("groupTest4");
    }

    @BeforeGroups("Server")
    public void test5(){
        System.out.println("beforeGroups");
    }

    @AfterGroups("Server")
    public void test6(){
        System.out.println("afterGroups");
    }

}
