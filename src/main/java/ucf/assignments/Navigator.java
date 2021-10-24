package ucf.assignments;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Navigator {

    // For any instance where we would need to navigate back to Display Items
    // Only issue is that when we go back we have no clue what to-do list we are on
    // We will probably need a variable that remembers the current to-do list
    public static void MainNavigate(String Name) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(Name));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }
}



