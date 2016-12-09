package ch.trial.address.view;
import ch.trial.address.mainApp;
import ch.trial.address.model.Thumbs;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class mainPageController {
    @FXML
    private TextField inputText;
    @FXML
    private Button firstThumbs;
    @FXML
    private Button secondThumbs;
    @FXML
    private Button thirdThumbs; 
    @FXML
    private Label numFirstThumbs;
    @FXML
    private Label numSecondThumbs;
    @FXML
    private Label numThirdThumbs;

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
        // Initialize the person table with the text.
    }

	/**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(mainApp mainApp0) {
    	inputText.setAccessibleText(null);
    	numFirstThumbs.setText(Integer.toString(0));
    	numSecondThumbs.setText(Integer.toString(0));
    	numThirdThumbs.setText(Integer.toString(0));
    }
     		   
    
    
    private void showThumbsDetails(Thumbs thumbs){
    	if(thumbs != null){
    		//The part of word meaning
    		//The part of thumbs
    		numFirstThumbs.setText(Integer.toString(thumbs.getBaiduThumbs()));
    		numSecondThumbs.setText(Integer.toString(thumbs.getYoudaoThumbs()));
    		numThirdThumbs.setText(Integer.toString(thumbs.getBeingThumbs()));
    	}
    	else{
    		//Thumbs is null, remove all the text
    		numFirstThumbs.setText("");
    		numSecondThumbs.setText("");
    		numThirdThumbs.setText("");
    	}
    }
    
    private int stringSearch(String inputWord){
    	int len = this.mainApp0.getThumbsData().size();
    	for(int i = 0 ; i < len ; i++){
    		if(this.mainApp0.getThumbsData().get(i).getWord().equals(inputWord)){
    			return i;
    		}
    	}
    	return -1;
    }
    
    @FXML
    private void handleThumbsUp(){
    	String inputWord = inputText.getText();
    	
    	int index = stringSearch(inputWord);
    	if(index > -1){
			Thumbs thumb = this.mainApp0.getThumbsData().get(index);
    	
    		firstThumbs.setOnMouseClicked( (MouseEvent t) -> {
    			if(t.getClickCount() == 1){    			
    				thumb.addBaiduThumbs();
    				numFirstThumbs.setText(Integer.toString(thumb.getBaiduThumbs() ));
    			}
    		});
    	
    		secondThumbs.setOnMouseClicked( (MouseEvent t) -> {
    			if(t.getClickCount() == 1){   
    				thumb.addYoudaoThumbs();
    				numSecondThumbs.setText(Integer.toString(thumb.getYoudaoThumbs()));
    			}
    		});
    	
    		thirdThumbs.setOnMouseClicked( (MouseEvent t) -> {
    			if(t.getClickCount() == 1){   
    				thumb.addBeingThumbs();
    				numThirdThumbs.setText(Integer.toString(thumb.getBeingThumbs()));
    			}
    		});
    	}
    }
}