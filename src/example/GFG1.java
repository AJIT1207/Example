package example;
//object creation through Class.forName() method
public class GFG1 {
	// Declaring and initializing string
    String name = "GeeksForGeeks";
	// Main driver method
    public static void main(String[] args)
    {
        // Try block to check for exceptions
        try {
            Class cls = Class.forName("NewInstanceExample");
            GFG1 obj
                = (GFG1)cls.newInstance();
 
            System.out.println(obj.name);
        }
 
        // Catch block to handle the exceptions
 
        // Catch block 1
        // Handling ClassNotFound Exception
        catch (ClassNotFoundException e) {
            // Display the exception along with line number
            // using printStacktrace() method
            e.printStackTrace();
        }
 
        // Catch block 2
        // Handling InstantiationException
        catch (InstantiationException e) {
            e.printStackTrace();
        }
 
        // Catch block 2
        // Handling IllegalAccessException
        catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}



//Class.forName loads the class in java but never create object...to create an Object of the Class 

//Hashtable<Integer, String> ht = 