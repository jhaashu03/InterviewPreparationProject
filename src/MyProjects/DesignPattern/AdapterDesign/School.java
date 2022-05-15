package MyProjects.DesignPattern.AdapterDesign;

import MyProjects.DesignPattern.AdapterDesign.Pilot.PilotPen;
//providing a adapter between PenAdapter and Pen Interface
public class School {
    public static void main(String args[]){
        ////I do't want to create my Pen class and define all the methods
        //that's why using pilot pen

        //We can't pass object of PilotPen here becuase in seP it accepts pen
        //that's why we need a adapter between PilotPen and pen
        //PilotPen p = new PilotPen();

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setP(p);
        aw.writeAssigment("Writing an assigment...");
    }
}
