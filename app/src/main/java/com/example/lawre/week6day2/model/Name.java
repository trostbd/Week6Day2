package com.example.lawre.week6day2.model;

public class Name
{
    private String prefix, first, middle, last;

    public Name() {
    }

    public Name(String prefix, String first, String middle, String last) {
        this.prefix = prefix;
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
