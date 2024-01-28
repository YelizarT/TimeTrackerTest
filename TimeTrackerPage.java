package com.crewmeister.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeTrackerPage {

    private final WebDriver driver;

    public TimeTrackerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clockIn() {
        WebElement clockInButton = driver.findElement(By.id("clockInButton"));
        clockInButton.click();
    }

    public boolean isClockOutButtonDisplayed() {
        return driver.findElement(By.id("clockOutButton")).isDisplayed();
    }

    public void clockOut() {
        WebElement clockOutButton = driver.findElement(By.id("clockOutButton"));
        clockOutButton.click();
    }

    public boolean isClockInButtonDisplayed() {
        return driver.findElement(By.id("clockInButton")).isDisplayed();
    }

    public String getTimeTableText() {
        return driver.findElement(By.id("timeTable")).getText();
    }

    public void clickEditLastEntry() {
        WebElement editButton = driver.findElement(By.cssSelector(".editButton:last-child"));
        editButton.click();
    }

    public String getEmployeeNameText() {
        return driver.findElement(By.id("employeeName")).getText();
    }
}
