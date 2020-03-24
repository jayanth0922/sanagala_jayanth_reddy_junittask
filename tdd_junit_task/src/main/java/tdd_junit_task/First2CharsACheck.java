package tdd_junit_task;

public class First2CharsACheck {

	public String check2Chars(String string) {
		if(string.length()<2) {
			if(string.length()==0)
					return string;
		    if(string.length()==1)
		    {
		    	if(string.charAt(0)=='A')
		    		return "";
		    	else
		    		return string;
		    }
		}
		char first_char=string.charAt(0);
		char second_char=string.charAt(1);
		String result="";
		if(first_char=='A' && second_char=='A')
			result=result+string.substring(2, string.length());
		else if(first_char=='A')
			result=string.substring(1, string.length());
		else if(second_char=='A')
			result=string.substring(0, 1)+string.substring(2, string.length());
		else
			result=string;
		return result;
	}
	
	
}
