package mvc;

import mvc.controller.ControllerInterface;
import mvc.controller.HeartController;
import mvc.model.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
