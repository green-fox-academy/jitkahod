import java.util.ArrayList;
import java.util.Comparator;

public class OOPFarm {
    ArrayList<OOPAnimal> list = new ArrayList<>();
    int freeslots;


    public OOPFarm(int slots) {
        this.freeslots = slots;
    }


    public void breed() {
        if (freeslots > 0) {
            list.add(new OOPAnimal());
            freeslots -= 1;
        }
    }


    public void slaughter() {
        if (list.size() == 0)
            return;
        OOPAnimal leasthunger = list.get(0);

        for (OOPAnimal e : list) {
            if (leasthunger.hunger > e.hunger) {
                leasthunger = e;
            }
        }
        list.remove(leasthunger);
        freeslots += 1;
    }
}

