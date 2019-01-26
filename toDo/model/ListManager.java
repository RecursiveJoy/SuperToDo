package toDo.model;

import java.util.ArrayList;

/**ListManager class manages the list operations
 * @author Megan West
 */
public class ListManager {

    private ArrayList<ListItem> toDoList;
    public static int HI = 3;
    public static int MED = 2;
    public static int LO = 1;
    public static int COMPLETED = 0;

    /**ListManager is the constructor for the List manager. Initializes the toDoList.
     * @author Megan West
     */
    public ListManager(){
        ArrayList<ListItem> toDoList = new ArrayList<ListItem>();
        this.load();
    }

    /**load loads the serialized arrayList from the database into the toDoList variable.
     * @author Megan West
     */
    public void load(){

    }

    /**save serializes the arrayList and saves it to the database file.
     * @author Megan West
     */
    public void save(){

    }

    /**addNewItem adds a new ListItem to the arrayList
     * @author Megan West
     * @param newItem is the new ListItem to add
     * @return returns true if add is successful
     */
    public boolean addNewItem(ListItem newItem){

        return true;
    }

    /**removeItem removes an item at a given index
     * @author Megan West
     * @param index is the index of the item to be removed
     * @return returns true if successful
     */
    public boolean removeItem(int index){

        try{
            toDoList.remove(index);
        }catch(Exception e){
            System.out.println("Index out of bounds. Unable to remove.");
        }

        return true;
    }

    /**getIndex locates the item in the list by it's description and returns it's index
     * @author Megan West
     * @param itemName the description of the item
     * @return returns a positive index number if found, returns a -1 otherwise
     */
    public int getIndex(String itemName){
        int foundIndex = -1;

        for(int i = 0; i < toDoList.size(); i++){
            ListItem item = toDoList.get(i);
            if (itemName.equals(item.getDescription())){
                foundIndex = i;
            }
        }

        return foundIndex;
    }

    /**sortPriority sorts the arrayList by the ListItems' priority
     * @author Megan West
     */
    private void sortPriority(){
     }
}
