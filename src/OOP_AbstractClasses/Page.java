package OOP_AbstractClasses;

public abstract class Page implements Web {
	// In abstract class abstract keyword is mandatory in abstract method .
	// Abstract class can have Abstract method and normal method also.
	// it can have only Abstract method(100% abstraction)
	// it can have only normal methods(0% abstraction)
	// or can have both also (x% abstraction - partial abstraction)

	// 2+2
	// 0% abstraction : no abstraction methods
	// x% abstraction : partial abstraction
	// 100% abstraction : all abstraction methods

	// can not create the Object of abstraction class.
	// but we can create the constructor of the abstract class
	// and constructor will be called when we create the object of child class

	// when parent and child class both having constructor,while creating Obj of
	// child class
	// first the preference will be given to parent class const..(Page) then child
	// class(LoginPage)
	// parent class const.. will be called first and 2nd child class const..

	public Page() {
		this(20); // using this keyword we can call parameterized const..
		System.out.println("Page - const...");
	}

	public Page(int i) { // overloading const..
		System.out.println("Page -- const..  " + i);
	}

	public abstract void title();

	public abstract void url();

	public final void displalyLogo() {
		System.out.println("Page -- Logo");
	}

	public void pageLoadingTime() {
		System.out.println("Page loading time 10 secs");
	}

//	public static abstract void pageCycle();  //static method can not be abstract

	public static void pageCycle() {
		System.out.println("Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("Page - Privacy Policy");

	}

}
