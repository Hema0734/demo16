import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import java.lang.Exception;
import javafx.scene.control.ColorPicker;

import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception{

        Text text0 = new Text("MyWebsite");
        Text text1 = new Text("Name");
        Text text2 = new Text("Email");
        Text text3 = new Text("Data of birth");
        Text text4 = new Text("Password");
        Text text5 = new Text("Gender");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        DatePicker textField3 = new DatePicker();
        PasswordField textField4 = new PasswordField();

        ToggleGroup groupGender = new ToggleGroup();//الاصرة
        RadioButton maleRadio = new RadioButton("Male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("Female");
        femaleRadio.setToggleGroup(groupGender);//السبحة

        Button button1 = new Button("Sign Up");
        GridPane gridPane = new GridPane();
        HBox hbox = new HBox();
        HBox hbox1 = new HBox();
        hbox.setSpacing(2);
        hbox1.setSpacing(3);
        HBox.setMargin(maleRadio, new Insets(20, 20, 20, 20));//هدول الجمل زي قلتهم
        HBox.setMargin(femaleRadio, new Insets(20, 20, 20, 20));
        HBox.setMargin(text0, new Insets(20, 20, 20, 20));
        ObservableList list = hbox.getChildren();
        ObservableList list1 = hbox1.getChildren();
        list1.addAll(text0);
        list.addAll(maleRadio, femaleRadio);
        gridPane.setMinSize(400, 400);
        Scene scene1 = new Scene(hbox1);
        gridPane.setPadding(new Insets(50, 50, 50, 50));//حيز
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(hbox1, 1, 0);
        gridPane.add(text1, 0, 1);
        gridPane.add(textField1, 1, 1);
        gridPane.add(text2, 0,2);
        gridPane.add(textField2, 1, 2);
        gridPane.add(text3, 0, 3);
        gridPane.add(textField3, 1, 3);
        gridPane.add(text4, 0, 4);
        gridPane.add(textField4, 1, 4);
        gridPane.add(text5, 0, 5);
        gridPane.add(hbox, 1, 5);

        gridPane.add(button1, 1, 6);

        Scene scene = new Scene(gridPane);
        stage.setTitle("Lab60.3");

        stage.setScene(scene);

        stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}