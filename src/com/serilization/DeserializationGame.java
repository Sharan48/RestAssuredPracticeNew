package com.serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationGame {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream objIn=new ObjectInputStream(new FileInputStream("./nfs.ser"));
		NFSgame out = (NFSgame)objIn.readObject();
		
		System.out.println(out.name);
		System.out.println(out.level);
		System.out.println(out.life);
		System.out.println(out.score);
		
	}

}
