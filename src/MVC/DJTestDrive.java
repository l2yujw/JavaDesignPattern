package MVC;

import MVC.Controller.BeatController;
import MVC.Controller.ControllerInterface;
import MVC.Model.BeatModel;
import MVC.Model.BeatModelInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
