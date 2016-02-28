package ija.ija2015.homework1.board;


public class Board extends java.lang.Object{
	private Field pole[][];
	private int size;
	
	public Board(int size){
		pole = new Field[size][size];
		this.size = size;
	}
	
	public Field getField(int row, int col){
		if((row <= 0 || row >= size+1) &&(col <= 0 || col >= size+1)){
			return null;
		}
		return pole[row][col];
	}
	
	public int getSize(){
		return pole.length;
	}
}
