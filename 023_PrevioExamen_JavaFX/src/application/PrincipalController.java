package application;



import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class PrincipalController {
	
	public Label salida;
	public TextArea text;
	public TextField nom;
	public TextField pass;
	
	public void Escribir() {
		salida.setText(text.getText());
		text.setText("");
	}
	
	public void Login() throws IOException{
		if(pass.getText().equals("123456")) {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
	        Parent root1 = (Parent) fxmlLoader.load();
	        Stage stage = new Stage();
	        stage.initModality(Modality.APPLICATION_MODAL);
	        stage.setTitle("Login");
	        stage.setScene(new Scene(root1,600,600));  
	        stage.show();
		}
	}
	
}
