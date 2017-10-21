// This should be a simple word counter which give us the most common string in a file
// If ran from the command line without arguments it should print out the usage:
// java MostCommonWord [source]
// When the argument provided and the source is a file
// count all words in the given file and print the most common
// ("cat", "CAT", "cat," "cat." are different words )

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MCW {

    HashMap<String, Integer> wordMap;

    public void printUsage() {
        try {
            Path myPath = Paths.get("printUsageMostCommon.txt");
            List<String> lines = Files.readAllLines(myPath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
        }
    }

    public HashMap<String, Integer> mostCommonWord(String[] args) {
        wordMap = new HashMap<>();
        Path txtPath = Paths.get(args[0]);
        try {
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(txtPath);
            ArrayList<String> listToCheck = listBuilder(lines);
            for (String word : listToCheck) {
                if (wordMap.containsKey(word)) {
                    int count = wordMap.get(word);
                    wordMap.put(word, count + 1);
                } else
                    wordMap.put(word, 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordMap;
    }

    public static void getMaxEntry(Map<String, Integer> map) {
        Map.Entry<String, Integer> maxEntry = null;
        Integer max = Collections.max(map.values());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if(null != value && max == value) {
                maxEntry = entry;
            }
        }
        System.out.println("Most common word in file is: " + maxEntry.getKey());
    }

    public String[] splitString(String str) {
        String[] tempArray;
        tempArray = str.split(" ");
        return tempArray;
    }

    public ArrayList<String> listMaker(String[] strArr) {
        ArrayList<String> words = new ArrayList<String>();
        for (int j = 0; j < strArr.length; j++) {
            words.add(strArr[j]);
        }
        return words;
    }

    public ArrayList<String> listBuilder(List<String> txtLines) {
        ArrayList<String> vegsoList = new ArrayList<String>();
        for (int j = 0; j < txtLines.size(); j++) {
            vegsoList.addAll(listMaker(splitString(txtLines.get(j))));
        }
        return vegsoList;
    }

}

