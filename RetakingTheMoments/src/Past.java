import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/*
 * reference: https://www.youtube.com/watch?v=LEJ1kGHSXdA
 */
// The first step is to extends JFramd and import it
public class Past extends JFrame {
	
	JFrame frame = new JFrame();
	JButton button = new JButton("If you want to go back to the past, press the button.");
	
	Past()
	{
		button.setBounds(100, 100, 500, 100);
		// ActionListener is @FunctionalInterface that has only one abstract method.
		
		// lambda expression
		button.addActionListener(			
				(e) -> {
					System.out.println("It was 2030.");
					System.out.println("You wanted to go back to 10 years ago.");
					System.out.println("That is why you are living in 2021.");
					System.out.println("You already got back to 10 years ago.");
				}
		);

//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("You already got back to 10 years ago.");
//			}
	
		this.add(button);
		this.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		this.setSize(700, 300);
		// I don't want to have a layout manager.
		this.setLayout(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		Past past = new Past();
	}


}
