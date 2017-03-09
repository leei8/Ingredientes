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
		
		JRadioButton BotonTCC = new JRadioButton("Tortilla con cebolla");
		buttonGroup.add(BotonTCC);
		
		JRadioButton BotonTSC = new JRadioButton("Tortilla sin cebolla");
		buttonGroup.add(BotonTSC);
		
		JRadioButton BotonTFJ = new JRadioButton("Tortilla francesa con jamon");
		buttonGroup.add(BotonTFJ);
		
		JCheckBox patataCB = new JCheckBox("Patata");
		
		JCheckBox PimientoCB = new JCheckBox("Pimiento");
		
		JCheckBox HuevoCB = new JCheckBox("Huevo");
		
		JCheckBox LechugaCB = new JCheckBox("Lechuga");
		
		JCheckBox CebollaCB = new JCheckBox("Cebolla");
		
		JCheckBox ChorizoCB = new JCheckBox("Chorizo");
		
		JCheckBox ZanahoriaCB = new JCheckBox("Zanahoria");
		
		JCheckBox JamonCB = new JCheckBox("Jamon");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAdivinaLosIngredientes, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(BotonTCC)
							.addGap(18)
							.addComponent(BotonTSC)
							.addGap(18)
							.addComponent(BotonTFJ))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(patataCB)
								.addComponent(PimientoCB)
								.addComponent(HuevoCB)
								.addComponent(LechugaCB))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(CebollaCB)
								.addComponent(JamonCB)
								.addComponent(ZanahoriaCB)
								.addComponent(ChorizoCB))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAdivinaLosIngredientes, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(BotonTCC)
						.addComponent(BotonTSC)
						.addComponent(BotonTFJ))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(patataCB)
						.addComponent(CebollaCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(PimientoCB)
						.addComponent(ChorizoCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(HuevoCB)
						.addComponent(ZanahoriaCB))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(LechugaCB)
						.addComponent(JamonCB))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
