package composite.typeSafety;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {

    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();	// Delegation(위임)
        }
    }

    // Adds the graphic to the composition
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    // Remove the graphic from the composition
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
