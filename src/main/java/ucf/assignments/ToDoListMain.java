/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ucf.assignments;

import java.util.ArrayList;
import java.util.List;

public class ToDoListMain {

    // This is a ToDoList
    // Contains a List of Items and a name for the todo list
    public static class ToDoList{
        private int ID;
        private String Name;
        private List<ItemMain.Items> ItemList;
    }

    public static List<ToDoList> CreateList(List<ToDoList> MainList, String name){
        //List<ToDoList> CreateList = new ArrayList<ToDoList>();
        // Create a ToDoList object
        // Add ToDoList object to List<ToDoList> MainList
        // Return MainList

        return null;
    }

    public static List<ToDoList> EditList(List<ToDoList> MainList, ToDoListMain.ToDoList CurrentList, String newname){
        // Create a ToDoList object
        // Iterate through main list to check when an object inside contains listname
        // for i=0; i<MainList.size(); i++
        // using MainList.get(i) (you get the object)
        // get obj instance ID
        // Compare IDS if true:
        // Copy over obj instance to new object and change name based on listname
        // MainList.Set() name to newname and then return Mainlist

        return null;
    }

    public static ToDoList EditListGetObj(List<ToDoList> MainList, ToDoListMain.ToDoList CurrentList, String listname){
        // Create a ToDoList object
        // Iterate through main list to check when an object inside contains listname
        // for i=0; i<MainList.size(); i++
        // using MainList.get(i) (you get the object)
        // if MainList name is the same as listname return toDoList object (or id)
        return null;
    }



    public static List<ToDoList> DestroyList(List<ToDoList> MainList, String listname){
       // Iterate through main list to check when an object inside contains listname
        // for i=0; i<MainList.size(); i++
        // using MainList.get(i) (you get the object)
        // get obj instance ID
        // Compare IDs if true MainList.remove(i) and then return Mainlist
        return null;
    }

    public static ToDoList ExportSelList(List<ToDoList> MainList, ToDoListMain.ToDoList CurrentList){
        // Needs to go through and export list.
        /*
            try
            {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("export.csv"), "UTF-8"));
                First section to write is Name of List
                    StringBuffer oneLine = new StringBuffer();
                    oneLine.append(Get current List Name);
                    oneLine.append(",");
                    oneLine.append(Get current List Item sizeof);
                    oneLine.append(",");
                    Iterate through number of items in current list appending and commas between
                    id;
                    name;
                    description;
                    duedate;
                    status;
                    End of iteration

                    bw.write(oneLine.toString());
                    bw.newLine();
                }
                bw.flush();
                bw.close();
            }
            catch (UnsupportedEncodingException e) {}
            catch (FileNotFoundException e){}
            catch (IOException e){}
        }

        // Return MainList
         */
        return null;
    }

    public static List<ToDoList> ExportAllList(List<ToDoList> MainList){
        // Needs to go through and export list.
        /*
            try
            {
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("export.csv"), "UTF-8"));
                First section to write is Name of List
                    StringBuffer oneLine = new StringBuffer();

                    Iterate through number of lists in Main List
                    oneLine.append(Get current List Name);
                    oneLine.append(",");
                    Iterate through number of items in MainList(Selected List) appending and commas between
                    id;
                    name;
                    description;
                    duedate;
                    status;
                    End of iteration Items

                    bw.write(oneLine.toString());
                    bw.newLine();

                    End of iteration Lists
                }
                bw.flush();
                bw.close();
            }
            catch (UnsupportedEncodingException e) {}
            catch (FileNotFoundException e){}
            catch (IOException e){}
        }

        // Return MainList
         */
        return null;
    }

    public static List<ToDoList> ImportLists(List<ToDoList> MainList){
        // Needs to go through and import single list
        /*
            Scanner sc = new Scanner(new File("File Location"));
            sc.useDelimiter(",");
            Int counter = 0;
            while (sc.hasNext())
            {
                Create a List (process has been done through createlist method)
                ID of list = MainList.sizeof
                Name of list = sc.next()
                for(i=0; i< sc.next() (Probably need to parse); i++){
                    Create each item (Using create item methodology)

                    Take in inputs from list:
                    id;
                    name;
                    description;
                    duedate;
                    status;
                }


            }
            sc.close();  //closes the scanner
        }
    }

         */
        // Return mainlist
        return null;
    }





}
