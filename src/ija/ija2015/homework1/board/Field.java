package ija.ija2015.homework1.board;

public interface Field {
	
	public static enum Direction{
		L,
		LU,
		U,
		RU,
		R,
		RD,
		D,
		LD
	}
	
	
	void addNextField(Field.Direction dirs, Field field);

	Disk getDisk();
	
	Field nextField(Field.Direction dirs);
	
	boolean putDisk(Disk disk);


}

