package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;

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
			totalMoney.setText(addMoney.getText());
		}
    }
	
	public void withdrawFunds(ActionEvent event) throws IOException {
        

    }
    
    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("MainScene.fxml");

    }
}