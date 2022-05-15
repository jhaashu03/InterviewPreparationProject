package MyProjects.DesignPattern.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ComputerPart {
}

interface  Component{
    void showPrice();
}
class Leaf implements Component{
    int price;
    String name;

    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void showPrice(){
        System.out.println(name+" : "+price);
    }

}

class Composite implements Component{
    String name;

    public Composite(String name) {
        this.name = name;
    }

    //A Component object will have more Composite or leaf node
    List<Component> componenets = new ArrayList<>();

    public void addComponent(Component com){
        componenets.add(com);
    }

    public void showPrice(){
        System.out.println(name);
        for(Component c: componenets){
            c.showPrice();
        }
    }


}
