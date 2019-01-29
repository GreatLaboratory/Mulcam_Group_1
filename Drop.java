package game;

import javax.swing.JLabel;

public class Drop extends JLabel implements Runnable{
	 
	public Drop() {
		setText("°¡³ª´Ù");
	}
//	public drop(String string) {
//		setText(string);
//	}
	
	

	@Override
	public void run() {
		
		while (true) {
			int i = (int) (Math.random()*550+1);
			for (int j = 0; j < 700; j += 10) {
				
				setLocation ( i ,j );
				try {
					Thread.sleep(50);
					//System.out.println("ch");
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}//run


}