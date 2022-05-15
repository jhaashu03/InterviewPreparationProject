package MyProjects.DesignPattern.Prototype;


/*The prototype pattern is a creational design pattern. Prototype patterns are required,
when object creation is time consuming, and costly operation,
so we create objects with the existing object itself.
One of the best available ways to create an object from existing objects is the clone() method.
Clone is the simplest approach to implement a prototype pattern.
However, it is your call to decide how to copy existing object based on your business model.*/
public class Prototype implements Cloneable{
    public static void main(String args[]) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("A");
        bs.loadData();
        System.out.println(bs);

        BookShop bs1 = new BookShop();

        //again it will go to db and load all data just ask bs give me your data
        //bs1.loadData();
        bs1= (BookShop) bs.clone();

        bs1.setShopName("A1");
        System.out.println(bs1);
    }
}
