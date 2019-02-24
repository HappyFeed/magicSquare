package ui;
/*This class is in charged to be the controller of the Magic Square
 * @author: Alejandro Martinez
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.RowConstraints;
import model.MagicSquare;

public class MagicSquareController {
    
	private MagicSquare objectMG;
	
    @FXML
    private SplitPane splitPane;

    @FXML
    private AnchorPane firstSide;

    @FXML
    private Button buttonCreate;

    @FXML
    private TextField txtorder;

    @FXML
    private ComboBox<String> start;

    @FXML
    private ComboBox<String> direction;

    @FXML
    private AnchorPane secondSide;

    @FXML
    private GridPane grid;

    @FXML
    /*This method is in charge to do the actions when the button is push it.
     * @param: A ActionEvent that represent the event. event!=null;
     */
    public void buttonAction(ActionEvent event) {
    	    try {
    		    develop();               
    	    }catch(NullPointerException e) {
    		    System.out.println("not a problem for the correct develop of the program");
    	    }catch(NumberFormatException e) {
    	    	Alert alert = new Alert(AlertType.WARNING, "The value need a Int not other kind of Input", ButtonType.OK);
       	        alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
       	        alert.show();
       	        change();
       	        txtorder.setText("");
    	    }catch(NegativeArraySizeException e) {
    	    	Alert alert = new Alert(AlertType.WARNING, "Wrong value only positive values ", ButtonType.OK);
       	        alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
       	        alert.show();
       	        txtorder.setText("");
       	        change();
    	    }
    
       
    }
    @FXML
    /*This method is in charge to initialize the objects and add intems to comboBox.
     * <b>post:</b>Objects initialized and comoboBox items added.
     */
    void initialize() {
    	direction.setVisible(false);
    	objectMG = new MagicSquare();
        start.getItems().add("Up");
        start.getItems().add("Right");
        start.getItems().add("Down");
        start.getItems().add("Left");
        buttonCreate.setText("Continue");
   
    }

    /*The method is in charge to add items to the direction comboBox
    *<b>pre:</b>mouse event started.
    *<b>post:</b>items added to direction comboBox.
    *@param: A MouseEvent that represent the action of the mouse.
    *@param: A String that represent the value choice in the start comoboBox. option!=null;
    *
    *@return: A boolean that say if the method was correctly develop.
    */
    public boolean items(MouseEvent ivent, String option) {
    	boolean go=false;
    	direction.setVisible(true);
        if(option.equals("Up")) {
        	direction.getItems().add("NO");
            direction.getItems().add("NE");    
        }else if(option.equals("Down")) {
        	
        	direction.getItems().add("SO");
            direction.getItems().add("SE");
        }else if(option.equals("Right")) {
        	direction.getItems().add("NE");   
            direction.getItems().add("SE");
        }else if(option.equals("Left")) {	
        	direction.getItems().add("NO");   
        	direction.getItems().add("SO");
        }
        go=true;
        buttonCreate.setText("Start");
        buttonCreate.setStyle("-fx-background-color: LightGreen");
        return go;
    }
    public void change() {
    	direction.getItems().clear();
 	    direction.setVisible(false);
 	    buttonCreate.setText("Continue");
 	    buttonCreate.setStyle("-fx-background-color: Red"); 
    }
    public void setting() {
    	 grid.getChildren().clear();
	     grid.getColumnConstraints().add(new ColumnConstraints(15));
	     grid.getRowConstraints().add(new RowConstraints(15));
	     grid.setAlignment(Pos.CENTER);
    }
    public void develop() {
    	setting();
	     boolean flag=true;
	     String startD=start.getValue();
	     MouseEvent m = null;
	     boolean inFlag=items(m,startD);
        int num=Integer.parseInt(txtorder.getText());      
        String directionW=direction.getValue();           
        if(num%2==0) {
   	     flag=false;
   	     Alert alert = new Alert(AlertType.WARNING, "Incorrect", ButtonType.OK);
   	     alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   	     alert.show();
   	     txtorder.setText("");
        } 
        if(flag==true && inFlag==true) {
   	    int[][]ma=objectMG.createdSquare(num,directionW,startD);
    	    for (int rowIndex = 0; rowIndex < num; rowIndex++) { 
    	        for (int colIndex = 0; colIndex < num; colIndex++) {  
    		       int n=ma[rowIndex][colIndex];
    		       Button lab = new Button(""+n); 
    		       lab.setStyle("-fx-border-color: Black; -fx-fond-size: 10;-fx-background-color: LightGray;");
    		       GridPane.setConstraints(lab, colIndex, rowIndex, 1, 1);
    		       grid.getChildren().addAll(lab);
    	    
    	        }
    	    }
    	    change();
       }
    }
}
