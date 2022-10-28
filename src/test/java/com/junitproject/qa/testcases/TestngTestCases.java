package com.junitproject.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.junitproject.qa.base.TestBase;
import com.junitproject.qa.pages.HomePage;
import com.junitproject.qa.util.TestUtil;

public class TestngTestCases extends TestBase {

	TestUtil testUtil = new TestUtil();
	HomePage homePage;
	Select select;
	WebDriverWait wait;

	
	public TestngTestCases() {
		super();
	}
	

	@BeforeTest
	public void setup() {
		init();
		homePage = new HomePage();
	}
	

	@Test(priority = 1)
	public void validateUserCanAddCategory() {
		homePage.enterAddCategoryFieldData("klk");
		homePage.clickAddCategoryButton();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		if (driver.findElement(By.xpath("//*[contains(text(),'klk')][1]")) != null) {
			try {
				testUtil.takeSnapShot(driver, "Screenshots\\validateUserCanAddCategory.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	@Test(priority = 2)
	public void validateMonthDropDownHasAllMonths() {

		homePage.clickMonthDropdown();

		try {
			testUtil.takeSnapShot(driver, "Screenshots\\validateMonthDropDownHasAllMonths.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Test(priority = 3)
	public void validateUserCannotDuplicateCategory() {
		homePage.enterAddCategoryFieldData("klk");
		homePage.clickAddCategoryButton();
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		if (driver.findElement(By.xpath("//a[contains(text(), 'Nevermind')]")) != null) {
			try {
				testUtil.takeSnapShot(driver, "Screenshots\\validateUserCannotDuplicateCategory.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		driver.findElement(By.xpath("//a[@href='javascript:history.back();']")).click();

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[span='klk']")).click();
		driver.findElement(By.linkText("Yes")).click();

	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
