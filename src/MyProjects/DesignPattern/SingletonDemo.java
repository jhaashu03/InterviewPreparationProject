package MyProjects.DesignPattern;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class SingletonDemo {
    public static  void main(String args[]) throws Exception{
        Singleton singleton1 = Singleton.getSingleton(); //same object is used everytime
        Singleton singleton2 = Singleton.getSingleton();
        Singleton singleton3 = Singleton.getSingleton();

        //String url = "jdbc:sqlserver://localhost;database=master;trusted_Connection=true;";
        //Connection con = DriverManager.getConnection(url);
    }

}

class Singleton{
    private static Singleton singletonDemo = new Singleton();
    private Singleton(){}

    public static Singleton getSingleton(){
        return singletonDemo;
    }
}

/*  compile time error a class with private constructor can't be extended
class child extends Singleton{

}
*/
