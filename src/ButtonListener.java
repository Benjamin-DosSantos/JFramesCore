import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;


public class ButtonListener extends AbstractAction {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(ButtonCore.isdown == true){
			
			System.out.println(ButtonCore.toprintout);
		
		}
	}

}
