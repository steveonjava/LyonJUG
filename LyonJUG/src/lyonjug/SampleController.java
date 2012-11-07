/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyonjug;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author sjc
 */
public class SampleController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ImageView logo;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        RotateTransitionBuilder.create()
                .byAngle(360 * 5)
                .duration(Duration.seconds(5))
                .node(logo)
                .build().play();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
