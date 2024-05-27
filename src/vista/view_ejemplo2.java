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
	
	//Declarar Variable globales
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
					//Crear un nuevo contenedor JFrame
					view_ejemplo2 frame = new view_ejemplo2();
					//Mostrar la ventana
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
		//Terminar el programa cuando el usuario cierre la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Asignar el tamaño inicial de la ventana
		setBounds(100, 100, 450, 194);
		//Crear contener para los componentes 
		contentPane = new JPanel();
		//Determinar el brode del panel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//Agregar el componente dentro del Frame
		setContentPane(contentPane);
		//Ulitilizar el layout como null para colocar en cualquier parte los componentes 
		contentPane.setLayout(null);
		//Crear la etiqueta 
		lbl_etiqueta1 = new JLabel("Texto:");
		//Definir la tamaño y la fuente de la etiqueta
		lbl_etiqueta1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		//Asiganta la posicion en X y Y dentro del panel y su ancho y alto
		//componente.setBounds(PosicionX, PosicionY, Ancho, Alto)
		lbl_etiqueta1.setBounds(31, 36, 45, 13);
		//Añadir el componente al panel principal 
		contentPane.add(lbl_etiqueta1);
		//Crear un campo de texto
		txt_cadena = new JTextField();
		txt_cadena.setBounds(86, 25, 226, 29);
		contentPane.add(txt_cadena);
		txt_cadena.setColumns(10);
		//Crear boton 
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
