public class UrlFixer {
    public static void main(String... args){

        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String urlCopy = url;

        url = url.substring(0, 4) + ":" + url.substring(url.indexOf("//"),url.indexOf("bots")) + "odds";
        System.out.println(url);

        urlCopy = urlCopy.replace("https", "https:");
        urlCopy = urlCopy.replace("bots", "odds");
        System.out.println(urlCopy);


    }
}