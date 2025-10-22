package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.dto.CustomerInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerInfoController implements Initializable {

    ObservableList<CustomerInfoDTO> customerInfoDTOS = FXCollections.observableArrayList(
            new CustomerInfoDTO("C001", "Mr.", "Danapala", "1981-02-06", 40000, "No.20 Walana", "Panadura", "Western", "12500"),
            new CustomerInfoDTO("C002", "Mrs.", "Kumari", "1978-11-22", 55000, "No.45 Temple Road", "Galle", "Southern", "80000"),
            new CustomerInfoDTO("C003", "Miss", "Tharushi", "1995-04-15", 32000, "No.10 Lake View", "Kandy", "Central", "20000"),
            new CustomerInfoDTO("C004", "Mr.", "Perera", "1988-09-30", 47000, "No.5 Beach Road", "Negombo", "Western", "11500"),
            new CustomerInfoDTO("C005", "Dr.", "Fernando", "1975-03-12", 90000, "No.88 Rose Garden", "Colombo", "Western", "00700"),
            new CustomerInfoDTO("C006", "Ms.", "Sanduni", "1993-07-19", 36000, "No.12 Hill Street", "Matara", "Southern", "81000"),
            new CustomerInfoDTO("C007", "Mr.", "Rathnayake", "1984-01-08", 52000, "No.77 Main Road", "Kurunegala", "North Western", "60000"),
            new CustomerInfoDTO("C008", "Mrs.", "Nisansala", "1990-05-25", 41000, "No.33 Flower Lane", "Jaffna", "Northern", "40000"),
            new CustomerInfoDTO("C009", "Mr.", "Jayawardena", "1982-12-14", 48000, "No.9 Green Park", "Anuradhapura", "North Central", "50000"),
            new CustomerInfoDTO("C010", "Miss", "Hansika", "1998-08-10", 35000, "No.3 River Side", "Ratnapura", "Sabaragamuwa", "70000")
    );

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCustomerID;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPostalCode;

    @FXML
    private TableColumn<?, ?> colProvince;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<?, ?> colTitle;

    @FXML
    private TableView<CustomerInfoDTO> tblCustomerInfo;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtCustomerID;

    @FXML
    private TextField txtDOB;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtProvince;

    @FXML
    private TextField txtSalary;

    @FXML
    private TextField txtTitle;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtCustomerID.setText("");
        txtTitle.setText("");
        txtName.setText("");
        txtDOB.setText("");
        txtSalary.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtProvince.setText("");
        txtPostalCode.setText("");
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colCustomerID.setCellValueFactory(new PropertyValueFactory<>("cusID"));
        colTitle.setCellValueFactory(new PropertyValueFactory<>("title"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        colPostalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));

        tblCustomerInfo.setItems(customerInfoDTOS);

        tblCustomerInfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtCustomerID.setText(newValue.getCusID());
            txtTitle.setText(newValue.getTitle());
            txtName.setText(newValue.getName());
            txtDOB.setText(newValue.getDob());
            txtSalary.setText(String.valueOf(newValue.getSalary()));
            txtAddress.setText(newValue.getAddress());
            txtCity.setText(newValue.getCity());
            txtProvince.setText(newValue.getProvince());
            txtPostalCode.setText(newValue.getPostalCode());
        });

    }
}
