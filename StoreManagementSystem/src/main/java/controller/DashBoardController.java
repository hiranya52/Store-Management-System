package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {

    @FXML
    void btnCustomerInfoOnAction(ActionEvent event) {
        try {
            // Load dashboard
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/customer_info.fxml"));
            Scene scene = new Scene(loader.load());

            // Get current stage from event source
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnEmployeeInfoOnAction(ActionEvent event) {
        try {
            // Load dashboard
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/employee_info.fxml"));
            Scene scene = new Scene(loader.load());

            // Get current stage from event source
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnItemInfoOnAction(ActionEvent event) {
        try {
            // Load dashboard
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/item_info.fxml"));
            Scene scene = new Scene(loader.load());

            // Get current stage from event source
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnSupplierInfoOnAction(ActionEvent event) {
        try {
            // Load dashboard
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/supplier_info.fxml"));
            Scene scene = new Scene(loader.load());

            // Get current stage from event source
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
