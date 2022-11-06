package org.locator;

import org.PackageEXe.LoginPageExe;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends LoginPageExe {
	public BookingPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="Submit")
	private WebElement sumbit;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getSumbit() {
		return sumbit;
	}
	
	

}


