package UserRegMav;

public class UserRegException extends Exception{
	ExceptionType exceptiontype;
	enum ExceptionType{
		ENTERED_NULL,ENTERED_EMPTY,INVALID_FIRSTNAME,INVALID_LASTNAME,INVALID_MOBILE,INVALID_EMAIL,INVALID_PASSWORD;
	}
	public UserRegException(ExceptionType exceptiontype, String message) {
		super(message);
		this.exceptiontype=exceptiontype;
		System.out.println(message);
	}

}
