package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("Cat D8", "жовтий", "Straight blade"));
        bulldozers.add(new Bulldozer("Komatsu D65", "синій", "U-blade"));
        return bulldozers;
    }
}
