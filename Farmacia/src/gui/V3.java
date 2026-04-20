package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class V3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtDocumento;
	private JLabel lblNewLabel_2;
	private JTextField txtNombresCompletos;
	private JLabel lblNewLabel_3;
	private JTextField txtCorreo;
	private JLabel txtDireccion;
	private JTextField textField_2;
	private JLabel lblNewLabel_4;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V3 frame = new V3();
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
	public V3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 954, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Gestión de Clientes");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel.setBounds(373, 11, 170, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("N° de Documento:");
			lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_1.setBounds(56, 69, 120, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtDocumento = new JTextField();
			txtDocumento.setBounds(186, 68, 129, 20);
			contentPane.add(txtDocumento);
			txtDocumento.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Nombres Completos:");
			lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_2.setBounds(56, 100, 119, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtNombresCompletos = new JTextField();
			txtNombresCompletos.setBounds(186, 99, 129, 20);
			contentPane.add(txtNombresCompletos);
			txtNombresCompletos.setColumns(10);
		}
		{
			lblNewLabel_3 = new JLabel("Correo Eléctronico:");
			lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_3.setBounds(56, 131, 119, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtCorreo = new JTextField();
			txtCorreo.setBounds(186, 130, 129, 20);
			contentPane.add(txtCorreo);
			txtCorreo.setColumns(10);
		}
		{
			txtDireccion = new JLabel("Dirección:");
			txtDireccion.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			txtDireccion.setBounds(548, 86, 120, 14);
			contentPane.add(txtDireccion);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(633, 85, 129, 20);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("N° de Celular:");
			lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_4.setBounds(548, 111, 120, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			textField = new JTextField();
			textField.setBounds(633, 110, 129, 20);
			contentPane.add(textField);
			textField.setColumns(10);
		}

	}
}
