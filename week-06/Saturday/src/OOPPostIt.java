import java.awt.*;

public class OOPPostIt {

    Color backgroundColor;
    String text;
    Color textcolor;

    public static void main(String[] args) {

        OOPPostIt objekt1 = new OOPPostIt();
        objekt1.text = "Idea 1";
        objekt1.backgroundColor = Color.orange;
        objekt1.textcolor = Color.blue;
        System.out.println(objekt1);

        OOPPostIt objekt2 = new OOPPostIt();
        objekt2.text = "Awesome";
        objekt2.backgroundColor = Color.pink;
        objekt2.textcolor = Color.black;

        OOPPostIt objekt3 = new OOPPostIt();
        objekt3.text = "Superb!";
        objekt3.backgroundColor = Color.yellow;
        objekt3.textcolor = Color.green;
    }
}



   /* Create a PostIt class that has
        a backgroundColor
        a text on it
        a textColor
        Create a few example post-it objects:
        an orange with blue text: "Idea 1"
        a pink with black text: "Awesome"
        a yellow with green text: "Superb!" */