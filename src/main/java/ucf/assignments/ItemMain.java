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

    public static List<Items> EditItem(ToDoListMain.ToDoList CurrentList, ItemMain.Items CurrentItem,  String Name, String Description, String Duedate, String Status){
        // Iterate through currentlist to check when an object inside contains listname
        // for i=0; i<CurrentList.size(); i++
        // using CurrentList.get(i) (you get the object)
        // Compare ID and CurrentList ID if the same
        // Iterate through main list to check when an object inside contains CurrentItem
        // for i=0; i<CurrentList.size(); i++
        // using CurrentList.get(i) (you get the object)
        // if obj ID is the same as currentitem
        // return object



        return null;
    }

    public Items EditItemGetObj(ToDoListMain.ToDoList CurrentList, ItemMain.Items CurrentItem, String name){
        //We need to get the Item to display the values onto the correct fields
        // Iterate through currentlist to check when an object inside contains listname
        // for i=0; i<CurrentList.size(); i++
        // using CurrentList.get(i) (you get the object)
        // Compare string of name and CurrentList if the same return the Item (Or ID)

        return null;
    }

    public static List<Items> DestroyItem(ToDoListMain.ToDoList CurrentList, ItemMain.Items CurrentItem){
        // Iterate through current list to check when an object inside contains id of selected item
        // for i=0; i<CurrentList.size(); i++
        // using CurrentList.get(i) (you get the object)
        // get obj instance ID
        // Compare IDs if true CurrentList.remove(i) and then return CurrentList
        return null;
    }



}
