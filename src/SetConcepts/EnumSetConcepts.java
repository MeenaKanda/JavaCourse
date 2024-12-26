package SetConcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {
	
	// it not synchronized
	// it is highly performance java collection member
	//faster than hashset because all the methods are implemented using bitwise arithmetic operations
	//bitwise arithmetic operation is quite fast than normal arithmetic operation
	
	
     enum Lang{
		JAVA,
		CSHARP,
		JAVASCRIPT,
		PYTHON,
		RUBY
	}

	

	public static void main(String[] args) {
	
		//create new enumSet using enum::
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);  //[JAVA, CSharp, JAVASCRIPT, PYTHON, RUBY]
		
		//create empty enumSet:
		EnumSet<Lang> l = EnumSet.noneOf(Lang.class);
		System.out.println(l);//[]
		
		
		// range(e1, e2)
		EnumSet<Lang> enumRange = EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);
		System.out.println(enumRange);  //[JAVA, CSharp, JAVASCRIPT]
		
		//of() method
		EnumSet<Lang> CSharpEnum = EnumSet.of(Lang.CSHARP);
		System.out.println(CSharpEnum); //[CSHARP]
		
		EnumSet<Lang> multipleEnum = EnumSet.of(Lang.JAVA, Lang.RUBY);
		System.out.println(multipleEnum);  //[JAVA, RUBY]
		
		//add and addAll():
		EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);  //blank enum
		
		lang2.add(Lang.JAVASCRIPT);
		System.out.println(lang2);   //[JAVASCRIPT]
		
		lang2.addAll(lang1);
		System.out.println(lang2); //[JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY]
		
		System.out.println("=======================");
		
		// how to iterate inumSet::
		EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
		Iterator<Lang> it = fullLang.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			System.out.println(",");
		}
		
		System.out.println("=======================");
		
		//remove() and removeAll():
		
		EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
		System.out.println(newLang);  //[JAVA, CSHARP, JAVASCRIPT, PYTHON, RUBY]
		
		boolean b = newLang.remove(Lang.CSHARP);
		System.out.println(b); //true
		System.out.println(newLang); //[JAVA, JAVASCRIPT, PYTHON, RUBY]
		
		
		boolean b1 = newLang.removeAll(newLang);
		System.out.println(b1); //true
		System.out.println(newLang); //[]
		
	}

}
