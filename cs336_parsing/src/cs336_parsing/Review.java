package cs336_parsing;

public class Review {
	String username;
	String stars;
	String reviews;
	String resReviews;
	String votes;
	String date;
	public Review(String username, String stars, String reviews,
			String resReviews, String votes, String date) {
		super();
		this.username = username;
		this.stars = stars;
		this.reviews = reviews;
		this.resReviews = resReviews;
		this.votes = votes;
		this.date = date;
	}
	public String toString() {
		return "[ username: " + username + "; stars: " + stars + "; reviews: " + reviews+"; resReviews: "+resReviews+"; votes: "+votes+"; date: "+date+ " ]";
	}
	
	public String toCsv() {
		return username+","+stars+","+date+","+reviews+","+resReviews+","+votes;
	}
	
	
}
