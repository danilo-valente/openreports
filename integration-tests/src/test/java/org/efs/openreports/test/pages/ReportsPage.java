package org.efs.openreports.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage extends AuthenticatedBasePage {
    public ReportsPage(String baseUrl, WebDriver driver) {
        super(baseUrl, driver);
    }

    public boolean hasAccessToUploadReportFiles() {
        return driver.findElements(By.linkText("Upload Report Files")).size() > 0;
    }

    public UploadReportFilesPage clickUploadReportFiles() {
        WebElement link = driver.findElement(By.linkText("Upload Report Files"));
        link.click();
        return new UploadReportFilesPage(baseUrl, driver);
    }

    public boolean hasReport(String reportName) {
        return driver.findElements(By.linkText(reportName)).size() > 0;
    }

    public ReportPage clickReport(String reportName) {
        driver.findElement(By.linkText(reportName)).click();
        return new ReportPage(baseUrl, driver);
    }
}
