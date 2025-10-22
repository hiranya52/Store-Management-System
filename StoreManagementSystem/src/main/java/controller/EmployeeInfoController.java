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
import model.dto.EmployeeInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class EmployeeInfoController implements Initializable {

    ObservableList<EmployeeInfoDTO> employeeInfoDTOS = FXCollections.observableArrayList(
            new EmployeeInfoDTO("E001", "Sunil Perera", "832451230V", "1983-07-12", "Manager", 75000.00, "0712456789", "No.15 Temple Road, Kalutara", "2018-05-10", "Active"),
            new EmployeeInfoDTO("E002", "Nadeesha Silva", "912345678V", "1991-03-22", "Cashier", 45000.00, "0771234567", "No.24 Lake View Road, Kandy", "2020-02-15", "Active"),
            new EmployeeInfoDTO("E003", "Ruwan Jayasinghe", "852347890V", "1985-11-08", "Store Keeper", 52000.00, "0756789123", "No.8 Main Street, Galle", "2019-09-10", "Inactive"),
            new EmployeeInfoDTO("E004", "Thilini Fernando", "932459871V", "1993-01-18", "Receptionist", 40000.00, "0769988776", "No.17 Station Road, Negombo", "2021-01-25", "Active"),
            new EmployeeInfoDTO("E005", "Kasun Dissanayake", "902134567V", "1990-05-03", "Accountant", 68000.00, "0742233445", "No.3 Hill Side Lane, Kurunegala", "2017-08-14", "Active"),
            new EmployeeInfoDTO("E006", "Isuru Gunasekara", "942345671V", "1994-09-12", "Assistant Manager", 58000.00, "0726677889", "No.19 Park Avenue, Colombo", "2019-12-02", "Inactive"),
            new EmployeeInfoDTO("E007", "Chathura Ranasinghe", "882456789V", "1988-06-21", "Sales Executive", 55000.00, "0784455667", "No.45 Beach Road, Matara", "2020-07-30", "Active"),
            new EmployeeInfoDTO("E008", "Nimali Abeykoon", "952123456V", "1995-02-10", "HR Officer", 48000.00, "0715566778", "No.10 Temple Lane, Gampaha", "2022-03-01", "Active"),
            new EmployeeInfoDTO("E009", "Kamal Fernando", "872345678V", "1987-08-17", "Driver", 35000.00, "0709988776", "No.22 Garden Street, Ratnapura", "2016-10-05", "Inactive"),
            new EmployeeInfoDTO("E010", "Dilani Weerasinghe", "962345879V", "1996-12-25", "Clerk", 42000.00, "0778899001", "No.5 Market Road, Nuwara Eliya", "2023-04-11", "Active")
    );

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colContactNumber;

    @FXML
    private TableColumn<?, ?> colDOB;

    @FXML
    private TableColumn<?, ?> colEmployeeID;

    @FXML
    private TableColumn<?, ?> colJoinedDate;

    @FXML
    private TableColumn<?, ?> colNIC;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPosition;

    @FXML
    private TableColumn<?, ?> colSalary;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableView<EmployeeInfoDTO> tblEmployeeInfo;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtContactNumber;

    @FXML
    private TextField txtDOB;

    @FXML
    private TextField txtEmployeeID;

    @FXML
    private TextField txtJoinedDate;

    @FXML
    private TextField txtNIC;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPosition;

    @FXML
    private TextField txtSalary;

    @FXML
    private TextField txtStatus;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String employeeID = txtEmployeeID.getText();
        String name = txtName.getText();
        String nic = txtNIC.getText();
        String dob = txtDOB.getText();
        String position = txtPosition.getText();
        double salary = Double.parseDouble(txtSalary.getText());
        String contactNumber = txtContactNumber.getText();
        String address = txtAddress.getText();
        String joinedDate = txtJoinedDate.getText();
        String status = txtStatus.getText();

        EmployeeInfoDTO employeeInfoDTO = new EmployeeInfoDTO(employeeID, name, nic, dob, position, salary, contactNumber, address, joinedDate, status2);

        employeeInfoDTOS.add(employeeInfoDTO);
        tblEmployeeInfo.refresh();

        txtEmployeeID.setText("");
        txtName.setText("");
        txtNIC.setText("");
        txtDOB.setText("");
        txtPosition.setText("");
        txtSalary.setText("");
        txtContactNumber.setText("");
        txtAddress.setText("");
        txtJoinedDate.setText("");
        txtStatus.setText("");
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtEmployeeID.setText("");
        txtName.setText("");
        txtNIC.setText("");
        txtDOB.setText("");
        txtPosition.setText("");
        txtSalary.setText("");
        txtContactNumber.setText("");
        txtAddress.setText("");
        txtJoinedDate.setText("");
        txtStatus.setText("");
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colEmployeeID.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colDOB.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colPosition.setCellValueFactory(new PropertyValueFactory<>("position"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colContactNumber.setCellValueFactory(new PropertyValueFactory<>("contactNumber"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colJoinedDate.setCellValueFactory(new PropertyValueFactory<>("joinedDate"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        tblEmployeeInfo.setItems(employeeInfoDTOS);

        tblEmployeeInfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txtEmployeeID.setText(newValue.getEmployeeID());
                txtName.setText(newValue.getName());
                txtNIC.setText(newValue.getNic());
                txtDOB.setText(newValue.getDob());
                txtPosition.setText(newValue.getPosition());
                txtSalary.setText(String.valueOf(newValue.getSalary()));
                txtContactNumber.setText(newValue.getContactNumber());
                txtAddress.setText(newValue.getAddress());
                txtJoinedDate.setText(newValue.getJoinedDate());
                txtStatus.setText(newValue.getStatus());
            }
        });


    }
}
