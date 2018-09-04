package com.course.testng.suite;

import org.testng.annotations.Test;

public class PayTest {
    @Test(groups= "pay" , priority = 1)
    public void paySuccess(){
        System.out.println("paytest 支付成功");
    }

    @Test(groups = "pay2", priority = 2)
    public void PayTest2(){
        System.out.println("paytest2 支付成功");
    }
}


