package Arquivos;

import java.io.Serializable;

public class Players implements Serializable {

	private int id;
	private String name;
	private float score;
	
	 public Players(int id, String name, float score) {
 
		 
		 this.id=id;
		 this.name=name;
		 this.score=score;
		 
	 }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	 
	 public String toString(){
	 
	 return id +";"+name +";"+score;
	 }
	 public String ShowInfos(){
		 return "Players("+id+","+name+","+score+")";
		 
	 }
		
	}
