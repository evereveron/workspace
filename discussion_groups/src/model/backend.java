package model;

import java.util.ArrayList;

public interface backend {
	public void login(Members user);
	public void addUser(String user);
	public void deleteUser(String user);
}
