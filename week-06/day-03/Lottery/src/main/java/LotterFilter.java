import joptsimple.OptionParser;
import joptsimple.OptionSet;

class LotteryFilter {

    private LotteryMethods methods;
    private OptionParser parser;
    private OptionSet options;

    public LotteryFilter(String[] args) {
        methods = new LotteryMethods();
        parser = new OptionParser();
        parser.accepts("y").withOptionalArg();
        parser.accepts("f").withRequiredArg();
        parser.accepts("o").withRequiredArg();
        options = parser.parse(args);
        int year;
    }

    public void argHandler() {
        if (options.has("y") && !options.has("f") && !options.has("o")) {
            methods.readCSV();
            methods.writeSpecificYear(Integer.parseInt(options.valueOf("y").toString()));
        } else if (options.has("y") && options.has("f") && !options.has("o")) {
            methods.readCustomFile(options.valueOf("f").toString());
            methods.writeSpecificYear(Integer.parseInt(options.valueOf("y").toString()));
        } else if (options.has("y") && options.has("f") && options.has("o")) {
            methods.readCustomFile(options.valueOf("f").toString());
            methods.fileWriter(Integer.parseInt(options.valueOf("y").toString()), options.valueOf("o").toString());
        } else if (!options.has("y") && !options.has("f") && !options.has("o")) {
            methods.readCSV();
            methods.writer();
        } else if (!options.has("y") && options.has("f") && options.has("o")) {
            methods.readCustomFile(options.valueOf("f").toString());
            methods.customFileWriter(options.valueOf("o").toString());
        } else if (!options.has("y") && !options.has("f") && options.has("o")) {
            methods.readCSV();
            methods.customFileWriter(options.valueOf("o").toString());
        } else if (!options.has("y") && options.has("f") && !options.has("o")) {
            methods.readCustomFile(options.valueOf("f").toString());
            methods.writer();
        } else if (options.has("y") && !options.has("f") && options.has("o")) {
            methods.readCSV();
            methods.fileWriter(Integer.parseInt(options.valueOf("y").toString()), options.valueOf("o").toString());
        }
    }
}
