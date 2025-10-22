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
import model.dto.SupplierInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class SupplierInfoController implements Initializable {

    ObservableList<SupplierInfoDTO> supplierInfoDTOS = FXCollections.observableArrayList(
            new SupplierInfoDTO("S001", "Fernando", "Agro Foods Pvt Ltd", "No.45 Main Street", "Matara", "Southern", "81000", "0712345678", "agrofoods@gmail.com"),
            new SupplierInfoDTO("S002", "Perera", "Ceylon Fresh Traders", "No.12 Lake Road", "Kandy", "Central", "20000", "0776543210", "ceylonfresh@gmail.com"),
            new SupplierInfoDTO("S003", "Jayasinghe", "Oceanic Imports", "No.78 Beach Avenue", "Negombo", "Western", "11500", "0759876543", "oceanicimports@gmail.com"),
            new SupplierInfoDTO("S004", "Silva", "Green Leaf Organics", "No.22 Temple Street", "Galle", "Southern", "80000", "0723456789", "greenleaf@gmail.com"),
            new SupplierInfoDTO("S005", "Weerasinghe", "Prime Packaging Co.", "No.5 Industrial Zone", "Kurunegala", "North Western", "60000", "0761122334", "primepackaging@gmail.com"),
            new SupplierInfoDTO("S006", "Dissanayake", "Sunshine Distributors", "No.11 Market Road", "Colombo", "Western", "00100", "0789988776", "sunshine@gmail.com"),
            new SupplierInfoDTO("S007", "Gunasekara", "Pure Essentials Pvt Ltd", "No.90 Flower Road", "Gampaha", "Western", "11000", "0745566778", "pureessentials@gmail.com"),
            new SupplierInfoDTO("S008", "Rathnayake", "TechMart Distributors", "No.18 Station Road", "Badulla", "Uva", "90000", "0703344556", "techmart@gmail.com"),
            new SupplierInfoDTO("S009", "Abeykoon", "Golden Harvest Co.", "No.65 High Street", "Rathnapura", "Sabaragamuwa", "70000", "0717788990", "goldenharvest@gmail.com"),
            new SupplierInfoDTO("S010", "Kumara", "Lanka Food Supplies", "No.37 Hill Crest Lane", "Nuwara Eliya", "Central", "22200", "0756677889", "lankafoods@gmail.com")
    );

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colCompanyName;

    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    private TableColumn<?, ?> colPostalCode;

    @FXML
    private TableColumn<?, ?> colProvince;

    @FXML
    private TableColumn<?, ?> colSupplierID;

    @FXML
    private TableView<SupplierInfoDTO> tblSupplierInfo;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtCompanyName;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhone;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtProvince;

    @FXML
    private TextField txtSupplierID;

    @FXML
    void btnAddOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtSupplierID.setText("");
        txtName.setText("");
        txtCompanyName.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtProvince.setText("");
        txtPostalCode.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colSupplierID.setCellValueFactory(new PropertyValueFactory<>("supplierID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCompanyName.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        colPostalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        tblSupplierInfo.setItems(supplierInfoDTOS);

        tblSupplierInfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                txtSupplierID.setText(newValue.getSupplierID());
                txtName.setText(newValue.getName());
                txtCompanyName.setText(newValue.getCompanyName());
                txtAddress.setText(newValue.getAddress());
                txtCity.setText(newValue.getCity());
                txtProvince.setText(newValue.getProvince());
                txtPostalCode.setText(newValue.getPostalCode());
                txtPhone.setText(newValue.getPhone());
                txtEmail.setText(newValue.getEmail());
        });
    }
}
