package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Persona;

public class SampleController2 {
	@FXML
	private Button agregar2;
	@FXML
	private TextField f1;
	@FXML
	private TextField f2;
	@FXML
	private TextField f3;
	@FXML
	private TextField f4;
	@FXML
	private TextField f5;
	@FXML
	private TextField f6;
	@FXML
	private TextField f7;
	
	private Persona p;
	
	private ObservableList<Persona> personas;
	
	public void initAttributtes(ObservableList<Persona> personas) {
		
		this.personas = personas;
	}
	public void initAttributtes(ObservableList<Persona> personas, Persona persona) {
		
		this.personas = personas;
		this.p = persona;
		this.f1.setText(persona.getNombre());
		this.f2.setText(persona.getApellido());
		this.f3.setText(persona.getCalle());
		this.f4.setText(persona.getCiudad());
		this.f5.setText(persona.getFechanacimiento());
		this.f6.setText(persona.getCodigopostal()+"");
		this.f7.setText(persona.getTelefono()+"");
	}
	
	@FXML
	public void add2(ActionEvent event) {
		String n = this.f1.getText();
		String a = this.f2.getText();
		String d = this.f3.getText();
		String c = this.f4.getText();
		String fn = this.f5.getText();
		int cp = Integer.parseInt(this.f6.getText());
		int tl = Integer.parseInt(this.f7.getText());
		
		this.p = new Persona(n, a, d, c, fn, cp, tl);
		
		if(this.p != null) {
			
			this.p.setNombre(n);
			this.p.setApellido(a);
			this.p.setCalle(d);
			this.p.setCiudad(c);
			this.p.setFechanacimiento(fn);
			this.p.setCodigopostal(cp);
			this.p.setTelefono(tl);
			this.personas.add(p);
			
		}
		
		Stage stage = (Stage) this.agregar2.getScene().getWindow();
		stage.close();
	}

	public Persona getPersona() {
		// TODO Auto-generated method stub
		return p;
	}
}
