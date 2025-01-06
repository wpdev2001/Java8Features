import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {

        //Predicate<String> startsWithV = x -> x.toLowerCase().startsWith("v");
        Predicate<String> startsWithV = x -> x.toLowerCase().charAt(0)=='v';
        //System.out.println(startsWithV.test("Vishal"));
        Predicate<String> endsWithL = x -> x.toLowerCase().endsWith("l");
        //System.out.println(endsWithL.test("Vishal"));

        //AND
        Predicate<String> startsWithVandEndsWithL = startsWithV.and(endsWithL);
        System.out.println(startsWithVandEndsWithL.test("Bishal"));

        //OR
        Predicate<String> startsWithVorEndsWithL = startsWithV.or(endsWithL);
        System.out.println(startsWithVorEndsWithL.test("Vishali"));

        //NEGATE
        System.out.println(startsWithVandEndsWithL.negate().test("Vishal"));

        //ISEQUAL
        Predicate isEqualPredicate = Predicate.isEqual(2);
        System.out.println(isEqualPredicate.test(2));

    }
}
