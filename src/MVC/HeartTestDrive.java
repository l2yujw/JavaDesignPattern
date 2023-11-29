package MVC;

import MVC.Controller.ControllerInterface;
import MVC.Controller.HeartController;
import MVC.Model.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
