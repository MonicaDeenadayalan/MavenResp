package org.PackageEXe;

import org.locator.BookingPage;
import org.pac.BaseClass;
public class BookingPageExe extends BookingPage {
	
		public static void location()
		{
			BookingPage l=new BookingPage();
			BaseClass.selectbyvalue(l.getLocation(), BaseClass.excelreuseRead(0, 1));
		}
		public static void hotel()
		{
			BookingPage l=new BookingPage();
			BaseClass.selectbyvalue(l.getHotel(), BaseClass.excelreuseRead(1, 1));
		}
		
		public static void roomType()
		{
			BookingPage l=new BookingPage();
			BaseClass.selectbyindex(l.getRoom(), 2);
		}
		
		public static void roomNo() 
		{
			BookingPage l=new BookingPage();
			BaseClass.selectbyvalue(l.getRoomno(), "2");
		}
		public static void Search()
		{
			BookingPage l=new BookingPage();
			BaseClass.clickdata(l.getSumbit());
		}
	}
