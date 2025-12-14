package homeworks.fileanalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {


    public Map<String, Integer> wordMap(String path) throws IOException {
        Map<String, Integer> resultMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (resultMap.containsKey(word)) {
                        resultMap.put(word, resultMap.get(word) + 1);
                    } else {
                        resultMap.put(word, 1);
                    }

                }
            }

        }
        return resultMap;
    }

    public int totalWordCount(String path) throws IOException {

        Map<String, Integer> stringIntegerMap = wordMap(path);
        int sum = 0;
        for (Integer value : stringIntegerMap.values()) {
            sum += value;

        }

        return sum;
    }
//        int count = 0;
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            String line;
//            while ((line = br.readLine())!=null){
//                String[] words = line.split(" ");
//                for (String word : words) {
//                    if (!word.isEmpty()){
//                        count++;
//                    }
//
//                }
//            }
//        }
//        return count;


//    }


    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        Map<String, Integer> stringIntegerMap = wordMap(path);

        return stringIntegerMap.size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        Map<String, Integer> wordMap = wordMap(path);
        Set<Map.Entry<String, Integer>> entries = wordMap.entrySet();

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(entries);
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int length = Math.min(entryList.size(), n);
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < length; i++) {
            Map.Entry<String, Integer> stringIntegerEntry = entryList.get(i);
            resultMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());


        }
        return resultMap;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число

        return wordMap(path).getOrDefault(word,0);
    }
}
