package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.view_ejemplo2;

public class logica_view_ejemplo2 implements ActionListener{

	//Crear el delegado
	private view_ejemplo2 delegado;
	
	public logica_view_ejemplo2(view_ejemplo2 delegado_) {
		this.delegado=delegado_;
		//Cargar las acciones en los oyentes
		this.delegado.btn_ok.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Analizar el componente a ejecutar el evento
		if(e.getSource()==delegado.btn_ok) {
			//Capturar la cadena de datos de la caja de texto
			String texto=delegado.txt_cadena.getText();
			//Cargar la cadena en la etiqueta 2
			delegado.lbl_etiqueta2.setText("Texto Capturado:"+texto);
		}
	}
	
	

}
