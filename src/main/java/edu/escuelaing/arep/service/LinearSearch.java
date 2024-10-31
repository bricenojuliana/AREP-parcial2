package edu.escuelaing.arep.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LinearSearch {

    public LinearSearch() {
    }

    public int searchElement(ArrayList<Integer> list, Integer value) {
        boolean founded = false;
        int pos = -1;
        int element = 0;
        while (element < list.size() && !founded){
            if (list.get(element).equals(value)) {
                founded = true;
                pos = element;
            }
            element++;
        }
        return pos;
    }
}
