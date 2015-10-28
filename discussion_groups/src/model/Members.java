package model;

import java.util.ArrayList;

public class Members {
	private String name;
	private ArrayList<Owner> owned;
	private ArrayList<Group> memberof;
	private ArrayList<Moderator> moderatorof;
	
	
	/**
	 * constructor
	 * */
	public Members(String name){
		
	}
	
	//setters 
	public void setName(String name) {
		this.name = name;
	}

	public void setOwned(ArrayList<Owner> owned) {
		this.owned = owned;
	}

	public void setMemberof(ArrayList<Group> memberof) {
		this.memberof = memberof;
	}

	public void setModeratorof(ArrayList<Moderator> moderatorof) {
		this.moderatorof = moderatorof;
	}
	//getters
	
	public String getName() {
		return name;
	}

	public ArrayList<Owner> getOwned() {
		return owned;
	}

	public ArrayList<Group> getMemberof() {
		return memberof;
	}

	public ArrayList<Moderator> getModeratorof() {
		return moderatorof;
	}
	
	
	//to post a message to that group
	public void postMessage(Group group){}
	
	//read messages to that group
	public void readMessage(Group group){}
	
	//join to that group
	public void joinGroup(Group group){}
	
	//delete from a group 
	public void leaveGroup(Group group){}
	
	//become a moderatorof that group
	public boolean acceptModerator(Moderator moderator){
		return false;
	}
	
	//create group with the name
	public void createGroup(Group group){}
	
	//invite owner
	public void inviteOwnership(Group group){}
	
	//accept ownership
	public boolean acceptOwnership(Group group){
		return false;
	}
	
	//invite a moderator
	public void inviteModerator(Members mem){}
	
	//delete group being the owner
	public void deleteGroup(Owner group){}
	
	//resign as a moderator
	public void resignModerator(Moderator groupname){}

}
