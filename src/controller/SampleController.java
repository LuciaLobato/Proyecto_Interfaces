package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Persona;

public class SampleController implements Initializable{
	
	@FXML
    private TableView<Persona> lista;
    @FXML
    private TableColumn nombre;
    @FXML
    private TableColumn apellidos;
	@FXML
	private Button anadir;
	@FXML
	private Button editar;
	@FXML
	private Button borrar;
	@FXML
	private Label t1;
	@FXML
	private Label t2;
	@FXML
	private Label t3;
	@FXML
	private Label t4;
	@FXML
	private Label t5;
	@FXML
	private Label t6;
	@FXML
	private Label t7;
	
	private ObservableList<Persona> personas;
	
	private Persona x;
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		personas =FXCollections.observableArrayList();
		this.lista.setItems(personas);
		this.nombre.setCellValueFactory(new PropertyValueFactory ("nombre"));
		this.apellidos.setCellValueFactory(new PropertyValueFactory ("apellido"));

		Persona Paco = new Persona();
		
		Paco.setNombre("Paco");
		Paco.setApellido("Gómez Martín");
		Paco.setCalle("Avd. España Nº1");
		Paco.setCiudad("Sevilla");
		Paco.setFechanacimiento("1978/10/05");
		Paco.setCodigopostal(41500);
		Paco.setTelefono(674150880);
		
		Persona Pedro = new Persona();
		
		Pedro.setNombre("Pedro");
		Pedro.setApellido("Marquez López");
		Pedro.setCalle("Avd. Andalucía Nº13");
		Pedro.setCiudad("Carmona");
		Pedro.setFechanacimiento("1996/10/05");
		Pedro.setCodigopostal(41530);
		Pedro.setTelefono(674777880);
		
		Persona Julio = new Persona();
		
		Julio.setNombre("Julio");
		Julio.setApellido("Marquez León");
		Julio.setCalle("Plaza Aljarafe Nº43");
		Julio.setCiudad("Sevilla");
		Julio.setFechanacimiento("1993/10/05");
		Julio.setCodigopostal(41500);
		Julio.setTelefono(654777850);
		
		this.personas.add(Paco);
		this.personas.add(Pedro);
		this.personas.add(Julio);
		
	}
	@FXML
	public void add(ActionEvent event) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Sample2.fxml"));
			Parent root = loader.load();
			SampleController2 controlador = loader.getController();
			controlador.initAttributtes(personas);
			
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.showAndWait();
			
			Persona p = controlador.getPersona();
			
			this.personas.add(p);
			this.lista.refresh();
			
			
		} catch (IOException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.showAndWait();
		}
	}
	@FXML
	public void delete(ActionEvent event) {
		
		Persona p = this.lista.getSelectionModel().getSelectedItem();
		
		if (p == null) {
			
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar una persona");
            alert.showAndWait();
            
        } else {
        	
        	Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Persona borrada");
            alert.setContentText("HAS BORRADO UNA PERSONA");
            alert.showAndWait();
        	
			this.personas.remove(p);
			this.lista.refresh();
			
        }
	}
	@FXML
	public void change(ActionEvent event) {
		
		Persona p = this.lista.getSelectionModel().getSelectedItem();
		
		if (p == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debes seleccionar una persona");
            alert.showAndWait();
		
		} else {
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/Sample2.fxml"));
				Parent root = loader.load();
				SampleController2 controlador = loader.getController();
				controlador.initAttributtes(personas, p);
				
				Scene scene = new Scene(root);
				Stage stage = new Stage();
				stage.initModality(Modality.APPLICATION_MODAL);
				stage.setScene(scene);
				stage.showAndWait();
				
				Persona aux = controlador.getPersona();
                if (aux != null) {
                	
                this.personas.remove(p);
				this.lista.refresh();
                }
				
			} catch (IOException e) {
				Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.showAndWait();
			}
		}
	}
	
	@FXML
	private void pulsar(MouseEvent event) {
	Persona persona=(Persona) lista.getSelectionModel().getSelectedItem();
	if(persona!=null) {
	try {
	t1.setText(persona.getNombre());
	t2.setText(persona.getApellido());
	t3.setText(persona.getCalle());
	t4.setText(persona.getCiudad());
	t6.setText(Integer.toString(persona.getCodigopostal()));
	t5.setText(persona.getFechanacimiento());
	t7.setText(Integer.toString(persona.getTelefono()));

	}
	catch(Exception e){
	Alert alert= new Alert(Alert.AlertType.ERROR);
	alert.setHeaderText(null);
	alert.setTitle("Error");
	alert.setContentText("Se ha producido un error");
	alert.showAndWait();
	}

	}
	else {
	Alert alert= new Alert(Alert.AlertType.ERROR);
	alert.setHeaderText(null);
	alert.setTitle("Error");
	alert.setContentText("Ninguna persona seleccionada");
	alert.showAndWait();
	}

		
	}
}