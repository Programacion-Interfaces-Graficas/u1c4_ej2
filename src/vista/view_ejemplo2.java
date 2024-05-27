package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.logica_view_ejemplo2;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class view_ejemplo2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField txt_cadena;
	public JButton btn_ok;
	public JLabel lbl_etiqueta2;
	public JLabel lbl_etiqueta1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_ejemplo2 frame = new view_ejemplo2();
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
	public view_ejemplo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl_etiqueta1 = new JLabel("Texto:");
		lbl_etiqueta1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_etiqueta1.setBounds(31, 36, 45, 13);
		contentPane.add(lbl_etiqueta1);
		
		txt_cadena = new JTextField();
		txt_cadena.setBounds(86, 25, 226, 29);
		contentPane.add(txt_cadena);
		txt_cadena.setColumns(10);
		
		btn_ok = new JButton("OK");
		btn_ok.setBounds(322, 25, 63, 34);
		contentPane.add(btn_ok);
		
		lbl_etiqueta2 = new JLabel("");
		lbl_etiqueta2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_etiqueta2.setBounds(86, 85, 245, 39);
		contentPane.add(lbl_etiqueta2);
		
		//Instanciar la logica
		logica_view_ejemplo2 lve=new logica_view_ejemplo2(this);
	}
}
