package javasolutionsforalgorithms.general.stream;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 * This is a new class to demonstrate the use of Pattern and Stream API
 */
public class PatternStreaming {

    static Logger log = Logger.getLogger(PatternStreaming.class.getName());

    public static int countSplitStream(String input) {
        var pattern = Pattern.compile("\\s+");

        return pattern.splitAsStream(input)
                .filter(s -> !s.isEmpty())
                .mapToInt(String::length)
                .sum();
    }

    public static void main(String[] args) {
        String input = "This is a test";
        log.log(Level.INFO, "Count of words in line: {0}", countSplitStream(input));
    }
}
