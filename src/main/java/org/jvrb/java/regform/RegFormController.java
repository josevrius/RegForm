package org.jvrb.java.regform;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class RegFormController {

    final String MENU_ITEM_1 = "España";
    final String MENU_ITEM_2 = "Portugal";

    @FXML
    private TabPane tabPane;

    @FXML
    private TextField inputName;

    @FXML
    private TextField inputSurname;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputTelephone;

    @FXML
    private MenuButton selectCountry;

    @FXML
    private CheckBox acceptTerms;

    @FXML
    private Text nameValue;

    @FXML
    private Text surnameValue;

    @FXML
    private Text emailValue;

    @FXML
    private Text telephoneValue;

    @FXML
    private Text countryValue;

    @FXML
    private HBox successInfo;

    @FXML
    protected void onNextButtonClick() {
        forwardTab();
        setValues();
    }

    @FXML
    protected void onMenuItem1Select() {
        selectCountry.setText(MENU_ITEM_1);
        countryValue.setText(MENU_ITEM_1);
    }

    @FXML
    protected void onMenuItem2Select() {
        selectCountry.setText(MENU_ITEM_2);
        countryValue.setText(MENU_ITEM_2);
    }

    @FXML
    protected void onBackButtonClick() {
        backwardTab();
    }

    @FXML
    protected void onSendButtonClick() {
        if (fieldsAreFilled() && termsAreAccepted()) {
            forwardTab();
            successInfo.setVisible(true);
        }
    }

    @FXML
    protected void onCancelButtonClick() {
        Platform.exit();
    }

    @FXML
    protected void onFinishButtonClick() {
        if (successInfo.isVisible()) {
            Platform.exit();
        }
    }

    private int getCurrentTab() {
        return tabPane.getSelectionModel().getSelectedIndex();
    }

    private void forwardTab() {
        tabPane.getSelectionModel().select(getCurrentTab() + 1);
    }

    private void backwardTab() {
        tabPane.getSelectionModel().select(getCurrentTab() - 1);
    }

    private void setValues() {
        if (!inputName.getText().isEmpty()) {
            nameValue.setText(inputName.getText());
        }
        if (!inputSurname.getText().isEmpty()) {
            surnameValue.setText(inputSurname.getText());
        }
        if (!inputEmail.getText().isEmpty()) {
            emailValue.setText(inputEmail.getText());
        }
        if (!inputTelephone.getText().isEmpty()) {
            telephoneValue.setText(inputTelephone.getText());
        }
    }

    private boolean fieldsAreFilled() {
        return !nameValue.getText().isEmpty()
                && !surnameValue.getText().isEmpty()
                && !emailValue.getText().isEmpty()
                && !telephoneValue.getText().isEmpty()
                && !countryValue.getText().isEmpty();
    }

    private boolean termsAreAccepted() {
        return acceptTerms.isSelected();
    }
}