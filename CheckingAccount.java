package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class CheckingAccount {
	@FXML
	private Button wSubmit;
	@FXML
	private Button aSubmit;
	@FXML
	private Label totalMoney;
	@FXML
	private TextField addMoney;
	@FXML
	private TextField withdrawMoney;
	

	public void addFunds(ActionEvent event) throws IOException {
		if(addMoney.getText().matches("[0-9]+")) {
			totalMoney.setText(Integer.valueOf(totalMoney.getText())+ Integer.valueOf(addMoney.getText()));
		}
    }
	
	public void withdrawFunds(ActionEvent event) throws IOException {
        

    }
	
}
