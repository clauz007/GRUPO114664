package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloProducto;
import clases.Producto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField txtCod;
	private JLabel lblNewLabel_2;
	private JTextField txtNom;
	private JLabel lblNewLabel_3;
	private JTextField txtPc;
	private JLabel lblNewLabel_4;
	private JTextField txtStock;
	private JLabel lblNewLabel_5;
	private JTextField txtcVender;
	private JLabel lblNewLabel_6;
	private JTextField txtPV;
	private JTextArea txtS;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Sistema de Gestión de Productos ");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel.setBounds(262, 11, 267, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Código del Producto:");
			lblNewLabel_1.setBounds(60, 52, 154, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(197, 49, 148, 20);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			lblNewLabel_2 = new JLabel("Nombre del Producto:");
			lblNewLabel_2.setBounds(60, 80, 154, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(197, 77, 148, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			lblNewLabel_3 = new JLabel("Precio a Costo:");
			lblNewLabel_3.setBounds(60, 109, 154, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			txtPc = new JTextField();
			txtPc.setBounds(197, 105, 148, 20);
			contentPane.add(txtPc);
			txtPc.setColumns(10);
		}
		{
			lblNewLabel_4 = new JLabel("Stock:");
			lblNewLabel_4.setBounds(438, 52, 82, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtStock = new JTextField();
			txtStock.setBounds(565, 49, 148, 20);
			contentPane.add(txtStock);
			txtStock.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("Cantidad a Vender:");
			lblNewLabel_5.setBounds(438, 80, 137, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			txtcVender = new JTextField();
			txtcVender.setBounds(565, 77, 148, 20);
			contentPane.add(txtcVender);
			txtcVender.setColumns(10);
		}
		{
			lblNewLabel_6 = new JLabel("Precio de Venta:");
			lblNewLabel_6.setBounds(438, 109, 137, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtPV = new JTextField();
			txtPV.setBounds(565, 106, 148, 20);
			contentPane.add(txtPV);
			txtPV.setColumns(10);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(10, 184, 746, 272);
			contentPane.add(txtS);
		}
		{
			btnNewButton = new JButton("Reportar");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(125, 142, 120, 20);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Adicionar");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(328, 141, 120, 22);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Buscar");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(541, 140, 120, 22);
			contentPane.add(btnNewButton_2);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	ArregloProducto ap = new ArregloProducto();
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		txtS.setText(" ");
		 Listado();
    }
    void Imprimir (String s) {
        txtS.append(s + "\n");
    }
    void Listado() {
        txtS.setText(" ");
        Imprimir(String.format("%-20s %-20s %-20s %-16s %-18s %-16s",
                "Código", "Nombre", "Stock", "Cant. Vender", "Precio Costo", "Precio Venta"));
        Imprimir("--------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < ap.tamaño(); i++) {
            Imprimir (" " + ap.Obtener(i).getCódigo()+"\t"+ ap.Obtener(i).getNom()+"\t  "+ ap.Obtener(i).getStock()+"\t     "+  ap.Obtener(i).getcVenta() + "\t     "+ String.format("%.2f", ap.Obtener(i).getpCosto())+"\t     "+  String.format("%.2f",ap.Obtener(i).getpVenta()));
        }
    }
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		Producto p1 = ap.Buscar(LeerCodigo());
		if (p1 == null) {
            Producto p11 = new Producto(LeerCodigo(), LeerNombre(), LeerStock(), LeerCVender(), LeerPCosto(), LeerPVenta());
            ap.Adicionar(p11);
            Listado();
		}else JOptionPane.showMessageDialog(this, "El código ya existe");
	}
	int LeerCodigo() {
		return Integer.parseInt(txtCod.getText());
	}
	String LeerNombre() {
		return txtNom.getText();
	}
	int LeerStock() {
		return Integer.parseInt(txtStock.getText());
	}
	int LeerCVender() {
		return Integer.parseInt(txtcVender.getText());
	}
	double LeerPCosto() {
		return Double.parseDouble(txtPc.getText());
	}
	double LeerPVenta() {
		return Double.parseDouble(txtPV.getText());
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		txtS.setText(" ");
		Producto pr = ap.Buscar(LeerCodigo());
		if (pr != null) {
			Imprimir("Código\tNombre\tStock\tCant. Vender\tPrecio Costo\tPrecio Venta");
			Imprimir(pr.getCódigo()+"\t"+pr.getNom()+"\t"+pr.getStock()+"\t"+pr.getcVenta()+"\t"+pr.getpCosto()+"\t"+pr.getpVenta()+"\t");
		}
		else JOptionPane.showMessageDialog(this, "El código no existe");
	}
} 