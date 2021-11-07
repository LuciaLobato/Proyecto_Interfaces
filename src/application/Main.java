package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Persona;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
			primaryStage.setTitle("Agenda de Contactos");
			Scene scene = new Scene(root,655,494.0);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			Persona Paco = new Persona();
			Paco.setNombre("Paco");
			Paco.setApellido("Gómez");
			Paco.setCalle("Avenida de España");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	ObservableList<Persona> personaData = FXCollections.observableArrayList();
	public ObservableList<Persona> getPersonaData() {
		return personaData;
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}