package com.company;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Phonebook {


    ArrayList<Entry> phonebook;

    public Phonebook() {
        this.phonebook = new ArrayList<>();
    }


    public void setNewNumber (String name, long number){
        phonebook.add(new Entry(number, name));


    }

    public void getNumber(String name){
        for (Entry entry : phonebook) {
        if (entry.name == name)
            System.out.println(entry);
        }



    }







    private class Entry{
    long number;
    String name;

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entry(long number, String name) {
        this.number = number;
        this.name = name;
    }

        @Override
        public String toString() {
            return

                    name + "  "+ this.number;

        }
    }






}


