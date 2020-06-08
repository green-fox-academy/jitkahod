import java.util.ArrayList;

public class ArrayListPersonalFinance {
    public static void main(String[] args) {

        ArrayList<Integer> expenses = new ArrayList<>();
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);


        Integer sum = 0;
        Integer greatestNum = 0;
        Integer smallestNum = 0;
        Integer average = 0;


        for (int i = 0; i < expenses.size(); i++) {
            sum += expenses.get(i);
        }
        System.out.println("We spent: " + sum);

        //sorted

        for (Integer num : expenses) {
            if (num > greatestNum)
                greatestNum = num;
            else if (num < greatestNum)
                smallestNum = num;
        }
        System.out.println(greatestNum);
        System.out.println(smallestNum);

        System.out.println(averaging(expenses));
    }

    public static Integer averaging(ArrayList<Integer> list) {
        Integer sum = 0;
        Integer a = 0;

        for (int i = 0; i < list.size(); i++) {//nebo for(int i:list){
            sum += list.get(i);
        }
        a = sum / list.size();
        return a;
    }
}



