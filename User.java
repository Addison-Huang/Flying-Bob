abstract class User {
    protected String username;
    protected String password;

    public User(String u, String p) {
	username = u;
	password = p;
    }
    
    public String getUser() {
	return username; 
    }

    public String setUser(String u) {
	String tmp = username;
	username = u;
	return tmp;
    }
        
    public String getPass() {
	return password; 
    }

    public String setPass(String p) {
	String tmp = password;
	password  = p;
	return tmp;
    }
    
}
