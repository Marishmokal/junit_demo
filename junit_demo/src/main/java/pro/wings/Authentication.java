package pro.wings;

public class Authentication {

	public boolean login(String username,String password)
	{
		
		if(username.equalsIgnoreCase("Marish@123") && (password.equals("T@1234#")))
		{
			return true;
		}
		else
			return false;
	}
		
}
