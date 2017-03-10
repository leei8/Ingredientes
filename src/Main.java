import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JButton botonComprobar;
	private JCheckBox patataCB;
	private JCheckBox pimientoCB;
	private JCheckBox huevoCB;
	private JCheckBox lechugaCB;
	private JCheckBox cebollaCB;
	private JCheckBox jamonCB;
	private JCheckBox zanahoriaCB;
	private JCheckBox chorizoCB;

	/**
	 * Launch the application.
	 */
	protected void limpiarFormulario () {
		patataCB.setSelected(false); 
		pimientoCB.setSelected(false);
		huevoCB.setSelected(false); 
		lechugaCB.setSelected(false); 
		cebollaCB.setSelected(false); 
		chorizoCB.setSelected(false); 
		zanahoriaCB.setSelected(false); 
		jamonCB.setSelected(false); 
	}
	
	protected void solucionCorrecta() {
		JOptionPane.showMessageDialog(getContentPane(), "Has acertado!! Eres un genio en la cocina.");
			
	}
	protected void solucionErronea() {
		JOptionPane.showMessageDialog(getContentPane(), "Has fallado!! :( Vuelve a intentarlo.");
		
	}
	
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
		setBounds(100, 100, 510, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdivinaLosIngredientes = new JLabel("ADIVINA LOS INGREDIENTES");
		lblAdivinaLosIngredientes.setForeground(new Color(188, 143, 143));
		lblAdivinaLosIngredientes.setFont(new Font("Tahoma", Font.BOLD, 26));
		
		JRadioButton radiobotonTCC = new JRadioButton("Tortilla con cebolla");
		radiobotonTCC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
		});
		buttonGroup.add(radiobotonTCC);
		
		JRadioButton radiobotonTSC = new JRadioButton("Tortilla sin cebolla");
		radiobotonTSC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpiarFormulario();
			}
		});
		buttonGroup.add(radiobotonTSC);
		
		JRadioButton radiobotonTFJ = new JRadioButton("Tortilla francesa con jamon");
		radiobotonTFJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarFormulario();
			}
		});
		
		buttonGroup.add(radiobotonTFJ);
		
		patataCB = new JCheckBox("Patata");
		pimientoCB = new JCheckBox("Pimiento");
		huevoCB = new JCheckBox("Huevo");
		lechugaCB = new JCheckBox("Lechuga");
		cebollaCB = new JCheckBox("Cebolla");
		chorizoCB = new JCheckBox("Chorizo");
		zanahoriaCB = new JCheckBox("Zanahoria");
		jamonCB = new JCheckBox("Jamon");
		
		botonComprobar = new JButton("Comprobar");
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
						solucionCorrecta();
					} else {
						solucionErronea();
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
						solucionCorrecta();
					} else {
						solucionErronea();
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
						solucionCorrecta();
					} else {
						solucionErronea();
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
							.addComponent(lblAdivinaLosIngredientes, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(patataCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(8))
								.addComponent(pimientoCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(huevoCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(8))
								.addComponent(lechugaCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(cebollaCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(12))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(jamonCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(16))
								.addComponent(zanahoriaCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chorizoCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(12)))
							.addGap(188))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap(328, Short.MAX_VALUE)
									.addComponent(botonComprobar))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(radiobotonTCC, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(radiobotonTSC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(radiobotonTFJ, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
							.addGap(61)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAdivinaLosIngredientes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(radiobotonTCC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(radiobotonTSC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(radiobotonTFJ, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(patataCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(cebollaCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(pimientoCB)
						.addComponent(chorizoCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(huevoCB)
						.addComponent(zanahoriaCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lechugaCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jamonCB, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(botonComprobar)
					.addGap(59))
		);
		contentPane.setLayout(gl_contentPane);
	}


}
