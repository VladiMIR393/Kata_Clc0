import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum Rome {
    I(1),IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);
    public int arab;

    Rome(int arab){
        this.arab = arab;

    }
    public int getArabic(){
        return arab;
    }

    public static List<Rome> getReverseSortedValues(){
        return(Arrays.stream(values())
                .sorted(Comparator.comparing((Rome e) -> e.arab).reversed())
                .collect(Collectors.toList()));
    }
}
