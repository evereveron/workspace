package cs336_parsing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	public static BufferedReader br;
	public static String line;
	public static Restaurant curRes;
	public static ArrayList<Restaurant> resList = new ArrayList<Restaurant>();
	public static int i= 1;
	public static int iRes = -1;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("losangeles.txt") );
		line = br.readLine();
		while(line != null) {
			if(line.equals("--------------------------------------------------")){
				//new restaurant
				line = br.readLine(); //to get restaurant metadata 
				i++;
				iRes++;
				String[] split1 = line.split(" - ");
				String name = split1[0];
				String tosplit = split1[1];
				if(split1.length >2){
					name = name + " - " + split1[1];
					tosplit = split1[2];
				}
				//System.out.println(name);
				String[] split2 = tosplit.split("\\W+");
				String rank = split2[1];
				String stars;
				if(split2.length == 5){
					stars = split2[3] + "." + split2[4];
				}
				else stars = split2[3];
				
				curRes = new Restaurant(name, stars, rank);
				resList.add(curRes);
			}
			else if(!line.equalsIgnoreCase("")){
				parse(line);
			}
			line = br.readLine();
			i++;
		}
		//print();
		//System.out.println(i);
		writeToCsv();
	}
	
	public static void parse(String review){
		String stars = review.charAt(0) + "";
		String username;
		String reviews;
		String resReviews;
		String votes;
		String date;
		
		String next = review.substring(5);
		//System.out.println(next);
		String[] split1 = next.split("\\W+");
		username = split1[0];
		if(split1.length == 14) {
			username = username + " " + split1[1];
			reviews = split1[3];
			resReviews = split1[6];
			votes = split1[9];
			date = split1[11] + "-" + split1[12] + "-" + split1[13];
		}
		else {
			reviews = split1[2];
			resReviews = split1[5];
			votes = split1[8];
			date = split1[10] + "-" + split1[11] + "-" + split1[12];
		}
		Review r = new Review(username, stars, reviews, resReviews, votes, date);
		resList.get(iRes).reviews.add(r);
	}
	
	public static void print(){
		for(Restaurant res: resList) {
			for(Review rev: res.reviews) {
				System.out.println(rev.toString());
			}
		}
	}
	
	public static void writeToCsv() throws IOException {
		File file = new File("losangeles-table.csv");

		// if file doesnt exists, then create it
		if (!file.exists()) {
			file.createNewFile();
		}
		String content = "restaurant,rank,restaurant_avg_stars,uer_name,review_stars,review_date,user_reviews,user_restaurant_reviews,user_helpful_votes";

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		bw.newLine();
		for(Restaurant res: resList) {
			for(Review rev: res.reviews) {
				content = res.name+","+res.rank+","+res.stars+","+rev.toCsv();
				bw.write(content);
				bw.newLine();
			}
		}
		bw.close();

	}
}
