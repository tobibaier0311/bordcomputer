import javax.swing.JFrame;

public class SwingWindow {

	public static void main(String[] args) {
		JFrame firstWindow = new JFrame("First Window"); //set a default-name when actual title is not given 
		firstWindow.setSize(600, 400);	//set size of the actual window
		firstWindow.setVisible(true);	//set the visibility of the window
		firstWindow.setTitle("SystemClock");	//set the actual title of the window
		
		JFrame secondWindow = new JFrame("Second Window");
		secondWindow.setSize(500, 300);
		secondWindow.setVisible(true);
		secondWindow.setTitle("Average Speed");
		secondWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //terminates the program 
		
	}
}