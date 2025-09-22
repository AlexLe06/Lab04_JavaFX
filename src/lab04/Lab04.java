/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author 2494377
 */
public class Lab04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) { 
        primaryStage.setTitle("JavaFX");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 450, 500);
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 0, 0, 20));
        root.setCenter(grid);
        
        Label money = new Label("$");
        Button calculate = new Button("Calculate");
        
        Label days = new Label("Number of days:");
        grid.add(days, 0, 1);
        TextField daysBox = new TextField();
        grid.add(daysBox, 1, 1);
        Label daysTxt = new Label("days");
        grid.add(daysTxt, 2, 1);
        
        Label airfare = new Label("Airfare amount:");
        grid.add(airfare, 0, 2);
        TextField airfareBox = new TextField();
        grid.add(airfareBox, 1, 2);
        grid.add(money, 2, 2);
        
        Label carRental = new Label("Car renting amount:");
        grid.add(carRental, 0, 3);
        TextField carRentalBox = new TextField();
        grid.add(carRentalBox, 1, 3);
//        grid.add(money, 2 , 3);
        
        Label milesDriven = new Label("Miles Driven:");
        grid.add(milesDriven, 0, 4);
        TextField milesDrivenBox = new TextField();
        grid.add(milesDrivenBox, 1, 4);
        
        Label parkingFees = new Label("Parking fees amount:");
        grid.add(parkingFees, 0, 5);
        TextField parkingFeesBox = new TextField();
        grid.add(parkingFeesBox, 1, 5);
        
        Label taxiCharge = new Label("Taxi amount charged:");
        grid.add(taxiCharge, 0, 6);
        TextField taxiChargeBox = new TextField();
        grid.add(taxiChargeBox, 1, 6);
        
        
        Label seminarRegistrationFees = new Label("Seminar registration fees:");
        grid.add(seminarRegistrationFees, 0, 7);
        TextField seminarRegistrationFeesBox = new TextField();
        grid.add(seminarRegistrationFeesBox, 1, 7);
        
        Label lodgingCharges = new Label("Lodging charges:");
        grid.add(lodgingCharges, 0, 8);
        TextField lodgingChargesBox = new TextField();
        grid.add(lodgingChargesBox, 1, 8);
        
        Button clear = new Button("Clear");
        clear.setOnAction(e -> {
            daysBox.clear();
            airfareBox.clear();
            carRentalBox.clear();
            milesDrivenBox.clear();
            parkingFeesBox.clear();
            taxiChargeBox.clear();
            seminarRegistrationFeesBox.clear();
            lodgingChargesBox.clear();
        });
        
        HBox hbox1 = new HBox(10);
        hbox1.getChildren().add(calculate);
        hbox1.getChildren().add(clear);
        grid.add(hbox1, 0, 9);
        
        scene.getStylesheets().add("mystyle.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
