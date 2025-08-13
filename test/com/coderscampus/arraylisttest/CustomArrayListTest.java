package com.coderscampus.arraylisttest;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomArrayListTest {
    // Test-Driven Development Methodology
    // Step 1 - Write a failing test
    // Step 2 - Write the business logic to make the test pass
    // Step 3 - Refactor your code

    @Test
    public void should_add_item_to_list_and_increase_size() {
        CustomList<String> sut = new CustomArrayList<>();
        sut.add("one");
        sut.add("two");
        sut.add("four");
        sut.add(2, "three");
        assert true;
        assertEquals(4, sut.getSize());
        sut.add(0, "zero");
        assert true;
        assertEquals(5, sut.getSize());
    }
    @Test
    public void should_fail_adding_at_negative_index_to_the_list() {
        CustomList<String> sut = new CustomArrayList<>();
        sut.add("one");
        sut.add("two");
        sut.add("four");
        try {
            sut.add(-2, "three");
            assert false;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void should_fail_adding_at_larger_than_size_index_to_the_list() {
        CustomList<String> sut = new CustomArrayList<>();
        sut.add("one");
        sut.add("two");
        sut.add("four");
        try {
            sut.add(4, "three");
            assert false;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void should_remove_item_from_list_and_return_the_correct_item_and_decrease_size() {
        CustomList<String> sut = new CustomArrayList<>();
        sut.add("one");
        sut.add("two");
        sut.add("four");
        String result = sut.remove(2);
        assertEquals("four", result);
        assertEquals(2, sut.getSize());
        result = sut.remove(0);
        assertEquals("one", result);
        assertEquals(1, sut.getSize());
        result = sut.remove(0);
        assertEquals("two", result);
        assertEquals(0, sut.getSize());
    }
    @Test
    public void should_fail_removing_at_negative_index_from_the_list() {
        CustomList<String> sut = new CustomArrayList<>();
        sut.add("one");
        sut.add("two");
        sut.add("four");
        try {
            sut.remove(-2);
            assert false;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void should_fail_removing_at_larger_than_size_index_from_the_list() {
        CustomList<String> sut = new CustomArrayList<>();
        sut.add("one");
        sut.add("two");
        sut.add("four");
        try {
            sut.remove(4);
            assert false;
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
