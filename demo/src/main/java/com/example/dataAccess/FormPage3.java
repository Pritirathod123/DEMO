 package com.example.dataAccess;

import com.example.controller.FormNavigationApp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class FormPage3 {

 private FormNavigationApp app;

private GridPane view;

private TextField field3;

// Constructor for FormPage1

public FormPage3 (FormNavigationApp app) {

this.app = app;
initialize();

}

private void initialize() {

view = new GridPane();
view.setPadding(new Insets(10));
view.setHgap(10);
view.setVgap(10);

Label label3 = new Label("Field 3:");
field3 = new TextField();


Button backButton = new Button("Back");
backButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){

        app.navigationToPage2();

    }
});


Button clearButton = new Button("Clear");

clearButton.setOnAction(new EventHandler<ActionEvent>() {
    
    @Override
    public void handle(ActionEvent event){
        setField3Value(null);


    }
});

view.add(label3,0,0);
view.add(field3, 1,0);
view.add(backButton,0,1);
view.add(clearButton,2,1);

    
}

public GridPane getView(){
    return view;


}

public String getField3Value(){
    return field3.getText();

}
public void setField3Value(String value){

    field3.setText(value);
    
}
}



    


    

