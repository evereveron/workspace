package model;

import java.util.ArrayList;

public class Users implements backend {

	
	public ArrayList<Members> users;
	
	public Users(){
		users = new ArrayList<Members>();
	}
	public void login(Members user){}
	public void addUser(String user){}
	public void deleteUser(String user){}
}
