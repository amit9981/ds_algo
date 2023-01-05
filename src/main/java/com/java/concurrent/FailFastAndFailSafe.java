package com.java.concurrent;
/*The Fail-fast iterators use modCount, i.e., an internal flag to check whether the collection is structurally modified or not.
 When the Fail-fast iterator gets the next value using the next() method, it checks the modCount flag's value.
 When the iterator finds the modified modCount value, it throws the ConcurrentModificationException.
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/*When we use the Fail-fast iterator, it immediately throws ConcurrentModificationException
when an element is added or removed from the collection while the thread is iterating over the collection.
 */
public class FailFastAndFailSafe {

    private Map mapValue() {
        Map<Integer, String> students = new HashMap<Integer, String>();
        students.put(101, "Emma");
        students.put(102, "Paul");
        students.put(103, "Walker");
        return students;
    }

    private ArrayList listValue() {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Emma");
        students.add("Paul");
        students.add("Walker");
        students.add("Elanie");
        students.add("Amara");
        return students;
    }

    @Test
    public void failFastIteratorInMap() {
        Map<Integer, String> students = mapValue();
        //creating an instance of the Iterator class
        Iterator itr = mapValue().keySet().iterator();
        //iterating map using Iterator
        while (itr.hasNext()) {
            //printing elements of Map
            System.out.println(students.get(itr.next()));
            // adding an element to Map
            students.put(104, "Rubby"); // on the next call of next() method, exception will be thrown.
        }
    }

    @Test
    public void failFastIteratorInArray() {
        ArrayList students = listValue();
        //creating an instance of the Iterator class
        Iterator itr = students.iterator();
        //iterating ArrayList using Iterator
        while (itr.hasNext()) {
            if ((String) itr.next() == "Paul")
                // It will not throw an exception
                students.remove("Amara");
        }
        System.out.println(students);
        itr = students.iterator();
        //iterating ArrayList using Iterator
        while (itr.hasNext()) {
            if ((String) itr.next() == "Walker")
                // It will throw an exception on next call of next() method
                students.remove("Walker");
        }
    }

    @Test
    public void failSafeIteratorInMap() {
        Map<Integer, String> students = mapValue();
        ConcurrentHashMap<Integer, String> copyStudents = new ConcurrentHashMap<Integer, String>(students);

        //creating an instance of the Iterator class
        Iterator itr = copyStudents.keySet().iterator();

        //iterating map using Iterator
        while (itr.hasNext()) {
            //printing elements of copyStudents
            System.out.println(copyStudents.get(itr.next()));

            // adding an element to copyStudents
            copyStudents.put(104, "Rubby"); // on the next call of next() method, exception will be thrown.
        }
    }

    @Test
    public void failSafeIteratorInArray() {
        ArrayList students = listValue();
        CopyOnWriteArrayList<String> copyStudents = new CopyOnWriteArrayList<String>(students);

        //creating an instance of the Iterator class
        Iterator itr = copyStudents.iterator();

        //iterating CopyOnWriteArrayList using Iterator
        while (itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println(name);
            if (name == "Paul")
                // The Rubby name will not print but it has created separate copy
                copyStudents.add("Rubby");
        }
    }
}

