package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class WorkingWithSet {

    private static final Logger logger = Logger.getLogger(WorkingWithSet.class.getName());

    void setPractice (){
        Set<Integer> set = new HashSet<>();

        //Adding elements to set
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(15);

        logger.info("Printing from HashSet");
        logger.info(set.toString());

        logger.info("Printing from HashSet using for loop");
        //using for each
        for(Integer num : set) {
            logger.info(valueOf(num));
        }

        logger.info("Printing from HashSet using foreach");
        set.forEach(num-> logger.info(num.toString()));
        set.forEach(System.out::println);

        //Using Iterator
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            logger.info(valueOf(iterator.next()));
        }

        //updating elements in set
        set.add(20);
        set.add(25);

        logger.info("Printing updated HashSet");
        logger.info(set.toString());
    }

    void TreeSetExample(){
        Set<String> stringSet = new TreeSet<>();

        stringSet.add("Ravi");
        stringSet.add("Suman");
        stringSet.add("Hari");
        stringSet.add("Hari");

        logger.info("Printing from TreeSet");
        logger.info(stringSet.toString());

        logger.info("Printing from TreeSet using foreach");
        stringSet.forEach(System.out::println);

        logger.info("Printing using For loop");

        for(String name : stringSet){
            logger.info(name);
        }

        logger.info("Search for 'Hari' in TreeSet : " + stringSet.contains("Hari"));

    }
    public static void main(String[] args) {
        WorkingWithSet workingWithSet = new WorkingWithSet();
        //workingWithSet.setPractice();
        workingWithSet.TreeSetExample();
    }
}
