package ija.ija2015.homework1.board;


public class Disk extends java.lang.Object {

	private boolean disk;
	public Disk(boolean isWhite) {
		disk = isWhite;
	}
	public void turn(){
		if(disk) disk = false;
		else disk = true;
	}
	public boolean isWhite(){
		if(disk) return true;
		else return false;
	}
	
	
}
