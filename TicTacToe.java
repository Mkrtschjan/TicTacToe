// Importing javafx libraries to use with different features of the program
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *   This program is designed to play the game of Tic Tac Toe using JavaFX
 *   @author Taline Mkrtschjan
 *   Due 10/18/2019
 */

public class TicTacToe extends Application {
	
	private Button[][] xButton = new Button[3][3];  // holds array of x buttons
	private Button[][] oButton = new Button[3][3];  // holds array of o buttons
	private VBox[] vbox = new VBox[9];              // holds array of vboxes
	private Image xImage;   						 // for x image
	private Image oImage;							 // for o image
	private ImageView xImageView;				     // to hold x images
	private ImageView oImageView;   			     // to hold o images

	// to use the start method
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// to create an array of x buttons
		for (int row = 0; row < xButton.length; row++) {
			for (int col = 0; col < xButton[row].length; col++) {
				xButton[col][row]= new Button("X");
			}
		}
		
		// to create an array of o buttons
		for (int row = 0; row < oButton.length; row++) {
			for (int col = 0; col < oButton[row].length; col++) {
				oButton[col][row]= new Button("O");
			}
		}
		
		// to create vbox objects with an x and and an o button
		vbox[0] = new VBox(10, xButton[0][0], oButton[0][0]);
		vbox[1] = new VBox(10, xButton[0][1], oButton[0][1]);
		vbox[2] = new VBox(10, xButton[0][2], oButton[0][2]);
		vbox[3] = new VBox(10, xButton[1][0], oButton[1][0]);
		vbox[4] = new VBox(10, xButton[1][1], oButton[1][1]);
		vbox[5] = new VBox(10, xButton[1][2], oButton[1][2]);
		vbox[6] = new VBox(10, xButton[2][0], oButton[2][0]);
		vbox[7] = new VBox(10, xButton[2][1], oButton[2][1]);
		vbox[8] = new VBox(10, xButton[2][2], oButton[2][2]);
		
		// to center vboxes' alignment and set padding
		for (int i = 0; i < vbox.length; i++) {
			vbox[i].setAlignment(Pos.CENTER);
			vbox[i].setPadding(new Insets(10));
		}
		// to create a gridpane
		GridPane gridpane = new GridPane();
		
		// adding the vboxes to the gridpane at specific locations
		gridpane.add(vbox[0],0,0);
		gridpane.add(vbox[1],0,1);
		gridpane.add(vbox[2],0,2);
		gridpane.add(vbox[3],1,0);
		gridpane.add(vbox[4],1,1);
		gridpane.add(vbox[5],1,2);
		gridpane.add(vbox[6],2,0);
		gridpane.add(vbox[7],2,1);
		gridpane.add(vbox[8],2,2);
		
		// to set the spacing and alignmentof the gridpane
		gridpane.setHgap(30);
		gridpane.setVgap(30);
		gridpane.setAlignment(Pos.CENTER);
		  
		// to create the scene
		Scene scene = new Scene(gridpane, 400, 450);
		  
		// to add the scene to the stage.
		primaryStage.setScene(scene);
		  
		// to set the stage title
		primaryStage.setTitle("Tic Tac Toe");
		  
		// to show the stage
		primaryStage.show();
		
	    // to open the image of x buttons from file, set the width and preserve
		// the ratio. To create an object of xImageView
		xImage = new Image("file:Images//X.png");
	    xImageView = new ImageView(xImage);
        xImageView.setFitWidth(60);
        xImageView.setPreserveRatio(false);
        
	    // to open the image of o buttons from file, set the width and preserve
		// the ratio. To create an object of oImageView
        oImage = new Image("file:Images//O.png");
	    oImageView = new ImageView(oImage);
        oImageView.setFitWidth(60);
        oImageView.setPreserveRatio(false);
	
		
        // using lambda expressions to create events with each button and vbox
        // At every button click, the button is removed and the image of x or o
        // is displayed instead
        xButton[0][0].setOnAction(event -> {
		    vbox[0].getChildren().remove(xButton[0][0]);
		    vbox[0].getChildren().remove(oButton[0][0]);
		    xImageView = new ImageView(xImage);
		    vbox[0].getChildren().add(xImageView); 
		});
		oButton[0][0].setOnAction(event -> {
		    vbox[0].getChildren().remove(xButton[0][0]);
		    vbox[0].getChildren().remove(oButton[0][0]);
		    oImageView = new ImageView(oImage);
	        vbox[0].getChildren().add(oImageView); 
		});
		
		xButton[0][1].setOnAction(event -> {
		    vbox[1].getChildren().remove(xButton[0][1]);
		    vbox[1].getChildren().remove(oButton[0][1]);
		    xImageView = new ImageView(xImage);
	        vbox[1].getChildren().add(xImageView); 
		});
		
		oButton[0][1].setOnAction(event -> {
		    vbox[1].getChildren().remove(xButton[0][1]);
		    vbox[1].getChildren().remove(oButton[0][1]);
		    oImageView = new ImageView(oImage);
	        vbox[1].getChildren().add(oImageView); 
		});
		
		xButton[0][2].setOnAction(event -> {
		    vbox[2].getChildren().remove(xButton[0][2]);
		    vbox[2].getChildren().remove(oButton[0][2]);
		    xImageView = new ImageView(xImage);
	        vbox[2].getChildren().add(xImageView); 
		});
		oButton[0][2].setOnAction(event -> {
		    vbox[2].getChildren().remove(xButton[0][2]);
		    vbox[2].getChildren().remove(oButton[0][2]);
		    oImageView = new ImageView(oImage);
	        vbox[2].getChildren().add(oImageView); 
		});
		
		xButton[1][0].setOnAction(event -> {
		    vbox[3].getChildren().remove(xButton[1][0]);
		    vbox[3].getChildren().remove(oButton[1][0]);
		    xImageView = new ImageView(xImage);
	        vbox[3].getChildren().add(xImageView); 
		});
		oButton[1][0].setOnAction(event -> {
		    vbox[3].getChildren().remove(xButton[1][0]);
		    vbox[3].getChildren().remove(oButton[1][0]);
		    oImageView = new ImageView(oImage);
	        vbox[3].getChildren().add(oImageView); 
		});
		xButton[1][1].setOnAction(event -> {
		    vbox[4].getChildren().remove(xButton[1][1]);
		    vbox[4].getChildren().remove(oButton[1][1]);
		    xImageView = new ImageView(xImage);
	        vbox[4].getChildren().add(xImageView); 
		});       
		oButton[1][1].setOnAction(event -> {
		    vbox[4].getChildren().remove(xButton[1][1]);
		    vbox[4].getChildren().remove(oButton[1][1]);
		    oImageView = new ImageView(oImage);
	        vbox[4].getChildren().add(oImageView); 
		});  
		
		xButton[1][2].setOnAction(event -> {
		    vbox[5].getChildren().remove(xButton[1][2]);
		    vbox[5].getChildren().remove(oButton[1][2]);
		    xImageView = new ImageView(xImage);
	        vbox[5].getChildren().add(xImageView); 
		}); 
		oButton[1][2].setOnAction(event -> {
		    vbox[5].getChildren().remove(xButton[1][2]);
		    vbox[5].getChildren().remove(oButton[1][2]);
		    oImageView = new ImageView(oImage);
	        vbox[5].getChildren().add(oImageView); 
		}); 
		
		xButton[2][0].setOnAction(event -> {
		    vbox[6].getChildren().remove(xButton[2][0]);
		    vbox[6].getChildren().remove(oButton[2][0]);
		    xImageView = new ImageView(xImage);
	        vbox[6].getChildren().add(xImageView); 
		});
		oButton[2][0].setOnAction(event -> {
		    vbox[6].getChildren().remove(xButton[2][0]);
		    vbox[6].getChildren().remove(oButton[2][0]);
		    oImageView = new ImageView(oImage);
	        vbox[6].getChildren().add(oImageView); 
		});
		
		xButton[2][1].setOnAction(event -> {
		    vbox[7].getChildren().remove(xButton[2][1]);
		    vbox[7].getChildren().remove(oButton[2][1]);
		    xImageView = new ImageView(xImage);
	        vbox[7].getChildren().add(xImageView); 
		});
		oButton[2][1].setOnAction(event -> {
		    vbox[7].getChildren().remove(xButton[2][1]);
		    vbox[7].getChildren().remove(oButton[2][1]);
		    oImageView = new ImageView(oImage);
	        vbox[7].getChildren().add(oImageView); 
		});
		
		xButton[2][2].setOnAction(event -> {
		    vbox[8].getChildren().remove(xButton[2][2]);
		    vbox[8].getChildren().remove(oButton[2][2]);
		    xImageView = new ImageView(xImage);
	        vbox[8].getChildren().add(xImageView); 
		});
		oButton[2][2].setOnAction(event -> {
		    vbox[8].getChildren().remove(xButton[2][2]);
		    vbox[8].getChildren().remove(oButton[2][2]);
		    oImageView = new ImageView(oImage);
	        vbox[8].getChildren().add(oImageView); 
		});
	} // start method

    public static void main(String[] args)
    {
      // to launch the application.
      launch(args);
    }
   
}