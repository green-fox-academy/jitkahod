import java.util.HashMap;

public class HashMapTelphoneBook {
    public static void main(String[] args) {

        HashMap<String, String> telbook = new HashMap<>();

        telbook.put("William A. Lathan", "405-709-1865");
        telbook.put("John K. Miller", "402-247-8568");
        telbook.put("Hortensia E. Foster", "606-481-6467");
        telbook.put("Amanda D. Newland", "319-243-5613");
        telbook.put("Brooke P. Askew", "307-687-2982");


        System.out.println(telbook.get("John K. Miller"));


        if (telbook.containsValue("307-687-2982")) {
            for (String key : telbook.keySet()) {

                if (telbook.get(key).equals("307-687-2982")) {
                    System.out.println(key);
                    break;
                }
            }
        }

        if (telbook.containsKey("Chris E. Mayer")) {
            for (String key : telbook.keySet()) {          //System.out.println(telbook.get("Chris E. Mayer"));
                if (key.equals("Chris E. Mayer")) //key == "Chris E. Mayer"
                    break;
            }
        } else {
            System.out.println("there is no Chris E. Mayer");

        }
        System.out.println(telbook.get("Chris E. Mayer"));

    }
}


