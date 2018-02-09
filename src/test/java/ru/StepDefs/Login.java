package ru.StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import ru.Pages.Autorization;
import ru.Pages.InStr;

public class Login {


    @Given("^login to$")
    public void loginTo() throws Throwable {
      new Autorization().Autoriza();
        new Autorization().navigate();
    }

    @And("^gosite$")
    public void gosite() throws Throwable {
        new InStr().login.clear();
       new InStr().login.sendKeys("tedeevp");
        new InStr().password.sendKeys("Gtnhbr30");
    }

    @And("^come in site$")
    public void comeInSite() throws Throwable {
        new InStr().button.click();
    }
}
