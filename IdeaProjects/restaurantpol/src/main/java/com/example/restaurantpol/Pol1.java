package com.example.restaurantpol;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Pol1 {

    @FXML
    private Button buttondishes;

    @FXML
    private static Button buttoningridients;

    public static void check() {
        if (register.getAccess() == "Пользователь") {
            buttoningridients.setVisible(false);
        }
    }
}