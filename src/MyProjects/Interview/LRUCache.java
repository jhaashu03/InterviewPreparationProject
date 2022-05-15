package MyProjects.Interview;

import java.util.*;

public class LRUCache {
    static HashSet<Integer> cache;
    static int capacity;

    public static void main(String args[]){
        LRUCache ca = new LRUCache(4);
        ca.set(1);
        ca.set(2);
        ca.set(3);
        ca.set(4);
        ca.display();
        System.out.println(ca.get(2));
        System.out.println(ca.get(5));
        ca.display();
        ca.set(5);
        System.out.println(ca.get(1));
        ca.display();
        ca.set(4);
        ca.display();
    }

    //Constructor for initializing the cache capacity with the given value.
    LRUCache(int capacity)
    {
        this.capacity = capacity;
        cache = new LinkedHashSet<>(capacity);
    }

    //Function to return value corresponding to the key.
    public boolean get(int key)
    {
        if(!cache.contains(key))
            return false;
        cache.remove(key);
        cache.add(key);
        return true;
    }

    //Function for storing key.
    public void set(int key)
    {
        if(cache.size() == capacity && !cache.contains(key)){
            int firstKey = cache.iterator().next();
            cache.remove(firstKey);
        }
        cache.add(key);
    }

    public void display(){
        LinkedList<Integer> list = new LinkedList<>(cache);

        //to display in reverse order
        Iterator<Integer> itr = list.descendingIterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
}
