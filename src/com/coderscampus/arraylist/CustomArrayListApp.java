package com.coderscampus.arraylist;

public class CustomArrayListApp {
    public static void main(String[] args) {

        CustomList<String> myCustomList = new CustomArrayList<>();
        for (int i = 1; i <= 45; i++)
            myCustomList.add("element " + i);

        for (int i = 0; i < myCustomList.getSize(); i++) {
            try {
                System.out.println(myCustomList.get(i));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            myCustomList.get(-10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            myCustomList.get(45);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            myCustomList.add("New Element");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myCustomList.get(45));
    }
}
