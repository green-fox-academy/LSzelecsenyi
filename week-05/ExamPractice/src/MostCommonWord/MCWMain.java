public class MCWMain {

    public static void main(String[] args) {

        MCW word = new MCW();

        if (args.length == 0) {
            word.printUsage();
        } else if (args.length == 1){
            word.mostCommonWord(args);
            word.getMaxEntry(word.wordMap);
            System.out.println();
            System.out.println("Words and their occurrences are: ");
            word.wordMap.forEach((key, value) -> System.out.println(key + " " + value));
        }
    }
    
}
