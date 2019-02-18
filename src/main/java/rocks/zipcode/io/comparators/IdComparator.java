package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    public int compare(Item i1, Item i2){
        return (int)(i1.getId() - i2.getId());
    }
}
