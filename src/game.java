/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi
 */
public class game {
	private int turns = 0;
	
	public game(){
		board init = new board();
		init.addToBoard(0, 0, 0);
                init.addToBoard(0, 2, 2);
                init.addToBoard(0, 4, 4);
		init.toString();
                
	}
	
	public static void main(String[] args){
		game test = new game();
                
                
	}
}
