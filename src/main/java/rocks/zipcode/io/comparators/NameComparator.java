package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {

    public int compare(Item i1, Item i2){
        return i1.getName().compareTo(i2.getName());
    }
}
