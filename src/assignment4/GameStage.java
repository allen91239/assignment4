package assignment4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class GameStage extends AbstractGameStage implements Runnable{
	private File f = new File("duck.png");
	private File b = new File("b.png");
	private final File h = new File("h.png");
	private File win = new File("win.png");
	public JPanel jpanel;
	protected BufferedImage image;
	public GameStage(){
		/*setLayout(null);
		setSize(gssize,gssize);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		Container contentPanel = this.getContentPane();
		 
		try
		{
			image = ImageIO.read(h);
		} 
		catch (IOException e)
		{
		}
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
		contentPanel.add(pane);
		setVisible(true);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
/*
  i. Set panel size (the dimension) and background color here.
ii. Read the images you need.
iii. Initialize the gamestage.
*/