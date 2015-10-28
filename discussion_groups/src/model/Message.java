package model;

import java.util.Calendar;



public class Message {
	
	Message prev;
	Members author;
	Calendar date;
	String message;
	Threads thread;
	
	public Message(Members author, Calendar date, String message, Threads thread, Message prev){
		
	}

	public Message getPrev() {
		return prev;
	}

	public void setPrev(Message prev) {
		this.prev = prev;
	}

	public Members getAuthor() {
		return author;
	}

	public void setAuthor(Members author) {
		this.author = author;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Threads getThread() {
		return thread;
	}

	public void setThread(Threads thread) {
		this.thread = thread;
	}
	
}
