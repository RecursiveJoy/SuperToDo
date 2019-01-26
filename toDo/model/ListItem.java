package toDo.model;

/**ListItem class represents every user-added item in the to-do list.
 * @author Megan West
 */
public class ListItem {

    //Every ListItem has a flag for if the item is completed, a priority value, and a text description.
    private boolean completed = false;
    private String description;
    private int priorityValue;

    public ListItem(int priorityValue, String description){
        this.description = description;
        this.priorityValue = priorityValue;
    }
    /**isCompleted determines how the item is displayed and where on the list it is.
     * @author Megan West
     * @return the boolean value of completed
     */
    public boolean isCompleted() {
        return this.completed;
    }

    /**setCompleted sets the finished status for the ListItem, affecting how it is displayed.
     * @author Megan West
     * @param completed is a true or false value. True means the item is completed. False, it is not.
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**getters and setters get and set instance variable values.
     * @author Megan West
     * @return priority is the priority value that determines where on the list the object will be sorted
     * */
    public int getPriorityValue() {
        return priorityValue;
    }

    /**getters and setters get and set instance variable values.
     * @author Megan West
     * @param priorityValue is an integer value that determines how the object will be sorted in the list
     * */
    public void setPriority(int priorityValue) {
        this.priorityValue = priorityValue;
    }

    /**getters and setters get and set instance variable values.
     * @author Megan West
     * @return description is the text description of the item that the user will see in the list.
     * */
    public String getDescription() {
        return description;
    }

    /**getters and setters get and set instance variable values.
     * @author Megan West
     * @param description is the text description of the item that the user will enter when creating.
     * */
    public void setDescription(String description) {
        this.description = description;
    }
}
