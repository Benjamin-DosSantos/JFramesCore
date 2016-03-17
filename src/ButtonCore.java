import javax.swing.Action;
import javax.swing.JButton;


public class ButtonCore {

	static int actiontypeout;
	static boolean hasoutputout;
	static String toprintout;
	static int frameidout;
	static boolean isdown = false;
	
	Action buttonlistener = new ButtonListener();
	
	public ButtonCore(int xpos, int ypos, int xsize, int ysize, int frameid, String buttontext, boolean isvisible, int actiontype, boolean hasaction, String toprint){
		
		actiontypeout = actiontype;
		
		toprintout = toprint;
		
		frameidout = frameid;
		
		JButton mainbutton = new JButton(buttonlistener);
		
		if(mainbutton.isEnabled()){
			
			isdown = true;
			
			
		}
		
		
		mainbutton.setBounds(xpos, ypos, xsize, ysize);
		
		mainbutton.setVisible(isvisible);
		
		if(frameid == FrameCore.frameidout){
			
			FrameCore.mainpanel.add(mainbutton);
			
		}
		
	}
	
}
