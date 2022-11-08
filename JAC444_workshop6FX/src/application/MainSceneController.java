package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;

public class MainSceneController implements Initializable {

	@FXML
	private Stage stage;
	@FXML
	private Scene scene;
	@FXML
	private Parent root;
	@FXML
	private Button btndisplay;
	@FXML
	private Button btnaddStudent;
	@FXML
	private BorderPane borderpane;
	
	@Override
	public void initialize(URL url, ResourceBundle eb)  {
		
		AnchorPane view;
		try {
			view = FXMLLoader.load(getClass().getResource("AddStudent.fxml"));
			borderpane.setCenter(view);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// Event Listener on Button.onAction
	@FXML
	public void btnDisplayStd(ActionEvent event) throws IOException {
		// TODO Autogenerated
		
		AnchorPane view = FXMLLoader.load(getClass().getResource("DisplayStudent.fxml"));
		borderpane.setCenter(view);
		
	}
	// Event Listener on Button.onAction
	@FXML
	public void btnAddStd(ActionEvent event) throws IOException {
		// TODO Autogenerated
		
		AnchorPane view = FXMLLoader.load(getClass().getResource("AddStudent.fxml"));
		borderpane.setCenter(view);
		
	
	
	}
}
