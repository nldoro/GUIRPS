import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;

public class OptionOfBet extends JFrame {
	private JPanel panel;
	private Container contentPane;
	private JLabel messageLabel;
	private JButton yes;
	private JButton no;
	private JButton cancel;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 100;
	private ImageIcon questionMarkImage;
	private JLabel imageLabel;
	private JTextField inputField;

	public OptionOfBet() {
		
		super("Optional Betting");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		contentPane = getContentPane();
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setBackground(Color.PINK);

		setTitle("Select an Option");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// initialize components andadd label button to panel
		// create an imageIcon object and put it in a label
		questionMarkImage = new ImageIcon("images.png");
		imageLabel = new JLabel();
		imageLabel.setIcon(questionMarkImage);
		panel.add(imageLabel);

		// pictureLabel.setVerticalTextPosition(SwingConstants.BOTTOM);
		messageLabel = new JLabel("Do you want to place a bet?");
		panel.add(messageLabel);
		yes = new JButton("Yes");
		panel.add(yes);
		no = new JButton("No");
		panel.add(no);
		cancel = new JButton("Cancel");
		panel.add(cancel);
		setVisible(true);
/*		yes.addActionListener(new ButtonListener());
		no.addActionListener(new ButtonListener());
		;
		cancel.addActionListener(new ButtonListener());
		;

*/		inputField = new JTextField(10);

	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String input = " ";
			int g = -1;
			double balance = 0;

			if (event.getSource() == yes)
				//set condition to make sure user input and input once 
				
				while (g < 0) {
					JOptionPane.showInputDialog(null, "How much per round?");
					// input the bet
					if (input.length() > 0) {
						g++;

					}
				}
			Scanner scan = new Scanner(System.in);
			balance = scan.nextDouble();

			repaint();
	}
}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				OptionOfBet frame = new OptionOfBet();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}

}
