package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void test1(){
        // Given
        Item item1 = new Item(0L, "Starbucks", 7.00);
        Item item2 = new Item(1L, "Dunkin", 5.00);
        Item item3 = new Item(2L, "Wawa", 4.00);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        // When
        Item[] actual = itemSorter.sort(comparator);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2(){
        // Given
        Item item1 = new Item(0L, "Starbucks", 7.00);
        Item item2 = new Item(1L, "BrewHaha", 8.00);
        Item item3 = new Item(2L, "Gas Station", 2.00);
        Item[] itemsToSort = {item2, item3, item1};
        Item[] expected = {item3, item1, item2};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        // When
        Item[] actual = itemSorter.sort(comparator);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3(){
        // Given
        Item item1 = new Item(0L, "Dunkin", 5.00);
        Item item2 = new Item(1L, "Keurig", .25);
        Item item3 = new Item(2L, "McDonalds", 1.00);
        Item[] itemsToSort = {item2, item3, item1};
        Item[] expected = {item2, item3, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        // When
        Item[] actual = itemSorter.sort(comparator);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }
}
