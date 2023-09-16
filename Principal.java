import javafx.application.Application;
import javafx.stage.Stage;
import model.*;

public class Principal extends Application{
  public static void main(String[] args) {

    launch(args);
  }
  @Override
  public void start(Stage primaryStage) throws Exception {
    TrocaTelas trocaTelas = new TrocaTelas();
    trocaTelas.start(primaryStage);
    
  }
}