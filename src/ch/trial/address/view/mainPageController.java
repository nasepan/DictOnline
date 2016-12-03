package ch.trial.address.view;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.input.MouseEvent;

import ch.trial.address.mainApp;
import ch.trial.address.model.Thumbs;

public class mainPageController {
    @FXML
    private TextField inputText;
    @FXML
    private Button firstThumbs;
    @FXML
    private Button secondThumbs;
    @FXML
    private Button thirdThumbs; 

    // Reference to the main application.
    private mainApp mainApp0;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public mainPageController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
   }

    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(mainApp mainApp0) {
    	this.mainApp0 = mainApp0;
    	
    	firstThumbs.setOnMouseClicked((MouseEvent t1)-> {
    		if(t1.getClickCount() == 1){
    			ObservableList<Thumbs> thumbsData = mainApp0.getThumbsData();
    			Thumbs thumbs = thumbsData.get(0);
    			thumbs.addBaiduThumbs();
    			thumbsData.set(0, thumbs);
    		}
    	}) ;
    	
    	secondThumbs.setOnMouseClicked((MouseEvent t2)-> {
    		if(t2.getClickCount() == 1){
    			ObservableList<Thumbs> thumbsData = mainApp0.getThumbsData();
    			Thumbs thumbs = thumbsData.get(1);
    			thumbs.addYoudaoThumbs();
    			thumbsData.set(1, thumbs);
    		}
    	}) ;
    	
    	thirdThumbs.setOnMouseClicked((MouseEvent t3)-> {
    		if(t3.getClickCount() == 1){
    			ObservableList<Thumbs> thumbsData = mainApp0.getThumbsData();
    			Thumbs thumbs = thumbsData.get(2);
    			thumbs.addBeingThumbs();
    			thumbsData.set(2, thumbs);
    		}
    	}) ;
    }
}