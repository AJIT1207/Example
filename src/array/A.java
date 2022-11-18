package array;

 class A {
   public static void main(String[] args) {
	String str = "ajit jaiswal";
	
	String[] newstr = str.split(" ");
	
	String capitalWord = "";
	
	for (String string : newstr) {
	//	System.out.println(string);
	String first = string.substring(0,1);
	String afterfirst = string.substring(1);
	
	capitalWord = capitalWord + first.toUpperCase() + afterfirst + " ";
	
	
	}
	
	System.out.println(capitalWord);
	
}
}