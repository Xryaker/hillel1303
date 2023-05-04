package org.example.lessone11;

import org.apache.maven.surefire.shade.org.codehaus.plexus.util.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lesson11 {
    public static void main(String[] args) {
        printString("milk, milk, meat, juce.");
    }

    private static void printString(String s) {
        for (String l : new LinkedHashSet<>(Arrays.asList(s.replace(",", "").replace(".", "").split(" ")))) {
            System.out.println(l.substring(0, 1).toUpperCase() + l.substring(1));

        }
    }
}
