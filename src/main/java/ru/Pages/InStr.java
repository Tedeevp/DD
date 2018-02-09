package ru.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InStr {

    @FindBy(name ="login")
    public WebElement login;

    @FindBy (name ="password")
    public WebElement password;

    @FindBy (xpath ="//label[@class='btn btn_blue mailbox__control mailbox__rwd-control']/input[@class='o-control']")////*[@id="mailbox:submit"]/input
    public WebElement button;

    public InStr(){
              PageFactory.initElements( new Autorization().driver, this);
    }
}
