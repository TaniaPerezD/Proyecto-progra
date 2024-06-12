package graficos;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField b;
	private static JTextField a;
	public static String nombrePrograma="Calcu";
	public static JTextArea res;
	public static JComboBox operaciones;
	public static JRadioButton decimal;
	public static JRadioButton entero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora(nombrePrograma);
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
	public calculadora(String nombrePrograma) {
		this.nombrePrograma=nombrePrograma;
		JLabel lblNewLabel = new JLabel("New label");
		getContentPane().add(lblNewLabel, BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 316);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 1");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(29, 41, 99, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Numero 2");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(27, 41, 99, 14);
		contentPane.add(lblNewLabel_2);
		
		b = new JTextField();
		b.setBackground(new Color(192, 192, 192));
		b.setForeground(new Color(0, 0, 255));
		b.setBounds(124, 91, 103, 20);
		contentPane.add(b);
		b.setColumns(10);
		
		a = new JTextField();
		a.setBackground(new Color(192, 192, 192));
		a.setBounds(124, 40, 103, 20);
		contentPane.add(a);
		a.setColumns(10);
		String[] items= {"SUMA", "RESTA", "MULTIPLICACION", "DIVISION"};
		operaciones = new JComboBox(items);
		
		operaciones.setBounds(298, 39, 89, 22);
		contentPane.add(operaciones);
		res = new JTextArea();
		res.setBounds(123, 176, 118, 46);
		contentPane.add(res);
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botonCalcular();
			}
		});
		btnNewButton_1.setBounds(298, 67, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Numero 2:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(26, 94, 88, 14);
		contentPane.add(lblNewLabel_3);
		
		entero = new JRadioButton("Enteros");
		entero.setSelected(true);
		entero.setBounds(294, 122, 109, 23);
		contentPane.add(entero);
		
		decimal = new JRadioButton("Decimales");
		decimal.setBounds(294, 161, 109, 23);
		contentPane.add(decimal);
		ButtonGroup grupoRB= new ButtonGroup();
		grupoRB.add(entero);
		grupoRB.add(decimal);
	}
	public static void botonCalcular() {
		System.out.println(entero.isSelected());
		System.out.println(decimal.isSelected());
		double a1= Double.parseDouble(a.getText());
		double b2= Double.parseDouble(b.getText());
		double c=0;
		int opc= operaciones.getSelectedIndex();
		switch(opc) {
		case 0:
			c=a1+b2;
			break;
		case 1:
			c=a1-b2;
			break;
		case 2:
			c=a1*b2;
			break;
		case 3:
			c=a1/b2;
			break;
		}
		res.setText("El resultado es: "+c);
	} 
}