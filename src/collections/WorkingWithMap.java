package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class WorkingWithMap {

    private static final Logger logger = Logger.getLogger(WorkingWithMap.class.getName());

    static void mapOperations(){
        //creating map
        Map<Integer, String> map = new HashMap<>();

        //adding elements to map
        map.put(1, "Ravi");
        map.put(2, "Suman");
        map.put(3, "Hari");

        logger.info("Printing from HashMap");
        logger.info(map.toString());

        logger.info("Printing from HashMap using foreach");
        map.forEach((key, value) -> logger.info("Key: " + key + ", Value: " + value));

        logger.info("Printing using For loop");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            logger.info("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //updating elements in map
        map.put(1, "Raja");

        logger.info("Printing updated HashMap");
    }

    public static void main(String[] args) {
        mapOperations();
    }
}
