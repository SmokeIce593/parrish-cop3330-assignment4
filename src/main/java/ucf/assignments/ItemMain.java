package ucf.assignments;

import java.util.ArrayList;
import java.util.List;

public class ItemMain {
    // This is an item object. Contains the information we need for a single item
    public static class Items {
        private int id;
        private String name;
        private String description;
        private String duedate;
        private String status;
    }



    public static List<Items> CreateItem(ToDoListMain.ToDoList CurrentList, String Name, String Description, String Duedate, String Status){
        // Create an object using inputs pulled in from AppController
        // Add object to List<ItemMain.Items> currentlist
        // Return List<ItemMain.Items> currentlist


        return null;
    }

    public static List<Items> EditItem(ToDoListMain.ToDoList CurrentList, String Name, String Description, String Duedate, String Status){
        // Iterate through currentlist to check when an object inside contains listname
        // for i=0; i<CurrentList.size(); i++
        // using CurrentList.get(i) (you get the object)
        // Compare string of name and CurrentList if the same
        //
        // return CurrentList


        return null;
    }

    public Items EditItemGetObj(ToDoListMain.ToDoList CurrentList, String name){
        //We need to get the Item to display the values onto the correct fields
        // Iterate through currentlist to check when an object inside contains listname
        // for i=0; i<CurrentList.size(); i++
        // using CurrentList.get(i) (you get the object)
        // Compare string of name and CurrentList if the same return the Item

        return null;
    }



}
