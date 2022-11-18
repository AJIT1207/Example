package writingcode;

import java.text.DateFormat.Field;

public class Stringtranslator {
	
		static
		{
			try {
				java.lang.reflect.Field value = String.class.getDeclaredField("value");
				value.setAccessible(true);
				value.set("Hello Ajit", value.get("Hola Ajit"));
				value.set("Hello Akshat", value.get("Hola Java"));
				value.set("Hello Java", value.get("Hola programming"));
			}
				 catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Auto bots
		
		System.out.println("Hello Ajit");
		System.out.println("Hello Java");
	}

}
