import java.awt.*;
import java.util.ArrayList;

public class OOPSharpieSet {
    ArrayList<OOPSharpie> list = new ArrayList<>();

    public int countUsable() {
        int usable = 0;
        for (OOPSharpie e : list) {
            if (e.inkAmount > 0) {
                usable += 1;
            }
        }
        return usable;
    }

    public void removeTrash() {
        for (OOPSharpie e : list) {
            if (e.inkAmount <= 0) {
                list.remove(e);        //tady nastane problem s odmazanim indexu v arraylistu, ktery nevim jak vyresit :)
            }
        }
    }
}
/*  Reuse your Sharpie class
    Create SharpieSet class
        it contains a list of Sharpie
        countUsable() -> sharpie is usable if it has ink in it
        removeTrash() -> removes all unusable sharpies
*/
