package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import clases.ArregloProveedores;
import clases.Proveedores;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField txtCod;
	private JTextField txtNom;
	private JButton btnMostrar;
	private JButton btnAdicionar;
	private JButton btnBuscar;
	private JButton btnEliminar;
	private JButton btnModificar;
	private JLabel lblNewLabel_9;
	private JTextField txtRznSocial;
	private JTextField txtRUC;
	private JTextField txtFechRegis;
	private JTextField txtTProdc;
	private JTextField txtContacto;
	private JTextField txtTelf;
	private JTextField txtCorreo;
	private JScrollPane scrollPane;
	private JTable table;

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
		setBounds(100, 100, 888, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("GESTIÓN DE PROVEEDORES");
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
			lblNewLabel.setBounds(269, 0, 285, 53);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Código:");
			lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_1.setBounds(38, 63, 62, 17);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Nombre: ");
			lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_2.setBounds(38, 92, 51, 22);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblNewLabel_3 = new JLabel("R.U.C:");
			lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_3.setBounds(291, 63, 40, 14);
			contentPane.add(lblNewLabel_3);
		}
		{
			lblNewLabel_4 = new JLabel("Teléfono:");
			lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_4.setBounds(478, 93, 51, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			lblNewLabel_5 = new JLabel("Correo: ");
			lblNewLabel_5.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_5.setBounds(488, 128, 51, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			lblNewLabel_6 = new JLabel("Contacto: ");
			lblNewLabel_6.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_6.setBounds(478, 63, 62, 14);
			contentPane.add(lblNewLabel_6);
		}
		{
			lblNewLabel_7 = new JLabel("Tipo de Producto: ");
			lblNewLabel_7.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_7.setBounds(231, 128, 99, 17);
			contentPane.add(lblNewLabel_7);
		}
		{
			lblNewLabel_8 = new JLabel("Fecha de Registro: ");
			lblNewLabel_8.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_8.setBounds(227, 93, 108, 17);
			contentPane.add(lblNewLabel_8);
		}
		{
			txtCod = new JTextField();
			txtCod.setBounds(90, 63, 120, 20);
			contentPane.add(txtCod);
			txtCod.setColumns(10);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(90, 94, 120, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			btnMostrar = new JButton("Mostrar ");
			btnMostrar.addActionListener(this);
			btnMostrar.setBounds(87, 167, 89, 23);
			contentPane.add(btnMostrar);
		}
		{
			btnAdicionar = new JButton("Adicionar");
			btnAdicionar.setBounds(464, 167, 89, 23);
			contentPane.add(btnAdicionar);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.addActionListener(this);
			btnBuscar.setBounds(214, 167, 89, 23);
			contentPane.add(btnBuscar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(344, 167, 89, 23);
			contentPane.add(btnEliminar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setBackground(new Color(245, 245, 245));
			btnModificar.setBounds(597, 167, 89, 23);
			contentPane.add(btnModificar);
		}
		{
			lblNewLabel_9 = new JLabel("Razon Social: ");
			lblNewLabel_9.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_9.setBounds(10, 128, 86, 14);
			contentPane.add(lblNewLabel_9);
		}
		{
			txtRznSocial = new JTextField();
			txtRznSocial.setColumns(10);
			txtRznSocial.setBounds(90, 125, 120, 20);
			contentPane.add(txtRznSocial);
		}
		{
			txtRUC = new JTextField();
			txtRUC.setColumns(10);
			txtRUC.setBounds(336, 63, 120, 20);
			contentPane.add(txtRUC);
		}
		{
			txtFechRegis = new JTextField();
			txtFechRegis.setColumns(10);
			txtFechRegis.setBounds(336, 94, 120, 20);
			contentPane.add(txtFechRegis);
		}
		{
			txtTProdc = new JTextField();
			txtTProdc.setColumns(10);
			txtTProdc.setBounds(336, 125, 120, 20);
			contentPane.add(txtTProdc);
		}
		{
			txtContacto = new JTextField();
			txtContacto.setColumns(10);
			txtContacto.setBounds(540, 63, 120, 20);
			contentPane.add(txtContacto);
		}
		{
			txtTelf = new JTextField();
			txtTelf.setColumns(10);
			txtTelf.setBounds(540, 94, 120, 20);
			contentPane.add(txtTelf);
		}
		{
			txtCorreo = new JTextField();
			txtCorreo.setColumns(10);
			txtCorreo.setBounds(540, 125, 120, 20);
			contentPane.add(txtCorreo);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 211, 852, 433);
			contentPane.add(scrollPane);
			{
				table = new JTable();
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"C\u00F3digo", "Nombre", "Razon social", "R.U.C", "Fecha de registro", "Tipo de producto", "Contacto", "Tel\u00E9fono", "Correo", "Estado", "Frecuencia"
					}
				) {
					Class[] columnTypes = new Class[] {
						Integer.class, String.class, String.class, String.class, Object.class, String.class, String.class, String.class, String.class, Object.class, Object.class
					};
					public Class getColumnClass(int columnIndex) {
						return columnTypes[columnIndex];
					}
					boolean[] columnEditables = new boolean[] {
						false, false, false, false, false, false, false, false, false, false, false
					};
					public boolean isCellEditable(int row, int column) {
						return columnEditables[column];
					}
				});
				table.getColumnModel().getColumn(0).setResizable(false);
				table.getColumnModel().getColumn(0).setPreferredWidth(65);
				table.getColumnModel().getColumn(1).setResizable(false);
				table.getColumnModel().getColumn(1).setPreferredWidth(100);
				table.getColumnModel().getColumn(2).setResizable(false);
				table.getColumnModel().getColumn(2).setPreferredWidth(130);
				table.getColumnModel().getColumn(3).setResizable(false);
				table.getColumnModel().getColumn(3).setPreferredWidth(100);
				table.getColumnModel().getColumn(4).setResizable(false);
				table.getColumnModel().getColumn(4).setPreferredWidth(103);
				table.getColumnModel().getColumn(5).setResizable(false);
				table.getColumnModel().getColumn(5).setPreferredWidth(103);
				table.getColumnModel().getColumn(6).setResizable(false);
				table.getColumnModel().getColumn(6).setPreferredWidth(120);
				table.getColumnModel().getColumn(7).setResizable(false);
				table.getColumnModel().getColumn(8).setResizable(false);
				table.getColumnModel().getColumn(8).setPreferredWidth(150);
				table.getColumnModel().getColumn(9).setResizable(false);
				table.getColumnModel().getColumn(10).setResizable(false);
				scrollPane.setViewportView(table);
			}
			
		}
		{
			comboestado = new JComboBox();
			comboestado.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Inactivo"}));
			comboestado.setBounds(689, 70, 80, 22);
			contentPane.add(comboestado);
		}
		{
			lblNewLabel_10 = new JLabel("Estado:");
			lblNewLabel_10.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_10.setBounds(689, 52, 46, 14);
			contentPane.add(lblNewLabel_10);
		}
		{
			lblNewLabel_11 = new JLabel("Frecuencia: ");
			lblNewLabel_11.setFont(new Font("Arial Narrow", Font.BOLD, 14));
			lblNewLabel_11.setBounds(689, 106, 73, 14);
			contentPane.add(lblNewLabel_11);
		}
		{
			comboFrecuen = new JComboBox();
			comboFrecuen.setModel(new DefaultComboBoxModel(new String[] {"Poco frecuente", "Frecuente", "Muy Frecuente"}));
			comboFrecuen.setBounds(689, 124, 120, 22);
			contentPane.add(comboFrecuen);
		}

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
		if (e.getSource() == btnMostrar) {
			do_btnMostrar_actionPerformed(e);
		}
	}
	ArregloProveedores ap = new ArregloProveedores();
	private JComboBox comboestado;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JComboBox comboFrecuen;
	protected void do_btnMostrar_actionPerformed(ActionEvent e) {
		Listado();

	}
	void Listado() {
		 DefaultTableModel modelo = (DefaultTableModel) table.getModel();
		 modelo.setRowCount(0);
		 
		 for ( int i = 0; i < ap.tamaño(); i++) {
			 Proveedores pr = ap.Obtener(i);
			 
			 modelo.addRow(new Object[] {pr.getCodigo(), pr.getNom(), pr.getRaznSocl(), pr.getRuc(), pr.getFechaRegis(), pr.getTipoProdc(), pr.getContacto(),
					 					pr.getTelf(), pr.getCorreo()});
			 }
		 }
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
	}
}
