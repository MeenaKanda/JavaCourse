package OOP_AbstractClasses;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();

		// LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.displalyLogo();
		lp.pageLoadingTime();
		lp.reserPwd(); // individual

		Page.pageCycle();
		LoginPage.pageCycle();

		// create Obj of Page class(abstraction class) -> not allowed
		// Page pg = new Page();

		System.out.println("--------------------------");

		// top casting:
		// child class object can be referred by abstract parent class ref variable:
		Page pg = new LoginPage();
		pg.title();
		pg.url();
		pg.displalyLogo(); // inherited
		pg.pageLoadingTime(); // overridden
		// pg.resetPwd(); //not able to access because of individual method.

		// down casting? - NA - not allowed in compile time itself.

	}

}
