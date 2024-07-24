package com.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginSteps {
    WebDriver driver;
    @Given("^user is on loginPage$")
    public void user_is_on_loginPage(){
        System.out.println("Step 1:user is on login page");

        driver=new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() {
        System.out.println("Step 2:User enter name and password");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

    }

    @And("^click on login button$")
    public void click_on_login_button() {
        System.out.println("Step 3: User is clicking on login button");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @Then("^user should land on home page$")
    public void user_should_land_on_home_page() {
        System.out.println("User lands on homepage");
        driver.close();

    }

}
