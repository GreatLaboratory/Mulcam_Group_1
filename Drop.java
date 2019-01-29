package com.mulcam.typing_game.view;

import javax.swing.JLabel;

public class Drop extends JLabel implements Runnable{
	
	int j =0;
	
	public Drop() {
		setText("하이");
	}

	public void run() {
		
		try {
			
		while (!Thread.currentThread().isInterrupted()) {
			int i = (int) (Math.random()*550+1);
			for (j = 0; j < 700; j += 10) {
				
				setLocation ( i ,j );
					Thread.sleep(100 - 2*( PlayView.sec / 5) );
					//System.out.println("ch");			
			}			
		}
		
		} catch (Exception e) {		
	}//run
	}
}

