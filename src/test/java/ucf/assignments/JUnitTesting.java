
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Cameron Parrish
 */
package ucf.assignments;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static ucf.assignments.ToDoListMain.CreateList;


class JUnitTesting {
    @Test
    void AddNewList(){
        /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
        String name = "Test";
        MainList = CreateList(MainList, name);
        Get obj by using MainList.get(MainList.sizeof());
        if(obj string == name)
            AssertTrue
        else
            AssertFalse
         */
    }

    @Test
    void RemoveList(){
         /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
        String name = "Test";
        MainList = DestroyList(MainList, name);

       Iterate through sizeof mainlis{
        if(obj string == name)
            AssertFalse
        }

        AssertTrue
         */


    }

    @Test
    void EditTitleList(){
        /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        String name = "Test";
        String FirstName = "Test231321"
        MainList = CreateList(MainList, FirstName);
        CurrentList = MainList.get(1);
        MainList = EditList(MainList, CurrentList, String name);
        if(Name of MainList.get(1) == name)
            AssertTrue
        else
            AssertFalse
         */

    }

    @Test
    void AddItem(){
        /*
         ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
        CurrentList item obj get first.
        if(obj name == "Name" && obj Description == "Description" && obj DueDate == "2019-12-01" && obj status == incomplete)
            AssertTrue
        AssertFalse
         */

    }

    @Test
    void RemoveItem(){
    /*
    ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
    CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
    ItemMain.Items CurrentItem = CurrentList.Get

    CurrentList = DestroyItem(CurrentList, CurrentItem)
    if(CurrentList.size != 1)
        AssertTrue
    AssertFalse
     */

    }

    @Test
    void EditDescriptionItem(){
    /*
    ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
    CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
    ItemMain.Items CurrentItem = CurrentList.Get

    CurrentList = EditItem(ToDoListMain.ToDoList CurrentList, ItemMain.Items CurrentItem,  "Name", "TestDescription", "2019-12-01", "Incomplete")

    If(CurrentList.get(1) obj description == "TestDescription")
        AssertTrue
    AssertFalse
     */

    }

    @Test
    void EditDueDateItem(){
        /*
    ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
    CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
    ItemMain.Items CurrentItem = CurrentList.Get

    CurrentList = EditItem(ToDoListMain.ToDoList CurrentList, ItemMain.Items CurrentItem,  "Name", "Description", "2015-02-04", "Incomplete")

    If(CurrentList.get(1) obj duedate == "2015-02-04")
        AssertTrue
    AssertFalse
     */

    }

    @Test
    void MarkItemAsComplete(){
        /*
    ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
    CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
    ItemMain.Items CurrentItem = CurrentList.Get

    CurrentList = EditItem(ToDoListMain.ToDoList CurrentList, ItemMain.Items CurrentItem,  "Name", "Description", "2015-02-04", "Complete")

    If(CurrentList.get(1) obj status = "Complete")
        AssertTrue
    AssertFalse
     */

    }

    @Test
    void DisplayAllItems(){
        /*
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        ToDoListMain.ToDoList FilterList = new ToDoListMain.ToDoList;
        CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
        FilterList = AllItems(CurrentList);
        if(FilterList name == CurrentList name && FilterList obj name == CurrentList obj name)
            AssertTrue
        AssertFalse

         */
    }

    @Test
    void DisplayIncompletedItems(){
        /*
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        ToDoListMain.ToDoList FilterList = new ToDoListMain.ToDoList;
        CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Incomplete")
        FilterList = InCompleteItems(CurrentList);
        if(FilterList name == CurrentList name && FilterList obj name == CurrentList obj name)
            AssertTrue
        AssertFalse
         */

    }

    @Test
    void DisplayIncompletedItemsP2(){
        /*
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        ToDoListMain.ToDoList FilterList = new ToDoListMain.ToDoList;
        CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Complete")
        FilterList = InCompleteItems(CurrentList);
        if(FilterList.size == 0)
            AssertTrue
        AssertFalse
         */

    }

    @Test
    void DisplayCompletedItems(){
        /*
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        ToDoListMain.ToDoList FilterList = new ToDoListMain.ToDoList;
        CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "Complete")
        FilterList = InCompleteItems(CurrentList);
        if(FilterList name == CurrentList name && FilterList obj name == CurrentList obj name)
            AssertTrue
        AssertFalse
         */

    }

    @Test
    void DisplayCompletedItemsP2(){
        /*
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
        ToDoListMain.ToDoList FilterList = new ToDoListMain.ToDoList;
        CurrentList = CreateItem(ToDoListMain.ToDoList CurrentList, "Name", "Description", "2019-12-01", "incomplete")
        FilterList = InCompleteItems(CurrentList);
        if(FilterList.size == 0)
            AssertTrue
        AssertFalse
         */

    }

    @Test
    void SaveList(){
        /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
         MainList = CreateList(MainList, "Test");
        MainList List obj = CreateItem(MainList List obj, "Name", "Description", "2019-12-01", "incomplete")
         MainList = ExportSelList(MainList List obj)

         if(MainList.sizeofitems > 0)
            AssertTrue
         AssertFalse


         */
    }

    @Test
    void SaveAllLists(){
        /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
        ToDoListMain.ToDoList CurrentList = new ToDoListMain.ToDoList;
         MainList = CreateList(MainList, "test");
         MainList = CreateList(MainList, "test2");
        MainList List obj1 = CreateItem(MainList List obj, "Name", "Description", "2019-12-01", "incomplete")
        MainList List obj2 = CreateItem(MainList List obj, "Name1", "Description1", "2019-12-02", "incomplete")
         MainList = ExportAllLists(MasterList)

         if(MainList.sizeofitems > 1)
            AssertTrue
         AssertFalse


         */


    }

    @Test
    void ImportOneList(){
        /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
         MainList = ImportLists(MainList)

         if(MainList.sizeofitems > 0)
            AssertTrue
         AssertFalse


         */
    }

    @Test
    void ImportAllLists(){
       /*
        List<ToDoListMain.ToDoList> MainList = new ArrayList<ToDoListMain.ToDoList>();
         MainList = ImportLists(MainList)

         if(MainList.sizeofitems > 1)
            AssertTrue
         AssertFalse


         */
    }


}