package com.junitproject.qa.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.junitproject.qa.base.TestBase;
import com.junitproject.qa.pages.HomePage;
import com.junitproject.qa.util.TestUtil;

public class JunitTestCases extends TestBase {

	TestUtil testUtil = new TestUtil();
	HomePage homePage;

	public JunitTestCases() {
		super();
	}

	@Before
	public void setup() {
		init();
		homePage = new HomePage();
	}

	@Test
	public void validateAllCheckBoxesChecked() {

		homePage.clickCheckAllBox();
		try {
			testUtil.takeSnapShot(driver, "Screenshots\\validateAllCheckBoxesChecked.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
		homePage.clickCheckAllBox();
	}
	@Test
	public void validateSingleListItemCanBeRemoved() {
		
		homePage.clickFirstToDoListCheckBox();
		homePage.clickRemoveButton();
		try {
			testUtil.takeSnapShot(driver, "Screenshots\\validateSingleListItemCanBeRemoved.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
		
		
		@Test
		public void validateAllListItemsCanBeRemoved() {
			
			homePage.clickCheckAllBox();
			homePage.clickRemoveButton();
			try {
				testUtil.takeSnapShot(driver, "Screenshots\\validateAllListItemsCanBeRemoved.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	
	

    	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
