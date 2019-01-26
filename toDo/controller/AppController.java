package toDo.controller;

import toDo.model.*;
import toDo.view.*;

import java.io.Serializable;

/**App Controller unites the model objects with the gui
 * @author Megan West
 */
public class AppController implements Serializable {

    /**
     * These are the basic components required by the program at initialization
     * @author Megan West
     */
    private ListManager today;
    private ListManager tomorrow;
    private ListManager soon;
    private SampleFrame appFrame;

    /**Constructor creates a new AppController and initializes the list Managers.
     * @author Megan West
     */
    public AppController(){
        today = new ListManager();
        tomorrow = new ListManager();
        soon = new ListManager();
    }

    /**runApp uses model and view objects to display and run the app.
     * @author Megan West
     */
    public void runApp(){
        appFrame = new SampleFrame(this);
    }


}
