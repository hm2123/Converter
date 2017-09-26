import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Optional;

public class Converter extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        JOptionPane pane = new JOptionPane("Enter your height");
        pane.setWantsInput(true);
        JDialog dialog = pane.createDialog("Enter your height");
        dialog.setLocation(0,255);
        dialog.setVisible(true);
        String strheightInCm = (String)pane.getInputValue();


        TextInputDialog textInputDialog = new TextInputDialog("140.4");
        textInputDialog.setTitle("Metrics Converter");
        textInputDialog.setHeaderText("Centimeter to feet and Inches converter");
        textInputDialog.setContentText("Enter your height in cm");
        textInputDialog.setX(550);
        textInputDialog.setY(10);
        Optional<String> result = textInputDialog.showAndWait();


        double dblheightInCm;
        dblheightInCm = Double.parseDouble(strheightInCm);
        double dblheightInInches = dblheightInCm *0.39;
        int heightInFeet = (int) (dblheightInInches/12);
        int RemainderHeightInInches = (int)(dblheightInInches%12);


        JOptionPane pane1 = new JOptionPane("Your height in feet and inches");
        dialog = pane1.createDialog("Your height in feet and inches");
        dialog.setLocation(1050,375);
        pane1.setMessage("Your height in centimeters is" + dblheightInCm + "\n" + "Your height in feet and inches is" +
                heightInFeet + " feet \n and" + RemainderHeightInInches + "inches.");
        dialog.setVisible(true);

        strheightInCm = "";
        dblheightInCm = Double.parseDouble(result.get());




        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        dblheightInInches = dblheightInCm * 0.39;
        heightInFeet = (int) (dblheightInInches / 12);
        RemainderHeightInInches = (int)(dblheightInInches%12);
        alert.setHeaderText("your height is");
        alert.setContentText(heightInFeet + "feet" + RemainderHeightInInches + "inches");
        alert.setX(510);
        alert.setY(575);
        alert.showAndWait();




    }
}