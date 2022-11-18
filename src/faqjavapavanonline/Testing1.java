package faqjavapavanonline;

class Superclass
{
   int num = 100;
   void printNumber(){
		/* Note that instead of writing num we are
		 * writing super.num in the print statement
		 * this refers to the num variable of Superclass
		 */
		System.out.println(num);
	   }
}

public class Testing1 extends Superclass
{
	   int num = 110;
	   void printNumber(){
		/* Note that instead of writing num we are
		 * writing super.num in the print statement
		 * this refers to the num variable of Superclass
		 */
		System.out.println(num);
	   }
	   public static void main(String args[]){
		   Testing1 obj= new Testing1();
		   obj.printNumber();	
	   }
	}