package HW_4.E2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ftnShars = new ArrayList<>();

        ftnShars.add("gf");
        ftnShars.add("ardh");
        ftnShars.add("adfh");
        ftnShars.add("afdsh");
        ftnShars.add("tykety");
        ftnShars.add("gafdhjr");
        ftnShars.add("jhdgk");
        ftnShars.add("fgj");
        ftnShars.add("wertyjyt");
        ftnShars.add("kdthgke");
        ftnShars.add("adrfh");
        ftnShars.add("kuykul8");
        ftnShars.add("re6");
        ftnShars.add("iuyiy");
        ftnShars.add("we4rt");

        ftnShars.sort(String::compareToIgnoreCase);
        System.out.println(ftnShars);
    }
}
