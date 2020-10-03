package UserRegMav;
import java.util.*;
import org.junit.*;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterUser {
	private String email;
	private boolean expectedres;
	private UserRegMain user;
	@Before
	public void initialize()
	{
		user=new UserRegMain();
	}
	public ParameterUser(String email, boolean res)
	{
		this.email=email;
		expectedres=res;
	}
	@Parameterized.Parameters
	public static Collection emails()
	{
		return Arrays.asList(new Object[][] {{"abc@yahoo.com",true}, {"abc-100@yahoo.com",true}, {"abc.100@yahoo.com",true}, {"abc111@abc.com",true}, {"abc-100@abc.net",true},
			{"abc.100@abc.com.au",true}, {"abc@1.com",true}, {"abc@gmail.com.com",true}, {"abc+100@gmail.com",true}});
		
	}
	@Test
	public void checkEmail() throws UserRegException
	{
		try {
		Assert.assertEquals(expectedres, user.check_email.de(email));
		}
		catch(Exception e)
		{
		}
	}
}