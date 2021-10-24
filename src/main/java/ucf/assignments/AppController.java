package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class AppController {
    @FXML
    public TextField CreateItemName;
    public TextField CreateItemDescription;
    public DatePicker CreateItemDate;
    public ChoiceBox CreateItemStatus;
    public Button CreateItemSubmit;
    public Button EditItem;
    public ListView ItemListView;



    @FXML
    // Premise of Method:
    // When the submit button is clicked it runs this
    // Add item to current to-do list based on the different labels
    // Then go back to the item view list based on the current to-do list
    protected void CreateItem() throws IOException {

       /*
        Add item to to-Do list
        Get current stage and close
        Then go back to the previous display using Back.DisplayItems

        This adds the item to the current to-do list

        This closes the current window

        */
            Stage stage = (Stage) CreateItemSubmit.getScene().getWindow();
            stage.close();

       // This opens the previous window
            Back.DisplayItems();



    }
    // Navigates to Edit Item page
    @FXML
    public void EditItemButton() throws IOException {
        Stage stage = (Stage) EditItem.getScene().getWindow();
        stage.close();

        Back.EditItemToDo();
    }

    @FXML
    public void initialize() {
        //ItemListView.getItems().add("Item 1");
    }


}
