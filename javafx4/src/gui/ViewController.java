package gui;

import java.time.LocalDate;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			
			Double numero1 = Double.parseDouble(txtNumber1.getText());
			Double numero2 = Double.parseDouble(txtNumber2.getText());
			Double sum = numero1 + numero2;
			
			labelResult.setText(String.format("%.2f", sum));
		} catch(Exception e) {
			Alerts.showAlert("Error", "Parse error", e.getMessage(), AlertType.ERROR);
		}
	}
}
