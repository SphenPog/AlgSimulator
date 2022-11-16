package edu.redwoods.cis12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;

public class LinearSearchSimulationController {

    private LinearSearchSimulation lss;
    @FXML
    private TextField searchForTextField;
    @FXML
    private TextField arraySizeTextField;
    @FXML
    private ColorPicker colorColorPicker;

    public void setLss(LinearSearchSimulation lss) {
        this.lss = lss;
    }

    public TextField getSearchForTextField() {
        return searchForTextField;
    }

    @FXML
    private void simulateButtonPressed(ActionEvent ignoredEvent) {
        this.lss.simulate();
    }

    @FXML
    void createBoardButtonPressed(ActionEvent event) {
        try {
            this.lss.createBoard(
                    Integer.parseInt(
                            this.arraySizeTextField.getText()), this.colorColorPicker.getValue());
        } catch (NumberFormatException nfe) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Invalid Input");
            a.setContentText("Please set an \"Array Size\"");
            a.show();
        }
    }

}
