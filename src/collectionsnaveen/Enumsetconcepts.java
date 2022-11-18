package collectionsnaveen;

import java.util.EnumSet;

public class Enumsetconcepts {

	enum Lang {
		JAVA,
		RUBY,
		PYTHON,
		CSHARP,
		GOLANG
	}
	
	public static void main(String[] args) {
		
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		//empty enum set
		EnumSet<Lang> empty = EnumSet.noneOf(Lang.class);
		System.out.println(empty);
		

	}

}
