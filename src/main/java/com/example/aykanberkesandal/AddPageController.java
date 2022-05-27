package com.example.aykanberkesandal;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class AddPageController {
    public static Stage stage;
    private static Scene scene;
    private static Parent root;

    @FXML
    private TextField tfPatientPersonID;
    @FXML
    private TextField tfPatientBenutzername;
    @FXML
    private TextField tfPatientPasswort;

    @FXML
    private AnchorPane apPatientAddieren;

    @FXML
    private void clickPatientHinzufuegen(ActionEvent event) {
        apPatientAddieren.setVisible(true);
    }

    @FXML
    private void addPatient(ActionEvent event){
        DB.insertPerson(Integer.parseInt(tfPatientPersonID.getText()),tfPatientBenutzername.getText(),tfPatientPasswort.getText());
        System.out.println("----------------------------------------------------------\n" + "Informationen zur Person, die zur Datenbank addiert wurde:");
        DB.printPersonInfo(Integer.parseInt(tfPatientPersonID.getText()));
        System.out.println("----------------------------------------------------------");
    }


    /*@FXML
    private void loadPatientAdd(ActionEvent event) {
        loadFunction("PatientAddieren");
    }


    private void loadFunction(String page) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
            apAddieren.getChildren().removeAll();
            apAddieren.getChildren().add(root);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}
