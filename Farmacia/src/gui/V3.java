package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloCliente;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V3 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField txtDoc;
	private JTextField txtNom;
	private JTextField txtCor;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtDir;
	private JTextField txtCel;
	private JTextArea txtC;
	private JButton btnNewButton;
	private JButton btnAdicionar;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton btnModificar;

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
		setBounds(100, 100, 950, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Gestión de Clientes");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel.setBounds(391, 11, 169, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("N° de Documento:");
			lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_1.setBounds(101, 71, 103, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Nombres Completos:");
			lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_2.setBounds(101, 95, 119, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Correo Eléctronico:");
			lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_3.setBounds(101, 120, 111, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtDoc = new JTextField();
			txtDoc.setBounds(230, 70, 150, 20);
			contentPane.add(txtDoc);
			txtDoc.setColumns(10);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(230, 94, 150, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			txtCor = new JTextField();
			txtCor.setBounds(230, 119, 150, 20);
			contentPane.add(txtCor);
			txtCor.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Dirección:");
			lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_4.setBounds(514, 90, 58, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("N° de Celular:");
			lblNewLabel_5.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_5.setBounds(515, 115, 83, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			txtDir = new JTextField();
			txtDir.setBounds(600, 89, 150, 20);
			contentPane.add(txtDir);
			txtDir.setColumns(10);
		}
		{
			txtCel = new JTextField();
			txtCel.setBounds(600, 114, 150, 20);
			contentPane.add(txtCel);
			txtCel.setColumns(10);
		}
		{
			txtC = new JTextArea();
			txtC.setBounds(10, 205, 916, 343);
			contentPane.add(txtC);
		}
		{
			btnNewButton = new JButton("Reportar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(149, 160, 104, 22);
			contentPane.add(btnNewButton);
		}
		{
			btnAdicionar = new JButton("Adicionar");
			btnAdicionar.addActionListener(this);
			btnAdicionar.setBounds(273, 160, 104, 22);
			contentPane.add(btnAdicionar);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(399, 160, 104, 22);
			contentPane.add(btnBuscar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(527, 160, 104, 22);
			contentPane.add(btnEliminar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(660, 160, 104, 22);
			contentPane.add(btnModificar);
		}

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	ArregloCliente ac = new ArregloCliente();
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtC.setText("");
		Listado();
	}
	void Imprimir (String c) {
		txtC.append(c + " \n");
	}
	void Listado() {
		txtC.setText("");
		Imprimir("N° de Documento\tNombres Completos\tDirección\tCorreo Eléctronico\tN° de Celular\tFecha de Registro");
		Imprimir("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < ac.tamaño(); i++) {
			clases.Cliente c = ac.Obtener(i);
			Imprimir(c.getDocumento() + "\t" + c.getNombreCliente() + "\t" + c.getDirección() + "\t" + c.getCorreo() + "\t" + c.getCelular() + "\t" + c.getFechaRegistro());
		}
	}
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
		try {
		clases.Cliente c1 = ac.Buscar(LeerDocumento());
		if (c1 == null) {
			clases.Cliente c11 = new clases.Cliente(LeerDocumento(), LeerNombresCompletos(), LeerDirección(), LeerCorreo(), LeerCelular());
			ac.Adicionar(c11);
			Listado();
		} else JOptionPane.showMessageDialog(this, "El número del documento ya existe");
		txtNom.setText("");
		txtDoc.setText("");
		txtDir.setText("");
		txtCor.setText("");
		txtCel.setText("");		
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Error: Ingrese el número de documento, dirección, correo y número de celular válidos." , "Dato no válido", JOptionPane.ERROR_MESSAGE);
		}
	}
	int LeerDocumento() {
		return Integer.parseInt(txtDoc.getText());
	}
	String LeerNombresCompletos() {
		return txtNom.getText();
	}
	String LeerDirección() {
		return txtDir.getText();
	}
	String LeerCorreo() {
		return txtCor.getText();
	}
	int LeerCelular() {
		return Integer.parseInt(txtCel.getText());
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		txtC.setText("");
		try {
		clases.Cliente cr = ac.Buscar(LeerDocumento());
		if (cr != null) {
			Imprimir("N° de Documento\tNombres Completos\tDirección\tCorreo Eléctronico\tN° de Celular\tFecha de Registro");
			Imprimir("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			Imprimir(cr.getDocumento()+"\t"+cr.getNombreCliente()+"\t"+cr.getDirección()+"\t"+cr.getCorreo()+"\t"+cr.getCelular()+"\t"+cr.getFechaRegistro());
		} else JOptionPane.showMessageDialog(this, "El número del documento no existe");
	} catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(this, "Error: Ingrese un número de documento valido.");
	}
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try {
		clases.Cliente c = ac.Buscar(LeerDocumento());
		if (c != null) {
			ac.Eliminar(c);
			Listado();
			txtNom.setText("");
			txtDoc.setText("");
			txtDir.setText("");
			txtCor.setText("");
			txtCel.setText("");
			JOptionPane.showMessageDialog(this, "¡Cliente Eliminado!");
		}else JOptionPane.showMessageDialog(this, "¡No se logró encontrar al cliente!");
	} catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(this, "Error: Ingrese un número de documento válido.");
	}
	}
		protected void do_btnModificar_actionPerformed(ActionEvent e) {
			try {
			clases.Cliente b = ac.Buscar(LeerDocumento());
			if (b != null) {
				clases.Cliente a = new clases.Cliente(LeerDocumento(), LeerNombresCompletos(), LeerDirección(), LeerCorreo(), LeerCelular());
				a.setFechaRegistro(b.getFechaRegistro());
				ac.Modificar(a);
				Listado();
				JOptionPane.showMessageDialog(this, "¡Datos del cliente modificado exitosamente!");
				txtNom.setText("");
				txtDoc.setText("");
				txtDir.setText("");
				txtCor.setText("");
				txtCel.setText("");
			} else JOptionPane.showMessageDialog(this, "¡El número del documento no existe, no se puede modificar!");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Error: Revise si el número de documento sean validos" , "Error entrada", JOptionPane.ERROR_MESSAGE);
		}
	}
}
	
