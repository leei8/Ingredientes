import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdivinaLosIngredientes = new JLabel("ADIVINA LOS INGREDIENTES");
		lblAdivinaLosIngredientes.setForeground(new Color(188, 143, 143));
		lblAdivinaLosIngredientes.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JRadioButton radiobotonTCC = new JRadioButton("Tortilla con cebolla");
		buttonGroup.add(radiobotonTCC);
		
		JRadioButton radiobotonTSC = new JRadioButton("Tortilla sin cebolla");
		buttonGroup.add(radiobotonTSC);
		
		JRadioButton radiobotonTFJ = new JRadioButton("Tortilla francesa con jamon");
		buttonGroup.add(radiobotonTFJ);
		
		JCheckBox patataCB = new JCheckBox("Patata");
		
		JCheckBox pimientoCB = new JCheckBox("Pimiento");
		
		JCheckBox huevoCB = new JCheckBox("Huevo");
		
		JCheckBox lechugaCB = new JCheckBox("Lechuga");
		
		JCheckBox cebollaCB = new JCheckBox("Cebolla");
		
		JCheckBox chorizoCB = new JCheckBox("Chorizo");
		
		JCheckBox zanahoriaCB = new JCheckBox("Zanahoria");
		
		JCheckBox jamonCB = new JCheckBox("Jamon");
		
		JButton botonComprobar = new JButton("Comprobar");
		botonComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radiobotonTCC.isSelected()){
					if (patataCB.isSelected() 
						&& !pimientoCB.isSelected() 
						&& huevoCB.isSelected()
						&& !lechugaCB.isSelected() 
						&& cebollaCB.isSelected() 
						&& !chorizoCB.isSelected()
						&& !zanahoriaCB.isSelected() 
						&& !jamonCB.isSelected())
					{
						botonComprobar.setBackground(Color.GREEN);
					} else {
						botonComprobar.setBackground(Color.RED);
					}
				} else if (radiobotonTSC.isSelected()){
					if (patataCB.isSelected() 
						&& !pimientoCB.isSelected() 
						&& huevoCB.isSelected()
						&& !lechugaCB.isSelected() 
						&& !cebollaCB.isSelected() 
						&& !chorizoCB.isSelected()
						&& !zanahoriaCB.isSelected() 
						&& !jamonCB.isSelected())
						{
							botonComprobar.setBackground(Color.GREEN);
						} else {
							botonComprobar.setBackground(Color.RED);
						}
					
				} else if (radiobotonTFJ.isSelected()){
					if (!patataCB.isSelected() 
							&& !pimientoCB.isSelected() 
							&& huevoCB.isSelected()
							&& !lechugaCB.isSelected() 
							&& !cebollaCB.isSelected() 
							&& !chorizoCB.isSelected()
							&& !zanahoriaCB.isSelected() 
							&& jamonCB.isSelected())
						{
							botonComprobar.setBackground(Color.GREEN);
						} else {
							botonComprobar.setBackground(Color.RED);
						}
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAdivinaLosIngredientes, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(patataCB)
								.addComponent(pimientoCB)
								.addComponent(huevoCB)
								.addComponent(lechugaCB))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(cebollaCB)
								.addComponent(jamonCB)
								.addComponent(zanahoriaCB)
								.addComponent(chorizoCB)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(botonComprobar)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(radiobotonTCC)
								.addGap(18)
								.addComponent(radiobotonTSC)
								.addGap(18)
								.addComponent(radiobotonTFJ))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAdivinaLosIngredientes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(radiobotonTCC)
						.addComponent(radiobotonTSC)
						.addComponent(radiobotonTFJ))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(patataCB)
						.addComponent(cebollaCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(pimientoCB)
						.addComponent(chorizoCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(huevoCB)
						.addComponent(zanahoriaCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lechugaCB)
						.addComponent(jamonCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(botonComprobar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
