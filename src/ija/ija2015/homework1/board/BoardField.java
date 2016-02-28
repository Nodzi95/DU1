package ija.ija2015.homework1.board;

public class BoardField extends java.lang.Object implements Field{
	private int row;
	private int col;
	private Field pole[][];
	
	public BoardField(int row, int col){
		//System.out.println("neco");
		this.row = row;
		this.col = col;	
	}
	public void addNextField(Field.Direction dirs, Field field){
		//field[row][col]
	}
	public Field nextField(Field.Direction dirs){
		int x;
		int y;
		switch(dirs){
		case L:
			x = row - 1;
			y = col;
			break;
		case LU:
			x = row - 1;
			y = col + 1;
			break;
		case U:
			x = row;
			y = col + 1;
			break;
		case RU:
			x = row + 1;
			y = col + 1;
			break;
		case R:
			x = row + 1;
			y = col;
			break;
		case RD:
			x = row + 1;
			y = col - 1;
			break;
		case D:
			x = row;
			y = col - 1;
			break;
		case LD:
			x = row - 1;
			y = col - 1;
			break;
		default:
			x = row;
			y = col;
			break;
		}
		//System.out.println("neco");
		return pole[x][y];
		
	}
	public boolean putDisk(Disk disk){
		if(getDisk() != null){
			pole[row][col] = (Field)disk;
			return true;
		}
		else return false;
	}
	public Disk getDisk(){
		if(pole[row][col] != null){
			return (Disk)pole[row][col];
		}
		else return null;
		
	}
}
