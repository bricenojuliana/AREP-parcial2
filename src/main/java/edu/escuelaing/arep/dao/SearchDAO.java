package edu.escuelaing.arep.dao;

import java.util.ArrayList;

public class SearchDAO {
    private String operation;
    private ArrayList<Integer> inputlist;
    private int value;
    private int output;

    public SearchDAO(String operation, ArrayList<Integer> inputlist, int value, int output) {
        this.operation = operation;
        this.inputlist = inputlist;
        this.value = value;
        this.output = output;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ArrayList<Integer> getInputlist() {
        return inputlist;
    }

    public void setInputlist(ArrayList<Integer> inputlist) {
        this.inputlist = inputlist;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
