/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Tofarati
 */
public class FXMLweathercontrollerController implements Initializable {

    
    @FXML
    private Label afternoondegrees;
    
    @FXML
    private Label afternoon;
    
    
    @FXML
    void sundaypush(ActionEvent event) {
        afternoondegrees.setText("23°C");
        afternoon.setText("Afternoon");
    }
    
    @FXML
    void mondaypush(ActionEvent event) {
        afternoondegrees.setText("32°C");
        afternoon.setText("Afternoon");
    }
    
    @FXML
    void tuesdaypush(ActionEvent event) {
        afternoondegrees.setText("25°C");
        afternoon.setText("Afternoon");
    }

    @FXML
    void wednesdaypush(ActionEvent event) {
        afternoondegrees.setText("20°C");
        afternoon.setText("Afternoon");
    }
    
    @FXML
    void thursday(ActionEvent event) {
        afternoondegrees.setText("27°C");
        afternoon.setText("Afternoon");
    }
    
    @FXML
    void fridaypush(ActionEvent event) {
        afternoondegrees.setText("13°C");
        afternoon.setText("Afternoon");
    }

    @FXML
    void saturdaypush(ActionEvent event) {
        afternoondegrees.setText("19°C");
        afternoon.setText("Afternoon");
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
