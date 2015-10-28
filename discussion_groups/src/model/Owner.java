package model;

public class Owner {
	
	//you own a group
	private Group group;
	

	private Members owner;
	
	public Owner(Group group, Members owner){
		
	}
	
	//getters and setters
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Members getOwner() {
		return owner;
	}

	public void setOwner(Members owner) {
		this.owner = owner;
	}
	
	//invite user
	public void inviteUser(Members user){}
	
	//invite a moderator
	public void inviteModerator(Members user){}
	
	//invite for an ownership
	public void inviteOwner(Members user){}
	
	//delete a group
	public void deleteGroup(Group group){
		
	}
	
		
}
