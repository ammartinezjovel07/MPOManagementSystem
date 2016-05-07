package database;
import user.*;

import java.util.ArrayList;

import user.Account;

public class TestMain {

	
	public static void main(String args[])
	{
		Account ac = null;
	
		Administrator admin = new Administrator();
		admin.createAccount("luis", 'c', "luis" ,"luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", "luis", true);
//		DatabaseHandler db = new DatabaseHandler();
//		
//		db.createUser(admin);
	}
}
