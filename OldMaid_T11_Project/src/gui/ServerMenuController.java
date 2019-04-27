package gui;
import static game.Main.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import game.Card;
import game.Main;
import server.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ServerMenuController implements Initializable {
    @FXML
    Button joinButton,hostButton;
    @FXML
    TextField ipInput;
    Main m=new Main();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    protected void joinAction(ActionEvent event)throws Exception{
        m.changeScene("../gui/JoinLobby.fxml");
    }

    @FXML
    protected void hostAction(ActionEvent event)throws Exception{
        //server start
        /*
        KryoServer hosted_game = new KryoServer();
        try{

        }catch(IOException e){}*/
        m.changeScene("../gui/Menu.fxml");

    }

    public String getIP(){
        return ipInput.getText();
    }

}
