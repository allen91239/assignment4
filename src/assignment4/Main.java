package assignment4;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override 
			public void run(){
				
				GameStage window = new GameStage();
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setSize(1000,1000);
				window.setVisible(true);
			}
		});
			
		
	}
}

