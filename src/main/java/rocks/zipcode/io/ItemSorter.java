package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

    private Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item> itemList = new ArrayList<Item>();

        for (Item i : items) {
            itemList.add(i);
        }

        Collections.sort(itemList, comparator);

        return itemList.toArray(items);
    }

}
