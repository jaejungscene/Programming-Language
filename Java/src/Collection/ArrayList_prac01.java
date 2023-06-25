package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArrayList_prac01 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ArrayList_prac01.class.getName());
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(523);
        list.add(-1);

        logger.log(Level.INFO, String.valueOf(list));

    }
}
