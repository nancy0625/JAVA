import java.awt.*;

import javax.swing.*;

public class Demo {
	   public static void main(String[] args) {  
		      JFrame frame = new JFrame("Demo");  
		       frame.setSize(200, 200);  
		        //-------------  ����һ ----------------  
	        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;  
	        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;  
		       frame.setLocation((screenWidth - 200)/2, (screenHeight-200)/2);  
		    
		      frame.setVisible(true);  
		    }  
		


}
