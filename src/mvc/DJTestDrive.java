package mvc;

import mvc.controller.BeatController;
import mvc.controller.ControllerInterface;
import mvc.model.BeatModel;
import mvc.model.BeatModelInterface;

public class DJTestDrive {

    public static void main (String[] args) {
        BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
    }
}
