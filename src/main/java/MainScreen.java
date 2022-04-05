import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainScreen {

    @FXML
    private Button checkBtn;

    @FXML
    private TextField regexField;

    @FXML
    private TextArea stringArea;

    @FXML
    private Label ok;

    @FXML
    void onBtnClick(ActionEvent event) {

        Pattern p = Pattern.compile(regexField.getText());
        Matcher m = p.matcher(stringArea.getText());

        if (m.find())
            ok.setText("OK");
        else
            ok.setText("NG");

    }

}
