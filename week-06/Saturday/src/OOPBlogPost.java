import java.util.Date;

public class OOPBlogPost {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public static void main(String[] args) {
        OOPBlogPost blog1 = new OOPBlogPost();
        blog1.title = "Lorem Ipsum";
        blog1.authorName = "John Doe";
        blog1.publicationDate = "2000.05.04.";
        blog1.text = "Lorem ipsum dolor sit amet";
        System.out.println(blog1);

        OOPBlogPost blog2 = new OOPBlogPost();
        blog2.title = "Wait but why";
        blog2.authorName = "Tim Urban";
        blog2.publicationDate = "2010.10.10.";
        blog2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        OOPBlogPost blog3 = new OOPBlogPost();
        blog3.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        blog3.authorName = " William Turton";
        blog3.publicationDate = "2017.03.28.";
        blog3.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
    }
}

   /*Create a BlogPost class that has
        an authorName
        a title
        a text
        a publicationDate
        Create a few blog post objects:
        "Lorem Ipsum" titled by John Doe posted at "2000.05.04."
        Lorem ipsum dolor sit amet.
        "Wait but why" titled by Tim Urban posted at "2010.10.10."
        A popular long-form, stick-figure-illustrated blog about almost everything.
        "One Engineer Is Trying to Get IBM to Reckon With Trump" titled by William Turton at "2017.03.28."
        Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing. */
