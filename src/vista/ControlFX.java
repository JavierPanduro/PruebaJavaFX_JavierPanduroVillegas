package vista;

import clase.MainFX;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * The only controller for the whole application.
 * 
 * **/

public class ControlFX {

		//not using yet
		@FXML
		private ImageView imageRaw;

	    // Reference to the main application
	    private MainFX mainApp;

	    /**
	     * Is called by the main application to give a reference back to itself.
	     * 
	     * @param mainApp
	     */
	    public void setMainApp(MainFX mainApp) {
	        this.mainApp = mainApp;
	    }

		/**
	     * Opens an stage to send the profile, to be done...
	     */
	    
	    public void showSendProfile() {
	        try {
	            // Load the fxml file and create a new stage for the popup.
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(MainFX.class.getResource("../vista/Send.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("Send");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);

	            
	            sendStage.show();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    /**
	     * Method to handle the ImageView action in the Main stage 
	     */
	    
	    @FXML
	    private void handleSend() {
	    	showSendProfile();
	    }

	    /**
	     * Closes the application when clicked on Exit in the secondary stage
	     */
	    @FXML
	    private void handleClose() {
	   	        System.exit(0);
	    }
	  }
