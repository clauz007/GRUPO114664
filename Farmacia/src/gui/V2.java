package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloDistribuidor;
import clases.Distribuidor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField txtTipoProdc;
	private JTextField txtFechaRegis;
	private JTextArea txtS;
	private JButton btnMostrar;
	private JButton btnAdicionar;
	private JButton btnEliminar;
	private JButton btnBuscar;
	private JButton btnModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("GESTION DE DISTRIBUIDORES");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(246, 11, 323, 62);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Código: ");
			lblNewLabel_1.setBounds(47, 93, 46, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Nombre: ");
			lblNewLabel_2.setBounds(47, 121, 46, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("Razon Social: ");
			lblNewLabel_3.setBounds(276, 93, 90, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("R.U.C:");
			lblNewLabel_4.setBounds(307, 121, 46, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("Tipo de Producto: ");
			lblNewLabel_5.setBounds(554, 93, 104, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Fecha de Registro: ");
			lblNewLabel_6.setBounds(548, 118, 110, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtTipoProdc = new JTextField();
			txtTipoProdc.setBounds(668, 90, 131, 20);
			contentPane.add(txtTipoProdc);
			txtTipoProdc.setColumns(10);
		}
		{
			txtFechaRegis = new JTextField();
			txtFechaRegis.setBounds(668, 115, 131, 20);
			contentPane.add(txtFechaRegis);
			txtFechaRegis.setColumns(10);
		}
		{
			txtS = new JTextArea();
			txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
			txtS.setBounds(10, 194, 825, 321);
			contentPane.add(txtS);
		}
		{
			btnMostrar = new JButton("Mostrar");
			btnMostrar.addActionListener(this);
			btnMostrar.setBounds(30, 160, 89, 23);
			contentPane.add(btnMostrar);
		}
		{
			btnAdicionar = new JButton("Adicionar");
			btnAdicionar.addActionListener(this);
			btnAdicionar.setBounds(173, 160, 89, 23);
			contentPane.add(btnAdicionar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.addActionListener(this);
			btnEliminar.setBounds(322, 160, 89, 23);
			contentPane.add(btnEliminar);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(480, 160, 89, 23);
			contentPane.add(btnBuscar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.addActionListener(this);
			btnModificar.setBounds(665, 160, 89, 23);
			contentPane.add(btnModificar);
		}
		{
			txtRzonSocial = new JTextField();
			txtRzonSocial.setColumns(10);
			txtRzonSocial.setBounds(364, 90, 131, 20);
			contentPane.add(txtRzonSocial);
		}
		{
			txtRUC = new JTextField();
			txtRUC.setColumns(10);
			txtRUC.setBounds(363, 118, 131, 20);
			contentPane.add(txtRUC);
		}
		{
			txtCod = new JTextField();
			txtCod.setColumns(10);
			txtCod.setBounds(103, 90, 131, 20);
			contentPane.add(txtCod);
		}
		{
			txtNom = new JTextField();
			txtNom.setColumns(10);
			txtNom.setBounds(103, 118, 131, 20);
			contentPane.add(txtNom);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(e);
		}
		if (e.getSource() == btnMostrar) {
			do_btnMostrar_actionPerformed(e);
		}
	}
	ArregloDistribuidor aD = new ArregloDistribuidor();
	private JTextField txtRzonSocial;
	private JTextField txtRUC;
	private JTextField txtCod;
	private JTextField txtNom;
	protected void do_btnMostrar_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Listado();
	}
	void Imprimir (String s) {
		txtS.append(s + "\n");
	}
	void Listado ()
	{ txtS.setText("");
	
	Imprimir(String.format("%-6s %-28s %-28s %-13s %-18s %-15s","Código", "Nombre", "Razon Social", "R.U.C", "Tipo de producto", "Fecha de registro"));
	Imprimir("-----------------------------------------------------------------------------------------------------------------------------");
	
	for (int i = 0; i < aD.Tamaño(); i++) {
		Imprimir(String.format("%-6s %-28s %-28s %-13s %-18s %-15s", aD.Obtener(i).getCodigo(), aD.Obtener(i).getNombre(), aD.Obtener(i).getRazonSoc(), aD.Obtener(i).getRuc(), aD.Obtener(i).getTipoProdc() 
								, aD.Obtener(i).getFechaRegis()));
	}		
	}
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
		Distribuidor d1 = aD.Buscar(leerCodigo());
		if (d1 == null) {
			Distribuidor d11 = new Distribuidor(leerCodigo(), leerNombre(), leerRazonSocial(), leeRUC(), leerTipoProduc(), FechaRegistro());
			aD.Adicionar(d11);
			Listado();
		}else JOptionPane.showMessageDialog(this, "El producto ya existe");
	}
	int leerCodigo() {
		return Integer.parseInt(txtCod.getText());
	}
	String leerNombre() {
		return txtNom.getText();
	}
	String leeRUC() {
		return txtRUC.getText();
	}
	String leerRazonSocial() {
		return txtRzonSocial.getText();
	}
	String leerTipoProduc() {
		return txtTipoProdc.getText();
	}
	LocalDate FechaRegistro() {
		return LocalDate.parse(txtFechaRegis.getText());
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		Distribuidor d = aD.Buscar(leerCodigo());
		if (d != null) {
			aD.Eliminar(d);
			Listado();
			
			txtCod.setText("");
			txtNom.setText("");
			txtRzonSocial.setText("");
			txtRUC.setText("");
			txtTipoProdc.setText("");
			txtFechaRegis.setText("");
			JOptionPane.showMessageDialog(this, "Distribuidor eliminado");
		}else JOptionPane.showMessageDialog(this, "No se logro encontrar el producto");
		
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		txtS.setText("");
		Distribuidor d = aD.Buscar(leerCodigo());
		if (d != null) {
			Imprimir("Código \tNombre \tRazon Social \tR.U.C \tTipo de Producto \tFecha de Resgitro");
			Imprimir("-------------------------------------------------------------------------------");
			Imprimir(d.getCodigo() + "\t" + d.getNombre() + "\t" + d.getRazonSoc() + "\t" + d.getRuc()+ "\t" + d.getTipoProdc()+"\t" + d.getFechaRegis()); 
			JOptionPane.showMessageDialog(this, "Distribuidor encontrado");
		}else JOptionPane.showMessageDialog(this, "Distribuidor no encontrado");
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
		Distribuidor d = aD.Buscar(leerCodigo());
		if (d != null) {
			d.setCodigo(leerCodigo());
			d.setNombre(leerNombre());
			d.setRazonSoc(leerRazonSocial());
			d.setRuc(leeRUC());
			d.setTipoProdc(leerTipoProduc());
			d.setFechaRegis(FechaRegistro());
			
			Listado();
			JOptionPane.showMessageDialog(this, "Distribuidor modificado");
		}else JOptionPane.showMessageDialog(this, "El distribuidor no ha sido encontrado");
	}
}
