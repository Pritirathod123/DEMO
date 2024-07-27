package com.example.dataAccess;

import com.example.controller.FormNavigationApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FormPage1 {

 private FormNavigationApp app;

private GridPane view;

private TextField field1;

// Constructor for FormPage1

public FormPage1 (FormNavigationApp app) {

this.app = app;
initialize();

}

private void initialize() {

view = new GridPane();
view.setPadding(new Insets(10));
view.setHgap(10);
view.setVgap(10);

Label label1 = new Label("Field 1:");
field1 = new TextField();
Button nextButton = new Button("Next");
nextButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){

        app.navigationToPage2();

    }
});

Button clearButton = new Button("Clear");

clearButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){
        setField1Value(null);

    }
});
view.add(label1,0,0);
view.add(field1, 1,0);
view.add(nextButton,1,1);
view.add(clearButton,2,1);

    
}

public GridPane getView(){
    return view;


}

public String getField1Value(){
    return field1.getText();

}
public void setField1Value(String value){

    field1.setText(value);
    
}
}