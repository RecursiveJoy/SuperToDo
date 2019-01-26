package toDo.view;

import toDo.controller.AppController;
import javax.swing.*;

/**class SamplePanel represents the main JPanel in our baseFrame.
 * @author Megan West
 */
public class SamplePanel extends JPanel{

    //the baseController allows the appController to manage the panel
    private AppController baseController;

    /**SamplePanel sets up the main panel for the app.
     * @author Megan West
     * @param baseController allows the appController to manage the panel.
     */
    public SamplePanel(AppController baseController){
        this.baseController = baseController;
    }


}
