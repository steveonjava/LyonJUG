/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lyonjug;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sjc
 */
public class LyonJUG extends Application {
    
    private Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        this.primaryStage = stage;
        SampleController controller = (SampleController) changeScene("Sample.fxml");
        controller.setMain(this);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public Object changeScene(String fxmlUrl) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlUrl));
        Parent root = (Parent) loader.load();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        return loader.getController();
    }
}
