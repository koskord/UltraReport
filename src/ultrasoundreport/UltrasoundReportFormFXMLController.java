package ultrasoundreport;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;

public class UltrasoundReportFormFXMLController {

    @FXML
    private Label buttonlabel;
    @FXML
    private Label combolabel;
    @FXML
    private Label dialexes;
    @FXML
    private ComboBox<String> comboId;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        buttonlabel.setText("Sign in button pressed");
    }

    @FXML
    protected void EnableLabel(ActionEvent event) {
        String str = comboId.getValue();

        if (str.equals("Item 3")){
            combolabel.setText("OK!!!");
        } else {
            
            dialexes.setDisable(false);
           
        }
        

        
        
    }

    @FXML
    protected void secondEvent(ActionEvent event) {

    }

}
