package model;

public class Moderator {

	private Group group;
	private Members member;
	

	

	public Moderator(Group group, Members member){}
	
	//getters and setters
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}
	
	public Members getMember() {
		return member;
	}

	public void setMember(Members member) {
		this.member = member;
	}
	
	//deny message -> false if not acceptable
	
	public boolean messageCheck(Message message){
		return false;
	}
	
	//resign as moderator
	public void resign(){
		
	}
}
