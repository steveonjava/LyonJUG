/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyonjug;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransitionBuilder;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

/**
 *
 * @author sjc
 */
public class SampleController implements Initializable {

    @FXML
    private ImageView logo;
    @FXML
    private Group group;

    private LyonJUG main;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        final Button b = (Button) event.getSource();
        b.setDisable(true);
        RotateTransitionBuilder.create()
                .byAngle(360 * 5)
                .duration(Duration.seconds(5))
                .node(logo)
                .onFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent t) {
                        b.setDisable(false);
                    }
                })
                .build().play();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        final Reflection reflection = new Reflection();
        group.setEffect(reflection);
    }

    public void handleClickmeAction(ActionEvent event) {
        try {
            main.changeScene("SampleLarge.fxml");
        } catch (IOException ex) {
            Logger.getLogger(SampleController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setMain(LyonJUG main) {
        this.main = main;
    }
}
