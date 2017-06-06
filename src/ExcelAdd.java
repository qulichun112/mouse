/**
 * Created by ququ on 2017/3/26.
 */
public class ExcelAdd {
    public static void main(String[] args) {

    int count=0;
    String s = "wkllwfkfkfkfkfddbfkfkfkdldlkf";
    String x = "k";
        while (s.contains(x)){
            count++;
            int n=s.indexOf(x)+x.length();
            s=s.substring(n);

        }
        System.out.println(count);
    }

}
