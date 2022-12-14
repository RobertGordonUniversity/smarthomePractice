package uk.ac.rgu.cm2115;

import java.util.jar.Attributes.Name;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import uk.ac.rgu.cm2115.devices.Device;

public class SmartHomeMainController extends Controller<Home>{

    @FXML private ListView<Device> lstDevices;
    @FXML private Label statusLbl;
    @FXML private Label mainLbl;
    @FXML private Button routineBtn;
    @FXML private HBox routineHBox;

    public void setModel(Home model){
        this.model = model;
        Device[] devices = model.getDevices();

        for(int i = 0; i < devices.length; i++){
            if(devices[i] != null){
                this.lstDevices.getItems().add(devices[i]);
            }
        }
    }

   
    
    
}
