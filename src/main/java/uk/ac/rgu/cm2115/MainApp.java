package uk.ac.rgu.cm2115;

/*import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;*/

/**
 * JavaFX App
 */
public class MainApp {

    public static void main(String[] args) {

       /*  Light light1 = new Light(0, false);
        Light light2 = new Light(5, true);
        Light light3 = new Light(2, true);
        Light light4 = new Light(0, false);

        Light[]lightArray = {light1, light2, light3, light4};
        for(int i = 0; i < lightArray.length; i++){
            
            lightArray[i].dimUp();
            lightArray[i].dimDown();
            lightArray[i].switchOff();
            lightArray[i].switchOn();
        }

        SmartPlug plug2 = new SmartPlug();
        SmartPlug plug1 = new SmartPlug();
        SmartPlug plug3 = new SmartPlug();
        SmartPlug plug4 = new SmartPlug();


        Thermostat therm1 = new Thermostat();
        Thermostat therm2 = new Thermostat();
        Thermostat therm3 = new Thermostat();


        

       /*  light1.switchOn();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimUp();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.dimDown();
        light1.switchOff();
        light2.switchOff();
        light2.dimDown();
        plug1.switchOn();
        plug1.switchOn();
        plug1.switchOff();
        plug1.switchOff();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnUp();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();
        therm1.turnDown();*/



        // JavaFX launch code - we'll get to this later
        //launch();
    }

    /* Code below is for JavaFX - we'll get to this later in the module! */

    /* 
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    
    public static <T> void setScene(String fxml, T model) throws IOException{

        if(fxml.endsWith(".fxml")){
            fxml = fxml.replace(".fxml","");
        }

        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource(fxml + ".fxml"));
        Parent root = loader.load();

        @SuppressWarnings("unchecked")
        Controller<T> controller = (Controller<T>)loader.getController();
        controller.setModel(model);

        scene.setRoot(root);
    }
    */


}