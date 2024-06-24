package com.example.kollar_hw4;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class HelloController {

    @FXML
    private TextField last_Input;
    @FXML
    private TextField dep_Input;
    @FXML
    private TextField major_Input;
    @FXML
    private TextField email_Input;
    @FXML
    private TextField imageURL_Input;
    @FXML
    private TextField first_Input;

@FXML
private ImageView imageView;
    public void initialize() {

        Image image = new Image(getClass().getResourceAsStream("/com/example/kollar_hw4/icon.jpg"));
        imageView.setImage(image);
        imageURL_Input.setPromptText("imageURL");
        email_Input.setPromptText("Email");
        major_Input.setPromptText("Major");
        dep_Input.setPromptText("Department");
        last_Input.setPromptText("Last Name");
        first_Input.setPromptText("First Name");

}
}





