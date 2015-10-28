package model;

import java.util.ArrayList;


public class Group {
	
	ArrayList<Members> member;
	ArrayList<Threads> thread;
	Members owner;
	Members moderator;
	
	//constructor
	public Group(Members owner){
		
	}
	//getters and setters
	public ArrayList<Members> getMember() {
		return member;
	}

	public void setMember(ArrayList<Members> member) {
		this.member = member;
	}

	public ArrayList<Threads> getThread() {
		return thread;
	}

	public void setThread(ArrayList<Threads> thread) {
		this.thread = thread;
	}

	public Members getOwner() {
		return owner;
	}

	public void setOwner(Members owner) {
		this.owner = owner;
	}

	public Members getModerator() {
		return moderator;
	}

	public void setModerator(Members moderator) {
		this.moderator = moderator;
	}
	
	//other methods
	//display the threads in the group
	public void listThreads(){
		
	}
	//display the members of the group
	public void listMembers(){
		
	}
	
	
	
}
