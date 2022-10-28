package steps;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import com.junitproject.qa.base.TestBase;
import com.junitproject.qa.pages.HomePage;
import com.junitproject.qa.util.TestUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BGStepDefiniton extends TestBase{

	HomePage homePage;
	TestUtil testUtil = new TestUtil();

	public BGStepDefiniton() {
		super();
	}

	@Before
	public void setUp() {
		init();
		homePage = new HomePage();
	}
	@Given("^User is on techfios test page$")
	public void user_is_on_techfios_test_page() {
		
		if (driver.getCurrentUrl() == "https://techfios.com/test/101/") {
			try {
				testUtil.takeSnapShot(driver, "Screenshots\\user_is_on_techfios_test101_page.png");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Given("^Set SkyBlue Background button exists$") 
	public void skyblue_button_exists() {	
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		Assert.assertEquals(homePage.setSkyBlueButton.getText(), "Set SkyBlue Background");
		System.out.println(homePage.setSkyBlueButton.getText());
	}
		
	@When("^I click on the Set SkyBlue Background button$")
	public void i_click_on_the_set_skyblue_button() {
		homePage.clicksetSkyBlueButton();
	}
			
	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		System.out.println("goodbye");
		try {
			testUtil.takeSnapShot(driver, "Screenshots//the_background_color_will_change_to_sky_blue.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Given("^Set White Background exists$")
			public void white_button_exists() {
			homePage.clicksetSkyBlueButton();
			Assert.assertEquals(homePage.setWhiteButton.getText(), "Set White Background");
			System.out.println(homePage.setWhiteButton.getText());
			
		}
	
	@When("^I click on the Set White Background white button$")
	public void i_click_on_the_set_white_button() {
		driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		homePage.clicksetWhiteButton();
	}

	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
		try {
			testUtil.takeSnapShot(driver, "Screenshots//the_background_color_will_change_to_white.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	   
	
@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
