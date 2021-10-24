package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class AppController {
    @FXML
    public TextField CreateItemName;
    public TextField CreateItemDescription;
    public DatePicker CreateItemDate;
    public ChoiceBox CreateItemStatus;
    public Button CreateItemSubmit;

    // For MainNavigate
    public Button EditItem;
    public Button CreateItem;
    public Button DeleteItem;
    public Button MarkAsComplete;
    public Button EditList;
    public ChoiceBox FilterChoices;
    public ListView ItemListView;


    // For Main View
    public Button ViewItems;

    // Initializer
    @FXML
    public void initialize() {
        try {
            ItemListView.getItems().add("Item 1");
            FilterChoices.getItems().add("All");
            FilterChoices.getItems().add("Complete");
            FilterChoices.getItems().add("Incomplete");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    // Premise of Method:
    // When the submit button is clicked it runs this
    // Add item to current to-do list based on the different labels
    // Then go back to the item view list based on the current to-do list
    protected void CreateItem() throws IOException {

       /*
        Add item to to-Do list
        Get current stage and close
        Then go back to the previous display using Navigator.MainNavigate

        This adds the item to the current to-do list
        */
        //String Date = CreateItemDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
       // ItemCreator.CreateItem(CreateItemName.getText(), CreateItemDescription.getText(), Date, (String)CreateItemStatus.getValue());

        //This closes the current window


            Stage stage = (Stage) CreateItemSubmit.getScene().getWindow();
            stage.close();

       // This opens the previous window
            Navigator.MainNavigate("DisplayItems.fxml");




    }
    // Navigates to Edit Item page
    @FXML
    public void EditItemButton() throws IOException {
        Stage stage = (Stage) EditItem.getScene().getWindow();
        stage.close();

        Navigator.MainNavigate("EditAnItem.fxml");
    }

    @FXML
    public void CreateItemButton() throws IOException {
        Stage stage = (Stage) CreateItem.getScene().getWindow();
        stage.close();

        Navigator.MainNavigate("CreateAnItem.fxml");

    }

    @FXML
    public void EditListButton() throws IOException {
        Stage stage = (Stage) EditList.getScene().getWindow();
        stage.close();

        Navigator.MainNavigate("EditAToDoList.fxml");
    }

    @FXML
    public void DeleteItemButton() throws IOException {

    }

    @FXML
    public void MarkAsCompleteButton() throws IOException {

    }

    // For all back buttons it will need to revert back to the previous page
    // Only difference between this and submit is an item will not be added
    // To save time this will be shown there only


    // Everything onward is from the main page

    @FXML
    public void ViewItemsButton() throws IOException {
        Stage stage = (Stage) ViewItems.getScene().getWindow();
        stage.close();

        Navigator.MainNavigate("DisplayItems.fxml");
    }



}
