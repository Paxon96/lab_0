package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>();
        } else {
            List<String> substrings = new ArrayList<>();

            for (int i = 0; i <= value.length(); i++) {
                substrings.add(value.substring(i));
            }

            return substrings;
        }

    }

}
