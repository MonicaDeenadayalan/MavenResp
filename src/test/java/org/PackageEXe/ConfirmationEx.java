package org.PackageEXe;


import org.locator.ConfirmationPage;
import org.pac.BaseClass;

public class ConfirmationEx extends ConfirmationPage {
	public static void radioButton() 
	{
		ConfirmationPage cl=new ConfirmationPage();
	BaseClass.clickdata(cl.getRadiobutton());
	
	}
	public static void continueB()
	{
		ConfirmationPage cl=new ConfirmationPage();
	BaseClass.clickdata(cl.getContinue1());	
	}
}