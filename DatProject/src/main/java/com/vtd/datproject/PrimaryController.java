package com.vtd.datproject;

import com.vtd.utils.MyAlert;
import com.vtd.utils.themes.ThemeTypes;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class PrimaryController implements Initializable{
    @FXML private ComboBox<ThemeTypes> cbThemes;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    
    
    public void manageQ(ActionEvent e){
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setTitle("quizapp");
//        alert.setContentText("Comming soon ....");
//        alert.show();
          MyAlert.getInstance().showAlert("Comming soon..");
          
    }
    
    public void practice(ActionEvent e){
        
    }
    
    public void exam(ActionEvent e){
        
    }

    
}

