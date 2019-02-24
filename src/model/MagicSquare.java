package model;
/*This class is in charge to the MagicSquare and the corresponding methods.
 * @author: Alejandro Martinez
 */
public class MagicSquare {
	/*This method is in charge of create the Object type MagicSquare.
	 *@return: A MagicSquare object. 	
	 */
	public MagicSquare() {
		
	}
	/*This method is in charged to make the correct fill of Magic Square.
	 * @param: A int size that represent the size of the MagicSquare. size!=0;
	 * @param: A String ubication that represent the way to fill the MagicSquare. ubication!=null;
	 * @param: A String sence that represent the position to start the fill of the MagicSquare. sence!=null;
	 */
	public int[][] createdSquare(int size,String ubication,String sence) throws NumberFormatException, NegativeArraySizeException{		
        int[][] magicSquare = new int[size][size];
		
		int row= size;
		int column= size;
		
		if(sence.equalsIgnoreCase("Up")) {
			
		
			row= 0;
			column= size/2;
			
			if(ubication.equalsIgnoreCase("NO")) {
				for(int num = 1; num <= size*size;) {
					if(row== -1 && column== -1) {
						column= 0;
						row= 1;
					}else {
						if(column== -1) {
							column= size-1;
						}
						if(row== -1) {
							row= size-1;
						}
					}
					if(magicSquare[row][column] != 0) {
						column+=1;
						row+= 2;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column--; 
						row--;
					}
				}
			}else if(ubication.equalsIgnoreCase("NE")) {
				for(int num = 1; num <= size*size;) {
					if(row== -1 && column== size) {
						column= size-1;
						row= 1;
					}else {
						if(column== size) {
							column= 0;
						}
						if(row== -1) {
							row= size-1;
						}
					}
					if(magicSquare[row][column] != 0) {
						column--;
						row+= 2;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column++; 
						row--;
					}
				}
			}
			
		}else if(sence.equalsIgnoreCase("RIGHT")) {
			row= size/2;
			column= size-1;
			
			if(ubication.equalsIgnoreCase("NE")) {
				for(int num = 1; num <= size*size;) {
					if(row== -1 && column== size) {
						column= size-2;
						row= 0;
					}else {
						if(column== size) {
							column= 0;
						}
						if(row< 0) {
							row= size-1;
						}
					}
					if(magicSquare[row][column] != 0) {
						column-= 2;
						row++;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column++; 
						row--;
					}
				}
			}else if(ubication.equalsIgnoreCase("SE")) {
				for(int num = 1; num <= size*size;) {
					if(row> size-1 && column> size-1) {
						column= size-2;
						row= size-1;
					}else {
						if(column== size) {
							column= 0;
						}
						if(row== size) {
							row= 0;
						}
					}
					if(magicSquare[row][column] != 0) {
						column-= 2;
						row--;
						continue;
					}else {
						magicSquare[row][column] = num++;
						column++; 
						row++;
					}
				}
			}
		}else if(sence.equalsIgnoreCase("LEFT")) {
			 row= size/2;
			 column= 0;
			 if(ubication.equalsIgnoreCase("SO")) {
					for(int num = 1; num <= size*size;) {
						if(row> size-1 && column== -1) {
							column= 1;
							row= size-1;
						}else {
							if(column== -1) {
								column= size-1;
							}
							if(row== size) {
								row= 0;
							}
						}
						if(magicSquare[row][column] != 0) {
							column+= 2;
							row--;
							continue;
						}else {
							magicSquare[row][column] = num++;
							column--; 
							row++;
						}
					}
				}else if(ubication.equalsIgnoreCase("NO")) {
					for(int num = 1; num <= size*size;) {
						if(row== -1 && column== -1) {
							column= 1;
							row= 0;
						}else {
							if(column== -1) {
								column= size-1;
							}
							if(row== -1) {
								row= size-1;
							}
						}
						if(magicSquare[row][column] != 0) {
							column+= 2;
							row++;
							continue;
						}else {
							magicSquare[row][column] = num++;
							column--; 
							row--;
						}
					}
				}
			 }else if(sence.equalsIgnoreCase("DOWN")) {
				 row= size-1;
				 column= size/2;
				 if(ubication.equalsIgnoreCase("SE")) {
						for(int num = 1; num <= size*size;) {
							if(row> size-1 && column> size-1) {
								column= size-1;
								row= size-2;
							}else {
								if(column== size) {
									column= 0;
								}
								if(row== size) {
									row= 0;
								}
							}
							if(magicSquare[row][column] != 0) {
								column--;
								row-= 2;
								continue;
							}else {
								magicSquare[row][column] = num++;
								column++; 
								row++;
							}
						}
				 }else if(ubication.equalsIgnoreCase("SO")) {
						for(int num = 1; num <= size*size;) {
							if(row> size-1 && column== -1) {
								column= 0;
								row= size-2;
							}else {
								if(column== -1) {
									column= size-1;
								}
								if(row== size) {
									row= 0;
								}
							}
							if(magicSquare[row][column] != 0) {
								column++;
								row-= 2;
								continue;
							}else {
								magicSquare[row][column] = num++;
								column--; 
								row++;
							}
						}
				 }
				 
			}
	   return magicSquare;
	}	
    }
