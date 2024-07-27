package com.example.dataAccess;

import com.example.controller.FormNavigationApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FormPage2 {
 
    
private FormNavigationApp app;

private GridPane view;

private TextField field2;

// Constructor for FormPage1

public FormPage2 (FormNavigationApp app) {

this.app = app;
initialize();

}

private void initialize() {

view = new GridPane();
view.setPadding(new Insets(10));
view.setHgap(10);
view.setVgap(10);

Label label2 = new Label("Field 2:");
field2 = new TextField();


Button backButton = new Button("Back");
backButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){

        app.navigationToPage1();

    }
});

Button nextButton = new Button("Next");

nextButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){
        app.navigationToPage3();


    }
});

Button clearButton = new Button("Clear");

clearButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){
        setField2Value(null);


    }
});

view.add(label2,0,0);
view.add(field2, 1,0);
view.add(backButton,0,1);
view.add(nextButton,1,1);
view.add(clearButton,2,1);

    
}

public GridPane getView(){
    return view;


}

public String getField2Value(){
    return field2.getText();

}
public void setField2Value(String value){

    field2.setText(value);
    
}
}


