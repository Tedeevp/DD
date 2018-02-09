package ru.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Autorization {

    public static WebDriver driver;


    public void Autoriza(){

        System.setProperty("webdriver.ie.driver", "C:/Users/WS/IdeaProjects/DD/src/main/resources/Driver/IEDriverServer.exe");
        driver = new InternetExplorerDriver();

    }

public void navigate (){
    driver.manage().window().maximize();
    driver.get("https://mail.ru/");

}



}
