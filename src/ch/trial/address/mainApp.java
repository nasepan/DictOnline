package ch.trial.address;

import java.io.IOException;

import ch.trial.address.model.Thumbs;
import ch.trial.address.view.mainPageController;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    
    /**
     * observable list of thumbs
     */
    private ObservableList<Thumbs> thumbsData = FXCollections.observableArrayList();
    
    //Constructor    
    public mainApp() {
        // Add some sample data
        thumbsData.add(new Thumbs("Hans", 0, 0, 0));
        thumbsData.add(new Thumbs("Ruth", 0, 0, 0));
        thumbsData.add(new Thumbs("Heinz", 0, 0, 0));
        thumbsData.add(new Thumbs("Cornelia", 0, 0, 0));
        thumbsData.add(new Thumbs("Werner", 0, 0, 0));
        thumbsData.add(new Thumbs("Lydia", 0, 0, 0));
        thumbsData.add(new Thumbs("Anna", 0, 0, 0));
        thumbsData.add(new Thumbs("Stefan", 0, 0, 0));
        thumbsData.add(new Thumbs("Martin", 0, 0, 0));
    }

    /**
     * Returns the data as an observable list of Thumbs. 
     * @return
     */
    public ObservableList<Thumbs> getThumbsData() {
        return thumbsData;
    }    
    
    

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

       initRootLayout();

        showMainPage();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the Thumbs overview inside the root layout.
     */
    public void showUserLogin() {
        try {
            // Load Thumbs overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainApp.class.getResource("view/userLogin.fxml"));
            AnchorPane ThumbsOverview = (AnchorPane) loader.load();

            // Set Thumbs overview into the center of root layout.
            rootLayout.setCenter(ThumbsOverview);
            
            // Give the controller access to the main app
            mainPageController controller = loader.getController();
            controller.setMainApp(this);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showMainPage(){
    	try {
            // Load Thumbs overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(mainApp.class.getResource("view/mainPage.fxml"));
            AnchorPane ThumbsOverview = (AnchorPane) loader.load();

            // Set Thumbs overview into the center of root layout.
            rootLayout.setCenter(ThumbsOverview);
            
            //Give the controller access to the main application
            mainPageController controller = loader.getController();
            controller.setMainApp(this);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
   }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}