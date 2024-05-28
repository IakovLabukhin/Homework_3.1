public class BonusMilesService {
    public int calculate(int cost) {
        int bonusRubForMiles = 20;
        int bonusMiles = cost / bonusRubForMiles;
        return bonusMiles;
    }
}