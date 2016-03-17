import java.awt.Color;


public class MainView {

	public static void main(String args[]){
		
		new FrameCore(600, 600, 0, "Test Frame", true, Color.GREEN);		/** For Some Reason You Can't Have Two Frames At The Same Time So I Might Make A Panel System **/
		
		new ButtonCore(100, 300, 200, 200, 0, "HI", true, 1, true, "Cows");
		
	    new ButtonCore(400, 300, 200, 200, 0, "HI", true, 2, true, "System");
		
	}
	
}
