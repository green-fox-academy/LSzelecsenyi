import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Lottery {

    public static void main(String[] args) {
        OptionParser parser = new OptionParser();
        parser.accepts( "y" ).withOptionalArg().ofType( Integer.class );
        parser.accepts( "f" ).withOptionalArg().ofType( String.class );
        parser.accepts( "o" ).withOptionalArg().ofType( String.class );
        OptionSet options = parser.parse(args);

        if (options.has("y")) {
            System.out.println("`-a` was given with the argument " + options.valueOf("a"));
        }

        if (options.has("f")) {
            System.out.println("`-l` was given with the no additional information.");
        }

        if (options.has("o")) {
            System.out.println("`-l` was given with the no additional information.");
        }

        try {
            CSVReader reader = null;
            reader = new CSVReader(new FileReader("C:/Users/Lenovo/Desktop/Green Fox/LSzelecsenyi/week-06/day-03/Lotto/lotteryfilter/src/main/java/otos.csv"));
            List<String[]> lines = reader.readAll();
            CSVWriter writer = new CSVWriter(new FileWriter("C:/Users/Lenovo/Desktop/Green Fox/LSzelecsenyi/week-06/day-03/Lotto/lotteryfilter/src/main/java/out.csv"));
            writer.writeAll(lines);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
