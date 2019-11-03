package com.codetest.exception;

public class ApplicationException extends Exception  {
	
	private static final long serialVersionUID = 813298357584445438L;
	
	public ApplicationException (String string) {
        super(string);
    }

}
