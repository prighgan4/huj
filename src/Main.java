public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int bonusMiles = 20;
        int miles = price / bonusMiles;
        int UltraBonusMiles = service.calculate(miles);
        System.out.println(miles);
    }
}