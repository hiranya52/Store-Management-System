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
import model.dto.ItemInfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemInfoController implements Initializable {

    ObservableList<ItemInfoDTO> itemInfoDTOS = FXCollections.observableArrayList(
            new ItemInfoDTO("I001", "Red Rice 5kg", "Groceries", 40, 1200.00),
            new ItemInfoDTO("I002", "White Sugar 1kg", "Groceries", 75, 250.00),
            new ItemInfoDTO("I003", "Anchor Milk Powder 400g", "Dairy", 60, 890.00),
            new ItemInfoDTO("I004", "Sunlight Soap 100g", "Household", 120, 180.00),
            new ItemInfoDTO("I005", "Coca-Cola 1L", "Beverages", 50, 350.00),
            new ItemInfoDTO("I006", "Kist Jam 500g", "Groceries", 35, 560.00),
            new ItemInfoDTO("I007", "Maggie Noodles Pack", "Snacks", 200, 150.00),
            new ItemInfoDTO("I008", "Signal Toothpaste 120g", "Personal Care", 90, 420.00),
            new ItemInfoDTO("I009", "Kellogg’s Corn Flakes 250g", "Breakfast", 45, 950.00),
            new ItemInfoDTO("I010", "Sunflower Oil 1L", "Groceries", 70, 1150.00)
    );

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colQtyOnHand;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableView<ItemInfoDTO> tblItemInfo;

    @FXML
    private TextField txtCategory;

    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtItemCode;

    @FXML
    private TextField txtQtyOnHand;

    @FXML
    private TextField txtUnitPrice;

    @FXML
    void btnAddOnAction(ActionEvent event) {
        String itemCode = txtItemCode.getText();
        String description = txtDescription.getText();
        String category = txtCategory.getText();
        int qtyOnHand = Integer.parseInt(txtQtyOnHand.getText());
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());

        ItemInfoDTO itemInfoDTO = new ItemInfoDTO(itemCode,description,category,qtyOnHand,unitPrice);
        itemInfoDTOS.add(itemInfoDTO);

        txtItemCode.setText("");
        txtDescription.setText("");
        txtCategory.setText("");
        txtQtyOnHand.setText("");
        txtUnitPrice.setText("");

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtItemCode.setText("");
        txtDescription.setText("");
        txtCategory.setText("");
        txtQtyOnHand.setText("");
        txtUnitPrice.setText("");
    }

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

        ItemInfoDTO selectedItem = tblItemInfo.getSelectionModel().getSelectedItem();

        if (selectedItem != null){
            itemInfoDTOS.remove(selectedItem);
            tblItemInfo.refresh();

            txtItemCode.setText("");
            txtDescription.setText("");
            txtCategory.setText("");
            txtQtyOnHand.setText("");
            txtUnitPrice.setText("");

        }

    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colQtyOnHand.setCellValueFactory(new PropertyValueFactory<>("qtyOnHand"));
        colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));

        tblItemInfo.setItems(itemInfoDTOS);

        tblItemInfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue)->{
            txtItemCode.setText(newValue.getItemCode());
            txtDescription.setText(newValue.getDescription());
            txtCategory.setText(newValue.getCategory());
            txtQtyOnHand.setText(String.valueOf(newValue.getQtyOnHand()));
            txtUnitPrice.setText(String.valueOf(newValue.getUnitPrice()));
        });

    }
}
