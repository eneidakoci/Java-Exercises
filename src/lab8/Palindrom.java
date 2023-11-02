package lab8;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Palindrom extends JFrame {
	private JLabel inputLabel;
	private JLabel answerLabel;
	private JButton kontrollo;
	private JFrame frame;
	private JPanel panel;
	private JTextField inputField;
	private JTextField outputField;
	
	private static final int FRAME_WIDTH = 700;
	private static final int FRAME_HEIGHT = 300;
	
	public Palindrom() {
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		createComponents();
	}

	public void createComponents() {
		panel = new JPanel();
		inputLabel = new JLabel("Jepni nje fjale");
		answerLabel = new JLabel("");
		
		inputField = new JTextField(20);
		outputField = new JTextField(20);
		outputField.setEditable(false);
		
		kontrollo = new JButton("Kontrollo");
		
		setLayout(new FlowLayout());
		panel.add(inputLabel);
		panel.add(inputField);
		panel.add(answerLabel);
		panel.add(outputField);
		panel.add(kontrollo);
		add(panel);
		
		kontrollo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mbrapsht = "";
				String input = inputField.getText();
				int length = input.length();
				for(int i=length-1; i>=0; i--) {
					mbrapsht += input.charAt(i);
				}
				if(mbrapsht.equalsIgnoreCase(input)) {
					outputField.setText("Inputi eshte palindrom!");
				} else {
					outputField.setText("Inputi nuk eshte palindrom!");
				}
				
			}
			
		});
		
	}
	
}
