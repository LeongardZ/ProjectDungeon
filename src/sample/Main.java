package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void fonts(){

        Scene mainMenu, tutorialScreenMenu;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/StartScreen.fxml"));
        primaryStage.setTitle("Project Dungeon");
        primaryStage.setScene(new Scene(root, 1728, 972));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

    }
}