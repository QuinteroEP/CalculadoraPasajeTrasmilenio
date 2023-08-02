//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pabloqc.transmilenio;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controlador {
    @FXML
    private Label weekly;
    @FXML
    private Label monthly;
    @FXML
    private TextField cost;
    @FXML
    private TextField days;
    @FXML
    private TextField doubleDays;

    public Controlador() {
    }

    public String getCost() {
        return this.cost.getText();
    }

    public String getDays() {
        return this.days.getText();
    }

    public String getDoubleDays() {
        return this.doubleDays.getText();
    }

    public void calcular() {
        int c = Integer.parseInt(this.getCost(), 10);
        int d = Integer.parseInt(this.getDays(), 10);
        int ex = Integer.parseInt(this.getDoubleDays(), 10);
        c *= 2;
        int costoSemana = c * d + c * ex;
        this.weekly.setText(String.valueOf(costoSemana));
        this.monthly.setText(String.valueOf(costoSemana * 4));

    }
}
