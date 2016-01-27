package exercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TheQuestion {
    private Integer findLeast(List<Integer> someList) {
        Integer curr = 0;
        return curr;
    }

    private Integer[] findLeastTwo(List<Integer> someList) {

        Integer[] value = {0,0};
        return value;
    }

    @Test
    public void shouldReturnLeastTwoInList() {
        List<Integer> theList = getList();
        Integer[] actual = findLeastTwo(theList);
        Integer[] expected = new Integer[]{2,3};
        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnLeastInList() {
        List<Integer> theList = getList();
        Integer actual = findLeast(theList);
        Integer expected = new Integer(2);
        assertEquals(expected,actual);
    }

    private List<Integer> getList() {
        List<Integer> theList = new ArrayList<Integer>();
        theList.add(2);
        theList.add(55);
        theList.add(99);
        theList.add(3);
        theList.add(55);
        theList.add(44);
        theList.add(82);
        return  theList;
    }

}
