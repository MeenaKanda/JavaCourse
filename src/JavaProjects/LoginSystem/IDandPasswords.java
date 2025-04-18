package JavaProjects.LoginSystem;

import java.util.HashMap;

public class IDandPasswords {
	
	
	HashMap<String, String> loginInfo = new HashMap<String, String>();
	
    IDandPasswords(){
	loginInfo.put("Meena", "123");
	loginInfo.put("code", "code123");
	loginInfo.put("Tan", "tan123");
	loginInfo.put("Sam", "sam123");
	}

	public HashMap<String, String> getLoginInfo() {
		
		return loginInfo;
	}

}
