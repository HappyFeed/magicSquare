package model;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicSquareTest {
    private MagicSquare magicSquare;
	
    private void setupScenary1() {
		magicSquare= new MagicSquare();
	 }
    
    @Test
	void testUpNo() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"NO","UP");
		 int [][] matrisCompare= {{6,1,8},{7,5,3},{2,9,4}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
	void testUpNe() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"NE","UP");
		 int [][] matrisCompare= {{8,1,6},{3,5,7},{4,9,2}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
	void testRightNe() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"NE","RIGHT");
		 int [][] matrisCompare= {{2,7,6},{9,5,1},{4,3,8}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
	void testRightSe() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"SE","RIGHT");
		 int [][] matrisCompare= {{4,3,8},{9,5,1},{2,7,6}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
	void testDownSo() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"SO","DOWN");
		 int [][] matrisCompare= {{2,9,4},{7,5,3},{6,1,8}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
	void testDownSe() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"SE","DOWN");
		 int [][] matrisCompare= {{4,9,2},{3,5,7},{8,1,6}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
	void testLeftNo() {
		setupScenary1();
		 int [][] matrisTest=magicSquare.createdSquare(3,"NO","LEFT");
		 int [][] matrisCompare= {{6,7,2},{1,5,9},{8,3,4}}; 
		 for(int i=0;i<matrisCompare.length;i++){
			 for(int j=0; j<matrisCompare.length;j++) {
				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
			 }
		 }
    }
    @Test
   	void testLeftSo() {
   		setupScenary1();
   		 int [][] matrisTest=magicSquare.createdSquare(3,"SO","LEFT");
   		 int [][] matrisCompare= {{8,3,4},{1,5,9},{6,7,2}}; 
   		 for(int i=0;i<matrisCompare.length;i++){
   			 for(int j=0; j<matrisCompare.length;j++) {
   				 assertTrue(matrisTest[i][j]==matrisCompare[i][j],"Jisus");
   			 }
   		 }
       }
}
