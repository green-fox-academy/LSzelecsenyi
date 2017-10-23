import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgHandler {

    private OptionParser parser;
    private OptionSet options;
    private Methods methods;
    String whatToDo;

    public ArgHandler(String[] args) {
        methods = new Methods();
        parser = new OptionParser();
        parser.accepts("");
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        parser.accepts("r").withRequiredArg();
        parser.accepts("c").withRequiredArg();
        parser.accepts("h");
        options = parser.parse(args);
        whatToDo = "";
    }

    public void argHandler () {
        if (options.has("")) {
            methods.printUsage();
        } else if (options.has("l")){

        } else if (options.has("a")){
            methods.addNew();
            whatToDo = options.valueOf("a").toString();
        } /*else if (options.has("r")){
            methods.removeTask();
        } else if (options.has("c")){
            methods.checkTask();
        } else if (options.has("l")){
            methods.printHelp();
        }*/
    }


}
