package homeworks.fileanalyzer;

import java.io.IOException;
import java.util.Map;

public class FileAnalyzerDemo {
    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String path = "C:\\Users\\user\\IdeaProjects\\JavaCore-2025\\src\\homeworks\\fileanalyzer\\test.txt";
        Map<String, Integer> stringIntegerMap = fileAnalyzer.topFrequentWords(path,3);
//        System.out.println(fileAnalyzer.uniqueWordCount(path));
//        System.out.println(fileAnalyzer.totalWordCount(path));

      //  Map<String, Integer> stringIntegerMap = fileAnalyzer.wordMap(path);
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+"->"+stringIntegerEntry.getValue());

        }
        System.out.println(fileAnalyzer.countWordOccurrences(path,"poxos"));
    }

}
