public class BlogPost {
    public static void main(String[] args) {

        Blog blog1 = new Blog("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04.");
        Blog blog2 = new Blog("Tim Urban", "Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "2010.10.10.");
        blog2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        Blog blog3 = new Blog("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "2000.05.04.");
    //    blog3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";

        blog1.printInfo();
        blog2.printInfo();
        blog3.printInfo();

    }

}
