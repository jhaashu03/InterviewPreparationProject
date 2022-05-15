package MyProjects.DesignPattern.CompositeDesignPattern;

//Composite Design Pattern will be having a tree structure where in the tree structure
//where we will have composite object which can have multiple objects and we can have
//leaf object. If we can perform certain operation on leave node the same operation need to be
// performed on composite object
        /*
        *           computer    ----> Composite
        *   cabinate        peripheral    ----> Composite
        *  HD    MB -->C  Monitor    keyboard   ---> leaf
        *     RAM  CPU ---> Leaf
        *
        * If we know the price of leaf node(Monitor & keyboard) we will able to get the price of
        * composite object
        *
        * It is used where we create software in tree structure where one object can have
        * multiple object what ever operation we perform on leaf node same operation need to
        * be performed on composite object as well.
        **/
public class CompositeDesignPattern {

    public static void main(String args[]){
        //Leaf
        Component hd = new Leaf(4000,"HD");
        Component mouse = new Leaf(5000,"Mouse");
        Component monitor = new Leaf(8000,"Monitor");
        Component ram = new Leaf(9000,"Ram");
        Component cpu = new Leaf(10000,"CPU");

        //Composite
        Composite peripheral = new Composite("peripheral");
        Composite cabinate = new Composite("Cabinate");
        Composite motherBoard = new Composite("MB");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        cabinate.addComponent(hd);
        cabinate.addComponent(motherBoard);

        computer.addComponent(peripheral);
        computer.addComponent(cabinate);

        ram.showPrice();

        computer.showPrice();


    }


}
