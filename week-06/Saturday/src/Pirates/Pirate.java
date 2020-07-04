package Pirates;

public class Pirate {
    int drinkedrums = 0;
    boolean isDead = false;
    boolean passedOut =false;

    public void drinkSomeRum() {
        if (isDead)
            System.out.println("he's dead");
        drinkedrums += 1;
    }


    public void howsItGoingMate() {
        if (drinkedrums <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            passedOut = true;
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void die() {
        isDead = true;
    }

    public void brawl(Pirate pirate) {
        if (isDead) {
            System.out.println("he's dead");
        } else if (pirate.isDead) {
            return;
        } else {
            int brawlrandom = 1 + (int)(Math.random() * 3);
            if(brawlrandom == 1){
                die();
            }else if (brawlrandom == 2){
                pirate.die();
            } else
            passedOut = true;
            pirate.passedOut = true;
        }
    }


}