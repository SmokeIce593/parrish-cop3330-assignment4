package ucf.assignments;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Back {

    // For any instance where we would need to navigate back to Display Items
    // Only issue is that when we go back we have no clue what to-do list we are on
    // We will probably need a variable that remembers the current to-do list
    public static void DisplayItems() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("DisplayItems.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }


    // For any instance where we would need to navigate back to the main ViewTo-DoLists fxml.
    public static void DisplayToDoLists() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ViewTo-DoLists.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    // When we click the edit item button
    public static void EditItemToDo() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("EditAnItem.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

}



