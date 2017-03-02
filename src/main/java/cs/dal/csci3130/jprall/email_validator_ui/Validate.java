package cs.dal.csci3130.jprall.email_validator_ui;

public class Validate {
	
	public static int Tests(String email) {
		int numErrors = 0;
		if (!atTest(email))
			numErrors++;
			
		if (!email.contains("."))
			numErrors++;
		
		if (!lenTest(email))
			numErrors++;
		
		if (!domainName(email))
			numErrors++;
		return numErrors;
	}
	
	public static boolean atTest(String email) {
		char[] emailArray = email.toCharArray();
		int numHits = 0;
		
		for (int i = 0; i < email.length(); i++) {
			
			if (emailArray[i] == '@')
				numHits++;
		}
		System.out.print(numHits);
		if (numHits == 1)
			return true;
		return false;
	}
	
	public static boolean lenTest(String email) {
		if (email.length() > 5)
			return true;
		return false;
	}
	
	public static boolean domainName(String email) {
		if (email.contains("dal"))
			return true;
		else if (email.contains("hotmail"))
			return true;
		else if (email.contains("outlook"))
			return true;
		else if (email.contains("gmail"))
			return true;
		else if (email.contains("yahoo"))
			return true;
		else if (email.contains("sympatico"))
			return true;
		
		return false;
		
	}
}