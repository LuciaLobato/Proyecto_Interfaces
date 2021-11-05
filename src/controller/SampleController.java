package controller;

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
	
}
