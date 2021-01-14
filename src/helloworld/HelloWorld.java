import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.text.*;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class HelloWorld extends Application{  
public static void main(String[] args) {   launch(args); }@Override
public void start(Stage primaryStage) throws Exception {
    Text text1 = new Text("             WELCOME TO TIC TAC TOE !!!                  \n");
    text1.setFill(Color.PURPLE);  
    text1.setFont(Font.font("Verdana", 55));
    Text text2 = new Text("                                      ABOUT TIC TAC TOE:\n                 "
            + "                                                Play Tic Tac Toe on your Android phone.\n"
    + "                                                     No need waste paper to play puzzle games!\n"
    + "                                       Now you can play Tic Tac Toe on your Android device for free.\n\n                                 ");   
    text2.setFont(Font.font("Verdana", 20));
Text text3 = new Text("\n                                               Login Here...                                \n"); 
text3.setFont(Font.font("Verdana", 20));
Button btn1= new Button("Login");
btn1.setOnAction(new EventHandler<ActionEvent>() { @Override
public void handle(ActionEvent arg0) {
Label lable1= new Label("\n    Login Here     \n");
lable1.setFont(Font.font("Verdana", 50));
Label lable2= new Label("    Enter your Username: \n\n");
lable2.setFont(Font.font("Verdana", 15));
TextField txtfld1 = new TextField();
Label lable3= new Label("    Enter your Password: \n\n");
lable3.setFont(Font.font("Verdana", 15));
TextField txtfld2 = new TextField();
Button btn2= new Button("Login");
btn2.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle(ActionEvent arg0) {
Label lable7= new Label("Loged in Succesfully");
lable7.setFont(Font.font("Verdana", 20));
Button btn3= new Button("Play");	
btn3.setOnAction(e-> System.exit(0));				
HBox h1= new HBox(10);
h1.getChildren().addAll( lable7,btn3);
Scene sc1= new 	Scene(h1,500,500);
primaryStage.setScene(sc1);
primaryStage.show();}});
Button btn4= new Button("Exit");
btn4.setOnAction(e-> System.exit(0));
FlowPane v1= new FlowPane();
v1.getChildren().addAll(lable1, lable2, txtfld1, lable3, txtfld2, btn2, btn4);
Scene sc= new 	Scene(v1,200,200);
primaryStage.setScene(sc);
primaryStage.show(); }} );
Text text4 = new Text("\n                                               Create Account.                            \n"); 
text4.setFont(Font.font("Verdana", 20));
Button btn5= new Button("Create");
btn5.setOnAction(new EventHandler<ActionEvent>() { @Override
public void handle(ActionEvent arg0) {
Label lable1= new Label("\n         Create Account         \n");
lable1.setFont(Font.font("Verdana", 50));
Label lable2= new Label("    Enter your Name:     \n\n");
lable2.setFont(Font.font("Verdana", 15));
TextField txtfld2 = new TextField();
Label lable3= new Label("     Enter your Country:  \n\n");
lable3.setFont(Font.font("Verdana", 15));
TextField txtfld3 = new TextField();
Label lable4= new Label("     Enter your Email:    \n\n");
lable4.setFont(Font.font("Verdana", 15));
TextField txtfld4 = new TextField();
Label lable5= new Label("     Enter your Contact:  \n\n");
lable5.setFont(Font.font("Verdana", 15));
TextField txtfld5 = new TextField();
Label lable6= new Label("     Enter your Age:      \n\n");
lable6.setFont(Font.font("Verdana", 15));
TextField txtfld6 = new TextField();
Label lable7= new Label("     Enter your Password: \n\n");
lable7.setFont(Font.font("Verdana", 15));
TextField txtfld7 = new TextField();
Button btn6= new Button("Create");
btn6.setOnAction(new EventHandler<ActionEvent>() {@Override
public void handle(ActionEvent arg0) {
Label lable7= new Label("Account Created Succesfully");
lable7.setFont(Font.font("Verdana", 20));
Button btn3= new Button("Play");	
btn3.setOnAction(e-> System.exit(0));				
HBox h1= new HBox(10);
h1.getChildren().addAll( lable7,btn3);
Scene sc1= new 	Scene(h1,500,500);
primaryStage.setScene(sc1);
primaryStage.show();}});
Button btn2= new Button("Exit");
btn2.setOnAction(e-> System.exit(0));
FlowPane v1= new FlowPane();
v1.getChildren().addAll(lable1,lable2,txtfld2,lable3,txtfld3,lable4,txtfld4,lable5,txtfld5,lable6,txtfld6,lable7,txtfld7,btn6, btn2);
Scene sc= new 	Scene(v1,200,200);
primaryStage.setScene(sc);
primaryStage.show(); }} );
Text text5 = new Text("\n                                               Play as Guest.                              \n"); 
text5.setFont(Font.font("Verdana", 20));
Button btn3= new Button("Play");
btn3.setOnAction(new EventHandler<ActionEvent>() { @Override
public void handle(ActionEvent arg0) {
						
}});
Text text6 = new Text("\n                                               Feedback.                                    \n"); 
text6.setFont(Font.font("Verdana", 20));
Button btn4= new Button("Feedback");
btn4.setOnAction(new EventHandler<ActionEvent>() { @Override
public void handle(ActionEvent arg0) {
Label lable1= new Label("Welcome to TIC TAC TOE Game Feedback");
lable1.setFont(Font.font("Verdana", 20));
Label lable2= new Label("\n\n1-Which level of TIC TAC TOE you mostly chose? ");
lable2.setFont(Font.font("Verdana", 15));
CheckBox check1= new CheckBox("Easy                          ");
CheckBox check2= new CheckBox("Medium                        ");
CheckBox check3= new CheckBox("Hard                          ");
Label lable3= new Label("\n\n2-Which background colour of TIC TAC TOE you like the most?");
lable3.setFont(Font.font("Verdana", 15));
ColorPicker cp=new ColorPicker();
Label lable4= new Label("\n\n3-Approx when you started playing TIC TAC TOE?                                                                          \n\n");
lable4.setFont(Font.font("Verdana", 15));
DatePicker db= new DatePicker();
Label lable5= new Label("\n\n4-Which country are you from?                                     \n\n");
lable5.setFont(Font.font("Verdana", 15)); 
ComboBox cb = new ComboBox();
cb.getItems().add("Pakistan");
cb.getItems().add("Canada");  
cb.getItems().add("Japan");
Label lable6= new Label("\n\n5-How many stars will you give to TIC TAC TOE?        \n\n");
lable6.setFont(Font.font("Verdana", 15));
RadioButton r1=new RadioButton("1                      ");
RadioButton r2=new RadioButton("2                      ");
RadioButton r3=new RadioButton("3                      ");
RadioButton r4=new RadioButton("4                      ");
RadioButton r5=new RadioButton("5                     ");
Label lable8= new Label("\n\n                                            \n\n");
ToggleGroup tg= new ToggleGroup();
r1.setToggleGroup(tg);
r2.setToggleGroup(tg);
r3.setToggleGroup(tg);
r4.setToggleGroup(tg);
Button btn1= new Button("Submit");
btn1.setOnAction(new EventHandler<ActionEvent>() {@Override
public void handle(ActionEvent arg0) {
Label lable7= new Label("Submited Succesfully");
lable7.setFont(Font.font("Verdana", 20));
Button btn3= new Button("Exit");	
btn3.setOnAction(e-> System.exit(0));
HBox h1= new HBox(10);
h1.getChildren().addAll( lable7,btn3);
Scene sc1= new 	Scene(h1,500,500);
primaryStage.setScene(sc1);
primaryStage.show();}});
Button btn2= new Button("Exit");
btn2.setOnAction(e-> System.exit(0));
FlowPane v1= new FlowPane();
v1.getChildren().addAll(lable1, lable2, check1, check2,check3, lable3,cp,lable4,db,lable5,cb,lable6,r1,r2,r3,r4,r5,lable8, btn1, btn2);
Scene sc= new 	Scene(v1,200,200);
primaryStage.setScene(sc);
primaryStage.show(); }} );
FlowPane v1= new FlowPane();
v1.getChildren().addAll(text1,text2,text3, btn1,text4, btn5,text5, btn3,text6, btn4);
		Scene sc= new 	Scene(v1,200,200);
		primaryStage.setScene(sc);
		primaryStage.show();}}
