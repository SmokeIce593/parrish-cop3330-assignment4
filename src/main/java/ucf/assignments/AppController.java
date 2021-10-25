package ucf.assignments;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppController {
    @FXML

    // CreateItem
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
    public Button DeleteList;
    public Button AddNewList;
    public Button ExportAllLists;
    public Button ExportSelList;
    public TextField FileLocation;
    public ListView MasterList;

    // For Create A To-Do List
    public Button ToDoListSubmit;
    public TextField ToDoCreateText;

    // For Edit a To-Do List
    public Button ToDoListSubmitE;
    public TextField ToDoEditText;

    // For Edit an Item
    public Button ItemEditSubmit;
    public TextField EditItemName;
    public TextField EditItemDescription;
    public DatePicker EditItemDate;
    public ChoiceBox EditItemStatus;

    // Create an Initial ToDoList
    List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();

    // Create a Current ToDoList
    ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList();

    // Create a Current Item
    ItemMain.Items CurrentItem = new ItemMain.Items();

    // Initializer
    @FXML
    public void initialize() {
        try {
            // Add FilterChoices (There probably is a better way to do this or the scene swapping)
            //FilterChoices.getItems().add("All");
            //FilterChoices.getItems().add("Complete");
            //FilterChoices.getItems().add("Incomplete");

            /*
            Here we want to to display the Master List
            iterate through length of master list
            get obj string name at each instance and add that via
            MasterList.getItems().add(String);
             */
            /*
            Here we want to to display the ItemListView
            iterate through length of ItemListView
            get obj string name at each instance and add that via
            ItemListView.getItems().add(String);
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    // Navigates to Edit Item page
    @FXML
    public void EditItemButton() throws IOException {
        Stage stage = (Stage) EditItem.getScene().getWindow();
        stage.close();

        // This sets all the fields to the item you clicked on
        // CurrentItem = EditItemGetObj(ToDoListMain.ToDoList CurrentList, EditItemName.getText())
        // This now needs to add the values that you clicked on
        // Using CurrentItem get all values from this and set them to correct fields
       // EditItemName
       // EditItemDescription
       // EditItemDate
        // EditItemStatus

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

        // This now needs to add the value that you clicked on
        // Using CurrentList get all values from this and set the name field
        //ToDoEditText equal to the CurrentList name
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


    // Main Page

    @FXML
    public void ViewItemsButton() throws IOException {
        Stage stage = (Stage) ViewItems.getScene().getWindow();
        stage.close();

        Navigator.MainNavigate("DisplayItems.fxml");
        // Puts the current Obj into this reference
        //CurrentList = ToDoListMain.EditListGetObj(MainList, MasterList.getSelectionModel().getSelectedItem())
    }

    @FXML
    public void DeleteListButton() throws IOException {
        // Here we want to remove the List from the master list (Display)
        // We also want to remove the list from the main list

     /*
     This finds the string and removes that instance from the arraylist. This returns ArrayList<ToDoListMain.ToDoList>
     MainList = ToDoListMain.DestroyList(MainList, MasterList.getSelectionModel().getSelectedItem() (Will return a string));

      Now this has been removed from the main list we need to make it reflect in our ListView
      Clear the Master list and readd all to-do lists back from master list
      MasterList.getItems().clear();
      iterate through length of master list
      get obj string name at each instance and add that via
      MasterList.getItems().add(String);
      */
    }

    @FXML
    public void AddNewListButton() throws IOException {
        Stage stage = (Stage) AddNewList.getScene().getWindow();
        stage.close();

        Navigator.MainNavigate("CreateAToDoList.fxml");
    }

    // Export/Import using the TextField File Location
    @FXML
    public void ExportAllListsButton() throws IOException {

    }

    @FXML
    public void ExportSelListButton() throws IOException {

    }

    @FXML
    public void ImportListButton() throws IOException {

    }


    // Submit Buttons

    @FXML
    public void AddListSubmitButton() throws IOException {
        Stage stage = (Stage) ToDoListSubmit.getScene().getWindow();
        stage.close();

        // Creates and adds item to list based on the text value
        ToDoListMain.CreateList(MainList, ToDoCreateText.getText());

        Navigator.MainNavigate("ViewTo-DoLists.fxml");
    }

    @FXML
    public void ToDoListSubmitEButton() throws IOException {
        Stage stage = (Stage) ToDoListSubmitE.getScene().getWindow();
        stage.close();

        // Creates and adds item to list based on the text value
        //ToDoListMain.EditList(MainList, ToDoCreateText.getText(), CurrentList name);

        // Debating if I want this to navigate to DisplayItems.fxml
        Navigator.MainNavigate("ViewTo-DoLists.fxml");
    }

    @FXML
    public void ItemEditSubmitButton() throws IOException {
        Stage stage = (Stage) ItemEditSubmit.getScene().getWindow();
        stage.close();


        Navigator.MainNavigate("DisplayItems.fxml");
    }

    @FXML
    // Premise of Method:
    // When the submit button is clicked it runs this
    // Add item to current to-do list based on the different labels
    // Then go back to the item view list based on the current to-do list
    public void CreateItemSubmitButton() throws IOException {

       /*
        Add item to to-Do list
        Get current stage and close
        Then go back to the previous display using Navigator.MainNavigate

        This adds the item to the current to-do list
        */
        //String Date = CreateItemDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // ItemMain.CreateItem(CurrentList, CreateItemName.getText(), CreateItemDescription.getText(), Date, (String)CreateItemStatus.getValue());

        //This closes the current window


        Stage stage = (Stage) CreateItemSubmit.getScene().getWindow();
        stage.close();

        // This opens the previous window
        Navigator.MainNavigate("DisplayItems.fxml");
    }



}
