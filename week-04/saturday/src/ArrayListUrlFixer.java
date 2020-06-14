import java.util.ArrayList;

public class ArrayListUrlFixer {
    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";

        String url2 = url.replace("bots", "odds");
        System.out.println(url2);

        String url3 = url.replace("https/", "https:/");
        System.out.println(url3);
        String url4 = url.replaceAll("https/","https:/");
        System.out.println(url4);

    }
}

// Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
// Also, the URL is missing a crucial component, find out what it is and insert it too!
// Try to solve it more than once using different String functions!


