/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package UserRegMav;
import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class UserRegistrationTest {
	
	public static UserRegMain ob=new UserRegMain();;
	@Test
	public void checkFirstName()
	{
		try{
			if(ob.check_first_name.de("Ashok"))
			System.out.println("Happy");
		else
			System.out.println("Sad");}
		catch (Exception e)
		{
			
		}
	}
	@Test
	public void checkLastName()
	{
		try{if(ob.check_last_name.de("Kumar"))
			System.out.println("Happy");
		else
			System.out.println("Sad");}
		catch (Exception e) {}
	}
	/*@Test
	public void checkValidEmail()
	{
		if(ob.emailValidity("ashok.kumar@gmail.com"))
			System.out.println("Happy");
		else
			System.out.println("Sad");
	}**/
	
	@Test
	public void checkValidMobileNumber()
	{
		try{
			if(ob.check_number.de("91 9831081745"))
		
			System.out.println("Happy");
		else
			System.out.println("Sad");}
		catch (Exception e)
		{
			
		}
	}
	@Test
	public void checkPassword()
	{
		try{
			if(ob.check_password.de("fafafafafa"))
			System.out.println("Happy");
		else
			System.out.println("Sad");}
		catch (Exception e) {}
		
	}
}
