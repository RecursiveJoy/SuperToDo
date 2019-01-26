package toDo.view;

import toDo.controller.AppController;
import javax.swing.*;

/**SampleFrame is the JFrame for our GUI
 * @author Megan West
 */
public class SampleFrame extends JFrame{

    //basePanel is the main JPanel for the base Frame
    private SamplePanel basePanel;

    /**Constructor initializes the basePanel and sets up the frame.
     * @author Megan West
     * @param baseController is the Controller that builds the app
     */
    public SampleFrame(AppController baseController){
        basePanel = new SamplePanel(baseController);
        setupFrame();
    }

    /**setupFrame creates a base JFrame and makes it visible.
     * @author Megan West
     */
    private void setupFrame(){
        this.setContentPane(basePanel);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Super ToDo");
        this.setVisible(true);
    }
}
