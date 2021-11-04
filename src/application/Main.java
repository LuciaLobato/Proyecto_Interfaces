package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import model.Persona;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
	TableView tableView = new TableView();

	TableColumn<Persona, String> column1 = new TableColumn<>("Nombre");
	column1.setCellValueFactory(new PropertyValueFactory<>("nombre"));

	TableColumn<Persona, String> column2 = new TableColumn<>("Telefono");
	column2.setCellValueFactory(new PropertyValueFactory<>("telefono"));

	tableView.getColumns().add(column1);
	tableView.getColumns().add(column2);

	tableView.getItems().add(new Persona());


	VBox vbox = new VBox(tableView);

	Scene scene = new Scene(vbox);

	primaryStage.setScene(scene);
	primaryStage.show();
	}
	public static void main(String[] args) {
	launch(args);
	}
}