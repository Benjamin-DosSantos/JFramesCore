import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class FrameCore {

	
	static int frameidout;
	static String panelName;

	static JFrame mainframe = new JFrame();
	static JPanel mainpanel = new JPanel();
	
	public FrameCore(int xsize, int ysize, int frameid, String framename, boolean isvisible, Color bgcolor){
		
		frameidout = frameid;
		
		
		mainframe.setTitle(framename);
		
		mainframe.setSize(xsize, ysize);
		
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainframe.setVisible(isvisible);
		
		mainframe.add(mainpanel);
		
		mainpanel.setBackground(bgcolor);
		
		mainpanel.setLayout(null);
	
	}
	

	
}
