package com.example.resistor;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
public class HelloController {

    @FXML
    private CheckBox black;

    @FXML
    private CheckBox blue;

    @FXML
    private VBox boxcolor;

    @FXML
    private HBox boxresistor;

    @FXML
    private CheckBox brown;

    @FXML
    private CheckBox gold;

    @FXML
    private CheckBox gray;

    @FXML
    private CheckBox green;

    @FXML
    private CheckBox orange;

    @FXML
    private CheckBox red;

    @FXML
    private CheckBox silver;

    @FXML
    private CheckBox violet;

    @FXML
    private CheckBox white;

    @FXML
    private CheckBox yellow;
    int a = 0;
    @FXML
    void eventClick(ActionEvent event) {
        if(a< 4){
            Label lblColor = new Label();
            //String ch = ((CheckBox) event.getSource()).getText();
            String[] chColor1 = ((CheckBox) event.getSource()).getId().split("_");
           boolean check = ((CheckBox) event.getSource()).isSelected();
//           for (int j=0; j<12; j++){
//               if(chColor1[1] != (j+"")){
//                   ((CheckBox) event.getSource()).setSelected(false);
//               }

//           }       }
            lblColor.setStyle("-fx-pref-width: 15; -fx-pref-height : 88; -fx-background-color: "+chColor1[0]+";");
            boxresistor.getChildren().add(lblColor);
            //System.out.println(a);
            a++;
    }else if(a< 5) {

        }else if (a<6) {

        }

    }

    @FXML
    void fiveBand(ActionEvent event) {

//        String ch = ((RadioButton) event.getSource()).getText();
//        System.out.println(ch);


    }

    @FXML
    void fourBand(ActionEvent event) {


    }

    @FXML
    void sixBand(ActionEvent event) {

    }





}



