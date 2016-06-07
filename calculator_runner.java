import javax.swing.JFrame;

public class calculator_runner {
	public static void main(String[] args){

		calculator a = new calculator();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setSize(250,350);
		a.setResizable(false);
		a.setVisible(true);
	}
	
}

