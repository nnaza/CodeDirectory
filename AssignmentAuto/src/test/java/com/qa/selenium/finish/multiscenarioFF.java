package com.qa.selenium.finish;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class multiscenarioFF {
	
	
WebDriver browser=null;
	  


@When("^I start the browser$")
public void I_start_the_browser() 
    {
	System.setProperty("webdriver.ie.driver","D:\\selenium drivers\\IEDriverServer.exe");
	
	browser = new InternetExplorerDriver();
	
	browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	  }

@And("^Navigate to \"([^\"]*)\" url$")
public void Navigate_to_URL(String URL) 
    {
	
	browser.get(URL);
	
String PageTitleExpected= "Example Domain";

String PagetitleActual =browser.getTitle();

Assert.assertEquals(PageTitleExpected, PagetitleActual);
	System.out.println("Congratulations user navigated to correct page");
	
	browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}

@And("^I click on the \"([^\"]*)\" page link$")
public void I_click_on_the_PageLink (String ExpectedPageLink) 

    {
	
	WebElement Clickevent=  browser.findElement(By.xpath("//div//p//a[text()='More information...']"));
	String Actualpagelink= browser.findElement(By.xpath("//div//p//a[text()='More information...']")).getText();
	Assert.assertEquals(ExpectedPageLink, Actualpagelink);
	
	Clickevent.click();
	
	browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
    }

@Then("^a link with text1 \"([^\"]*)\" must be present$")
public void a_link_with_text_RFC_2606_must_be_present(String TEXT1) 
    {
	
	String ActualpageURL= browser.getCurrentUrl();
	String ExpectedURL="https://www.iana.org/domains/reserved";
	Assert.assertEquals(ExpectedURL, ActualpageURL);
	System.out.println("Redirected to more information link successfully");
	
	String bodytext1=browser.findElement(By.xpath("//p//a[text()='RFC 2606']")).getText();
	
	Assert.assertEquals(TEXT1, bodytext1);
	System.out.println("Verified link with text RFC 2606 is present on page successfully");
	
	browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    }


@And("^a link with text2 \"([^\"]*)\" must be present$")
public void a_link_with_text_RFC_6761_must_be_present(String TEXT2) 
    {
	String bodytext2=browser.findElement(By.xpath("//p//a[text()='RFC 6761']")).getText();
	
	Assert.assertEquals(TEXT2, bodytext2);
	System.out.println("Verified link with text RFC 6761 is present on page successfully");
	
	browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
    }

@And("^the Domain Name box must contain \"([^\"]*)\" at index 2$")
public void the_DomainName_box_must_contain_Root_Zone_at_index_2(String ExpectedDomainName)
    {
	
	String ActualDomainName=browser.findElement(By.xpath("//div//ul//li[@id='nav_dom_root']//a[text()='Root Zone Management']")).getText();
	
	Assert.assertEquals(ExpectedDomainName, ActualDomainName);
	System.out.println("Verified Domain Name box contained Root Zone Management present at index 2 Successfully");
	
	
    }

@Then("^Close browser$")
public void Close_browser()
   
    {
	browser.quit();
	browser=null;
	
    }


}
