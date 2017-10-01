public class Blog {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public Blog (String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }

    public Blog () {

    }

    public void printInfo () {
        System.out.println("Author: " + authorName + "\n" + title + "\n\n" + text + "\n" + publicationDate + "\n\n\n") ;
    }

}
