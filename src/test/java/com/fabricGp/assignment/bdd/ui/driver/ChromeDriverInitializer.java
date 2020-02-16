package com.fabricGp.assignment.bdd.ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

@Component
public class ChromeDriverInitializer implements DriverInitializer, DisposableBean {

    private WebDriver driver;

    @Override
    public WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver",ChromeDriverInitializer.class.getResource("/drivers/chromedriver").getPath());
        this.driver = new ChromeDriver();
        return driver;
    }

    @Override
    public void destroy() throws Exception {
        if(driver!=null)
            driver.close();
    }
}
