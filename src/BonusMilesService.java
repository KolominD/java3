public class BonusMilesService {


    public int calculate(int cost) {
        int rublesForMile = 20;
        int miles = cost / rublesForMile;

        return miles;
    }
}
