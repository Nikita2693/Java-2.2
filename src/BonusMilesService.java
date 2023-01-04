public class BonusMilesService {
    int bonus = 20;
    public int calculate (int cost){

        if (cost< 0 ) {
            cost = 0;
        }
         return cost / bonus;
    }
}
