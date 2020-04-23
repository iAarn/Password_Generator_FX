package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Controller {

    @FXML
    public Button copyButton;
    public CheckBox upperCheckbox;
    public CheckBox digitsCheckbox;
    public CheckBox charsCheckbox;
    public Button generateButton;
    public TextField enterTextField;
    public TextField setTextField;

    @FXML
    private void gButtonClicked(){
        if (AlgorithmHash.CharsValidator(enterTextField.getText())) {
            setTextField.setText(AlgorithmHash.Algorithm(Integer.parseInt(enterTextField.getText()), upperCheckbox.isSelected(),
                    digitsCheckbox.isSelected(), charsCheckbox.isSelected()));  }
    }
    public void copyButtonClicked(ActionEvent actionEvent) {
        String ctc = setTextField.getText();
        StringSelection stringSelection = new StringSelection(ctc);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
    public void upperCheckboxClicked(ActionEvent actionEvent) {    }
    public void digitsCheckboxClicked(ActionEvent actionEvent) {    }
    public void charsCheckboxClicked(ActionEvent actionEvent) {    }
    public void enterTextFieldAction(javafx.scene.input.KeyEvent actionEvent) {
        if(actionEvent.getEventType().equals(KeyEvent.VK_ENTER)) {
            if (AlgorithmHash.CharsValidator(enterTextField.getText())) {
                setTextField.setText(AlgorithmHash.Algorithm(Integer.parseInt(enterTextField.getText()), upperCheckbox.isSelected(),
                        digitsCheckbox.isSelected(), charsCheckbox.isSelected()));   }
        }
            }
    public void setTextFieldAction(ActionEvent actionEvent) {

        setTextField.setText(AlgorithmHash.Algorithm(Integer.parseInt(enterTextField.getText()), upperCheckbox.isSelected(),
                digitsCheckbox.isSelected(), charsCheckbox.isSelected()));   }
}