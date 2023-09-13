//import controller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Principal extends Application {
  //instancia da classe de controle

  private static Scene startTelaCamadaFisica;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    try {
      primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("diretorio")));
      primaryStage.setTitle("DataBus");
      primaryStage.setResizable(false);

      Parent telaCamadaFisica = FXMLLoader.load(getClass().getResource("diretorio"));
      startTelaCamadaFisica = new Scene(telaCamadaFisica);

      primaryStage.setScene(startTelaCamadaFisica);
      primaryStage.show();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}