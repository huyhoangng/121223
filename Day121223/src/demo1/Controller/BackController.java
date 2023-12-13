package demo1.Controller;
import demo1.Main2;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class BackController {
    public void goToList(ActionEvent actionEvent) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../javafx/demoStudentList.fxml"));
        Main2.rootStage.setScene(new Scene(root,830,550));
    }
}
