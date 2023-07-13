package com.code.bull.pagerepository.pagelocators;

import org.openqa.selenium.By;

public class LoginpageElement {
    public static final By username = By.xpath("//input[@name='username']");
    public static final By userpass = By.xpath("//input[@name='password']");
    public static final By loginBtn =By.xpath("//button[text()=' Login ']");
    public static final By invalidMsg = By.xpath("//*[text()='Invalid credentials']");


}
