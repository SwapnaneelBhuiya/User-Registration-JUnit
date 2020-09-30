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
		return Arrays.asList(new Object[] {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
				"abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"});
		
	}
	@Test
	public void checkEmail()
	{
		Assert.assertEquals(expectedres, user.emailValidity(email));
	}

}
