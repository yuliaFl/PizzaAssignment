/*
 * Yulia Flenova 
 * Assignment 2 
 * October 18, 2022
 * Pizza 
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import javax.swing.JOptionPane;


public class PizzaFXMLController implements Initializable {
	@FXML
	private Label lblSize;
	@FXML
	private Label lblQuantity;
	@FXML
	private TextField txtQty;
	@FXML
	private Button btnOrder;
	@FXML
	private Button btnReset;
	@FXML
	private TextField txtSize;
	@FXML
	private TextArea taDisplay;
	@FXML
	private Label lblOrder;
	@FXML
	private RadioButton rdSmall;
	@FXML
	private RadioButton rdMedium;
	@FXML
	private RadioButton rdLarge;
	@FXML
	private RadioButton rdExtraLarge;
	@FXML
	private CheckBox chkTomato;
	@FXML
	private CheckBox chkPineapple;
	@FXML
	private CheckBox chkBacon;
	@FXML
	private CheckBox chkOnion;
    @FXML
    private ComboBox<String> cmbCheese;
     String[] featureArray = {"Light", "Normal" ,
                                "Double"};
     private final ObservableList<String> featureList = FXCollections.observableArrayList(featureArray);
	 /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnOrder.setDefaultButton(true);
        btnReset.setCancelButton(true);
        txtQty.setFocusTraversable(false);
        cmbCheese.setItems(featureList);
    }    

    @FXML
    private void OnClickOrder(ActionEvent event) {
        if(rdSmall.isSelected()){
        PizzaOrder order = new PizzaOrder("small",Integer.parseInt(txtQty.getText()),
        		chkTomato.isSelected(),chkPineapple.isSelected(),chkBacon.isSelected(),chkOnion.isSelected(),cmbCheese.getSelectionModel().getSelectedItem());
        taDisplay.appendText(order.toString());
        }
        if(rdMedium.isSelected()){
            PizzaOrder order = new PizzaOrder("medium",Integer.parseInt(txtQty.getText()),
            		chkTomato.isSelected(),chkPineapple.isSelected(),chkBacon.isSelected(),chkOnion.isSelected(),cmbCheese.getSelectionModel().getSelectedItem());
            taDisplay.appendText(order.toString());
            }
        if(rdLarge.isSelected()){
            PizzaOrder order = new PizzaOrder("large",Integer.parseInt(txtQty.getText()),
            		chkTomato.isSelected(),chkPineapple.isSelected(),chkBacon.isSelected(),chkOnion.isSelected(),cmbCheese.getSelectionModel().getSelectedItem());
            taDisplay.appendText(order.toString());
            }
        if(rdExtraLarge.isSelected()){
            PizzaOrder order = new PizzaOrder("x-large",Integer.parseInt(txtQty.getText()),
            		chkTomato.isSelected(),chkPineapple.isSelected(),chkBacon.isSelected(),chkOnion.isSelected(),cmbCheese.getSelectionModel().getSelectedItem());
            taDisplay.appendText(order.toString());
            }
    }

    @FXML
    private void OnClickReset(ActionEvent event) {
        txtQty.setText(null);
        taDisplay.setText(null);
        chkTomato.setSelected(false);
        chkPineapple.setSelected(false);
        chkBacon.setSelected(false);
        chkOnion.setSelected(false);
        cmbCheese.setDisable(true);
        rdSmall.setSelected(true);
 
    }
   
}
