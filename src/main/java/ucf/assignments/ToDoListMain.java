package ucf.assignments;

import java.util.List;

public class ToDoListMain {

    // This is a ToDoList
    // Contains a List of Items and a name for the todo list
    public static class ToDoList{
        String Name;
        List<ItemMain.Items> ItemList;
    }

    public static List<ToDoList> CreateList(List<ToDoList> MainList, String name){
        // Create a ToDoList object
        // Add ToDoList object to List<ToDoList> MainList
        // Return ToDoList

        return null;
    }

    public static List<ToDoList> EditList(List<ToDoList> MainList, String newname, String listname){
        // Create a ToDoList object
        // Iterate through main list to check when an object inside contains listname
        // for i=0; i<MainList.size(); i++
        // using MainList.get(i) (you get the object)
        // get obj instance string name
        // Compare strings if true:
        // Copy over obj instance to new object and change name based on listname
        // MainList.Set() name to newname and then return Mainlist

        return null;
    }

    public static ToDoList EditListGetObj(List<ToDoList> MainList, String listname){
        // Create a ToDoList object
        // Iterate through main list to check when an object inside contains listname
        // for i=0; i<MainList.size(); i++
        // using MainList.get(i) (you get the object)
        // if MainList name is the same as listname return toDoList object
        return null;
    }



    public static List<ToDoList> DestroyList(List<ToDoList> MainList, String listname){
       // Iterate through main list to check when an object inside contains listname
        // for i=0; i<MainList.size(); i++
        // using MainList.get(i) (you get the object)
        // get obj instance string name
        // Compare strings if true MainList.remove(i) and then return Mainlist
        return null;
    }

}
