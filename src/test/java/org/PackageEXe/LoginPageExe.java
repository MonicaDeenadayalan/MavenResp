package org.PackageEXe;

import org.locator.LoginPage;
import org.pac.BaseClass;

public class LoginPageExe extends LoginPage {
	
		
		public static void username() {
			
			BaseClass.sendkeys(new LoginPage().getUsername(), BaseClass.excelreuseRead(0,0));
		}
		
		
		public static void password() {
			
			BaseClass.sendkeys(new LoginPage().getPassword(), BaseClass.excelreuseRead(1, 0));
		}

		public static void login() {
			
			BaseClass.clickdata(new LoginPage().getLogin());
		}

	}



