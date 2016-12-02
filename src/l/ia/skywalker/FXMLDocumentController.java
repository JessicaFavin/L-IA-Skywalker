/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l.ia.skywalker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Benjamin
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label l_sentence;
    @FXML
    private TextField tf_question;
    @FXML
    private TextArea ta_answer;
    
    private void handleButtonAction(ActionEvent event) {
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleQuestionAction(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER && !tf_question.getText().isEmpty()) {
            String str = tf_question.getText();
            str = str.replaceAll(" ", "_");
            ta_answer.appendText("Me >> "+str+"\n");
            //ta_answer.appendText(">> IA: Hummmmmmmm, 42.\n");
            tf_question.setText("");
            ta_answer.appendText("IA >> "+GetURLContent.getContentFromJson(str)+"\n");
            
            ta_answer.appendText("-------------------------------------------------------------------------------\n");
        }
        
    }

 
    
}
