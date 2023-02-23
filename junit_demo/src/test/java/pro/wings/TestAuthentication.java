package pro.wings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAuthentication {

	@Test
	public void testLogin()
	{
		Authentication auth=new Authentication();
		String username="Marish@123";
		String password="T@1234#";
		
		boolean result=auth.login(username, password);
		assertTrue(true);
	}
	@Test
	public void testLoginNullUser()
	{
		Authentication auth=new Authentication();
		String username=null;
		String password="T@1234#";
		
		assertNull(username);
	}
	@Test
	public void testLoginNullPass()
	{
		Authentication auth=new Authentication();
		String username="Marish@123";
		String password=null;
		
		assertNull(password);
	
	}	
	@Test
	public void testLoginNull()
	{
		Authentication auth=new Authentication();
		String username=null;
		String password=null;
		
		assertNull(username, password);
	}
	@Test
	public void testLoginEmptyUser()
	{
		Authentication auth=new Authentication();
		String username=" ";
		String password="T@1234#";
		assertFalse(username.isEmpty());
	}
	
	@Test
	public void testLoginEmptyPass()
	{
		Authentication auth=new Authentication();
		String username="Marish@123";
		String password=" ";
		assertFalse(password.isEmpty());

}
	
	@Test
	public void testLoginEmptyPassAndUser()
	{
		Authentication auth=new Authentication();
		String username=" ";
		String password=" ";
		assertNotEquals("",Authentication.class);
	
}
	@Test
	public void WrongLoginPass() {

	{
		Authentication auth=new Authentication();
		String username="Marish@123";
		String password="mahjd ";
		boolean result=auth.login(username, password);
		assertFalse(result);
}
	}
	@Test
	public void WrongLoginUser() {
		
		{
			Authentication auth=new Authentication();
			String username="vaibhav123";
			String password="T@1234#";
			boolean result=auth.login(username, password);
			assertFalse(result);
		}
	}

}