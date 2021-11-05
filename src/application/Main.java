package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.Persona;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


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
			Paco.setApellido("G�mez");
			Paco.setCalle("Avenida de Espa�a");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}