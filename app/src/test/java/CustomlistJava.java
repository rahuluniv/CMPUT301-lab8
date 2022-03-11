
import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

class CustomListTest {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("calgary", "AB"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list.addCity(new City("calgary", "AB"));
        assertEquals(list.hasCity(), true);
    }

    @Test
    public void deleteCityTest() {
        list.addCity(new City("calgary", "AB"));
        int listSize = list.getCount();
        list.deleteCity();
        assertEquals(list.getCount(), listSize - 1);
    }

    @Test
    public void countCityTest() {
        assertEquals(list.getCount(), 0);
        list.addCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), 1);
        list.addCity(new City("Vancouver", "BC"));
        assertEquals(list.getCount(), 2);
    }
}
