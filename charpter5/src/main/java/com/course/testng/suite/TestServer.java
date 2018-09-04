package com.course.testng.suite;

import org.testng.annotations.Test;

@Test(groups = "deploy")
public class TestServer {

    @Test(expectedExceptions = RuntimeException.class)
    public void deployServer() {
        System.out.println("Deploying Server...");
      throw new RuntimeException();
    }

    // Run this if deployServer() is passed.
    @Test(dependsOnMethods = "deployServer")
    public void deployBackUpServer() {
        System.out.println("Deploying Backup Server...");
    }

}