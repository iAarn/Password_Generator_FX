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
    private int box1;
    private int box2;
    private int box3;
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
        new AlgorithmHash(enterTextField.getText(), box1, box2, box3);
        setTextField.setText(AlgorithmHash.getText());
    }

    public void copyButtonClicked(ActionEvent actionEvent) {
        String ctc = setTextField.getText();
        StringSelection stringSelection = new StringSelection(ctc);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }

    public void upperCheckboxClicked(ActionEvent actionEvent) {
        if(upperCheckbox.isSelected()){
            box1=1;
        }else {
            box1=0;
        }
    }

    public void digitsCheckboxClicked(ActionEvent actionEvent) {
        if(digitsCheckbox.isSelected()){
            box2=1;
        }else{
            box2=0;
        }
    }

    public void charsCheckboxClicked(ActionEvent actionEvent) {
        if(charsCheckbox.isSelected()){
            box3=1;
        }else{
            box3=0;
        }
    }

    public void enterTextFieldAction(javafx.scene.input.KeyEvent actionEvent) {

                if(actionEvent.getEventType().equals(KeyEvent.VK_ENTER)){
                    new AlgorithmHash(enterTextField.getText(), box1, box2, box3);
                    setTextField.setText(AlgorithmHash.getText());}
            }

    public void setTextFieldAction(ActionEvent actionEvent) {
        new AlgorithmHash(enterTextField.getText(), box1, box2, box3);
        setTextField.setText(AlgorithmHash.getText());
    }
}
