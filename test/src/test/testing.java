package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<puppy> puppies = new ArrayList<puppy>();
		puppy dog = new puppy("bob", "dog");
		System.out.println(dog.breed);
		change(dog);
		System.out.println(dog.breed);
		puppy joe = new puppy ("joe", "husky");
		puppies.add(dog);
		puppies.add(joe);
		System.out.println("serializing....");
		try{

			FileOutputStream fileOut = new FileOutputStream("test.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(puppies);
			out.close();
			fileOut.close();
			
		}catch(IOException i){
			i.printStackTrace();
		}
		System.out.println("deserializing...");
		ArrayList<puppy> deser = null;
		
		try
	      {
	         FileInputStream fileIn = new FileInputStream("test.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         deser = (ArrayList<puppy>) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("puppy class not found");
	         c.printStackTrace();
	         return;
	      }
		if(deser !=null){
			for (int i =0; i<deser.size(); i++){
				System.out.println(deser.get(i).breed + " " + deser.get(i).name);
			}
		}else{
			System.out.println("omg serialization sux");
		}
		
	}
	
	public static void change(puppy dog){
		dog.breed = "puppy";
	}
}
