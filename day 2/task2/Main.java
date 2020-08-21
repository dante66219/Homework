package com.task2;


import task2.buildings.*;

import java.util.ArrayList;
import java.util.List;

public class Main {




    private static void residentialCheck(Residential premises) {
            if (premises.showMeSomeId().isValid()) {
                System.out.println("");
                System.out.println(premises + "\n" + "Жилое помещение");
            } else {
                System.out.println("");
                System.out.println(premises + "\n" + "Нежилое помещение");
            }
        }


    public static void main(String[] args) {

        List<Building> list = ArrayList();



        for (Building home : list) {
            residentialCheck((Residential) home);
        }

        }
    private static List<Building> ArrayList() {
        List<Building> list = new ArrayList<>();
        list.add(new flat("квартира", new validation(1), 56, 174, 23));
        list.add(new house("дом", new validation(1),90, 150, 23));
        list.add(new shop("магазин", new validation(0),120, 200, 23));
        return list;
    }

    }


