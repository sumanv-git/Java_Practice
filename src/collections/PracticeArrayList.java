package collections;

import java.util.*;
import java.util.logging.Logger;

import static java.lang.String.valueOf;

public class PracticeArrayList {

    private static final Logger logger = Logger.getLogger(PracticeArrayList.class.getName());

    void collectionOperations() {
        //Creating collection
        List<Integer> nums = new ArrayList<>();

        //Adding elements to collection
        nums.add(5);
        nums.add(10);
        nums.add(15);

        logger.info("Printing from ArrayList");
        logger.info(nums.toString());

        logger.info("printing from ArrayList using for loop");
        //using for each
        for(Integer num : nums) {
            logger.info(String.valueOf(num));
        }

        logger.info("Printing from ArrayList using foreach");
        nums.forEach(num-> logger.info(num.toString()));
        nums.forEach(System.out::println);

        //Using Iterator
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            logger.info(valueOf(iterator.next()));
        }

        //updating elements in collection
         nums.set(0, 20);
        nums.set(1,25);
        logger.info("Printing updated ArrayList");
        logger.info(nums.toString());

        //removing element from collection
        nums.remove(1);
        logger.info("Printing after removing element from ArrayList");
        logger.info(nums.toString());

        //checking if element exists in collection
        logger.info("Is 15 present in ArrayList? : " + nums.contains(15));

        //sorting collection
        nums.sort(null);
        Collections.sort(nums); //Using collectons
        logger.info("Printing sorted ArrayList");
        logger.info(nums.toString());

        //clearing collection
        nums.clear();
        logger.info("Printing after clearing ArrayList");
        logger.info(nums.toString());

        //checking if collection is empty
        logger.info("Is ArrayList empty? : " + nums.isEmpty());

        //converting collection to array
        Integer[] array = nums.toArray(new Integer[0]);
        logger.info("Printing array from ArrayList");
        for(Integer num : array){
            logger.info("Array "+ num);
        }

        //converting collection to set
        Set<Integer> set = new HashSet<>(nums);
        logger.info("Printing set from ArrayList");
        for(Integer num : set){
            logger.info("Set "+ num);
        }

        //converting collection to map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        logger.info("Printing map from ArrayList");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            logger.info("Map "+ entry.getKey() + " : " + entry.getValue());
        }

        //List with Objects
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Suman",35));
        personList.add(new Person("Ravi",30));

        logger.info("Printing Personslist from PersonArrayList");
        for(Person person : personList){
            logger.info( person.toString());
        }

        personList.forEach(person -> person.toString());


        //converting collection to queue

        //removing element from collection
    }

    void collectionWithList(){
        List<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(15);
        nums.add(20);

        logger.info("fixed index :" + nums.get(0));;

        logger.info("pringing from List");
        for(Integer num : nums){
            logger.info("List "+ num);
        }
    }

}