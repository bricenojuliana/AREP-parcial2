package edu.escuelaing.arep.controller;

import edu.escuelaing.arep.dao.SearchDAO;
import edu.escuelaing.arep.service.BinarySearch;
import edu.escuelaing.arep.service.LinearSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;

@RestController
public class MathController {

    @Autowired
    private BinarySearch binarySearch;

    @Autowired
    private LinearSearch linearSearch;

    @GetMapping("/linearsearch")
    public SearchDAO getLinearSearch(
            @RequestParam(value = "list") ArrayList<Integer> list,
            @RequestParam(value = "value") int value) {
        int output = linearSearch.searchElement(list, value);
        return new SearchDAO("linearSearch", list, value, output);
    }

    @GetMapping("/binarysearch")
    public SearchDAO getBinarySearch(
            @RequestParam(value = "list") ArrayList<Integer> list,
            @RequestParam(value = "value") int value) {
        Collections.sort(list);
        int output = binarySearch.searchElement(list, value, 0, list.size()-1);
        return new SearchDAO("binarySearch", list, value, output);
    }

}
