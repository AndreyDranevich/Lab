package com.university.lab5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 20.10.2016.
 */

public class Reader {
    public static List<String> readFile(String way) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(new File(way)));
        String line;
        List<String> itemsList = new ArrayList<String>();
        while ((line = in.readLine()) != null)
            itemsList.add(line);
        in.close();
        return itemsList;
    }
}