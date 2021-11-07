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
	private TextField t1;
	@FXML
	private TextField t2;
	@FXML
	private TextField t3;
	@FXML
	private TextField t4;
	@FXML
	private TextField t5;
	@FXML
	private TextField t6;
	@FXML
	private TextField t7;
=======
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import model.Persona;

public class SampleController {
	@FXML
	private Button add;
	@FXML
	private Button edit;
	@FXML
	private Button remove;
	@FXML
	private Text txt;
	@FXML
	private Text txt2;
	@FXML
	private Text txt3;
	@FXML
	private Text txt4;
	@FXML
	private Text txt5;
	@FXML
	private Text txt6;
	@FXML
	private Text txt7;
	@FXML
	TableView list = new TableView();	
	@FXML
	TableColumn<Persona, String> nombre = new TableColumn();
	@FXML
	TableColumn<Persona, String> apellidos = new TableColumn();
	public void initialize(URL url, ResourceBundle rb) {
		nombre.setId("rghj");
	}
	@FXML
	private void add(ActionEvent event) {
	}
	@FXML
	private void edit(ActionEvent event) {
	}
	@FXML
	private void delete(ActionEvent event) {
	}
	
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
	public void pulsar(ActionEvent event) {
		x = this.lista.getSelectionModel().getSelectedItem();
			
		//Esto me ha resultado imposible
			
		
	}
}