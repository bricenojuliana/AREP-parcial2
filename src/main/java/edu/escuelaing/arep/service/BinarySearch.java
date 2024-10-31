package edu.escuelaing.arep.service;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class BinarySearch {

    public BinarySearch() {
    }

    public int searchElement(ArrayList<Integer> list, int value, int init, int end) {
        if (init > end) {
            return -1;
        }

        int med = (init + end) / 2;

        if (list.get(med) == value) {
            return med;
        } else if (list.get(med) > value) {
            return searchElement(list, value, init, med - 1);
        } else {
            return searchElement(list, value, med + 1, end);
        }
    }
}
