package com.serilization;

import java.io.Serializable;

public class NFSgame implements Serializable {
		String name;
		long score;
		int level;
		int life;
		public NFSgame(String name, long score, int level, int life) {
			super();
			this.name = name;
			this.score = score;
			this.level = level;
			this.life = life;
		}
		
	}


