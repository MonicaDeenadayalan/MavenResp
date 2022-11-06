package org.PackageEXe;



import org.locator.LoginPage;
import org.locator.PaymentPage;
import org.pac.BaseClass;


public class PaymentPageExe extends PaymentPage{
	public static void firstName()
	{
//	 PaymentPage c=new PaymentPage();
	 BaseClass.sendkeys(new PaymentPage().getFirstname(), BaseClass.excelreuseRead(3, 0));
	}
	public static void lastName()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.sendkeys(c.getLastname() ,BaseClass.excelreuseRead(3, 1));
	}
	public static void address()
	{
		PaymentPage c=new PaymentPage();

		BaseClass.sendkeys(c.getAddress(),BaseClass.excelreuseRead(3, 2));
	}
	public static void cardNo()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.sendkeys(c.getCardNo(),BaseClass.excelreuseRead(3, 3));
	}
	public static void cardType()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.selectbyindex(c.getCardType(), 1);
	}
	public static void expMonth()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.selectbyindex(c.getExpMonth(),10);
	}
	public static void expYear()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.selectbyindex(c.getExpYear(),12);
	}
	public static void cvv()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.sendkeys(c.getCvv(),BaseClass.excelreuseRead(3, 3));
	}
	public static void Book() 
	{
		PaymentPage c=new PaymentPage();
		BaseClass.clickdata(c.getBooknow());
		
	}
	public static void iten()
	{
		PaymentPage c=new PaymentPage();
		BaseClass.clickdata(c.getIten());
		
	}
}



