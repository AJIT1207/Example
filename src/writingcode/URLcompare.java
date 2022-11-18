package writingcode;

import java.net.MalformedURLException;
import java.net.URL;

public class URLcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			boolean value = new URL("http://naveenautomationlabs.com/").equals(new URL("https://45.130.228.5"));
			System.out.println(value);
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
