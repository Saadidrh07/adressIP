package com.example.ipi.Controller;

import com.example.ipi.Model.IP;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button Submit;

    @FXML
    private TextField textAdressReseau;

    @FXML
    private TextField txtClass;

    @FXML
    private TextField ïdOct1;

    @FXML
    private TextField ïdOct2;

    @FXML
    private TextField ïdOct3;

    @FXML
    private TextField ïdOct4;

    @FXML
    void  submit(MouseEvent event) {
        int oct1 = Integer.parseInt(ïdOct1.getText());
        int oct2 = Integer.parseInt(ïdOct2.getText());
        int oct3 = Integer.parseInt(ïdOct3.getText());
        int oct4 = Integer.parseInt(ïdOct4.getText());

        IP ip= new IP(oct1,oct2,oct3,oct4);
        textAdressReseau.setText(ip.getAdresseReseau().toString());
        txtClass.setText(String.valueOf(ip.getClasse()));
    }

}


