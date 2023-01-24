package com.serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingGame {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		NFSgame game=new NFSgame("MonsterDrive", 150000, 18, 1);
		
		ObjectOutputStream objeOut=new ObjectOutputStream(new FileOutputStream("./nfs.ser"));
		objeOut.writeObject(game);
	}
}
