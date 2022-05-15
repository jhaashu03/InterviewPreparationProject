package MyProjects.DesignPattern.AdapterDesign;

import MyProjects.DesignPattern.AdapterDesign.Pilot.PilotPen;

public class PenAdapter implements Pen {
    PilotPen pp = new PilotPen();


    @Override
    public void write(String str) {
        pp.mark(str);
    }
}
