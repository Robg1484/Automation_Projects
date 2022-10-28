package com.junitproject.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.junitproject.qa.base.TestBase;

public class HomePage extends TestBase{
	
	Select select;
	
	
	@FindBy(name = "allbox") WebElement checkAll;
	
	@FindBy(name = "todo[0]") WebElement firstToDoListCheckBox;
	
	@FindBy(xpath = "//input[@value='Remove']") WebElement removeButton;
	
	
	@FindBy(name = "data") WebElement addDataToToDoListField;
	
	@FindBy(xpath = "//*[@value='Add']") WebElement addDataToToDoListButton;
	
	@FindBy(name = "due_month") public  WebElement monthDropdown;
	
	@FindBy(xpath = "//*[@onclick='myFunctionSky()']") public WebElement setSkyBlueButton;
	
	@FindBy(xpath = "//*[@onclick='myFunctionWhite()']") public WebElement setWhiteButton;
	
	@FindBy(name = "categorydata") WebElement addCategoryField;
	
	@FindBy(xpath = "//*[@value='Add category']") WebElement addCategoryButton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickCheckAllBox(){
		
		checkAll.click();
	}	
	public void clickFirstToDoListCheckBox(){
		
		firstToDoListCheckBox.click();
	}	
	public void clickRemoveButton(){
		
		removeButton.click();
	}	
	public void clickAddDataToToDoListField(){
		
		addDataToToDoListField.click();
	}	
	public void clickAddDataToToDoListButton(){
		
		addDataToToDoListButton.click();
	}	
	public void enterAddCategoryFieldData(String categoryData){
		
		addCategoryField.sendKeys(categoryData);
	}	
	public void clickAddCategoryButton(){
		
		addCategoryButton.click();
	}	
	public void clickMonthDropdown(){
		
		monthDropdown.click();		
	}	

	public void clicksetSkyBlueButton(){
		
		setSkyBlueButton.click();
	}	
	public void clicksetWhiteButton(){
		
		setWhiteButton.click();
	}	


}




