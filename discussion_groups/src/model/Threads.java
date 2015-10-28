package model;

import java.util.ArrayList;

public class Threads {
	
	ArrayList<Message> messages;
	Group group;
	Members owner;
	
	public Threads(Group group, Members owner, Message initialMessage){
		
	}

	public ArrayList<Message> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

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
}
