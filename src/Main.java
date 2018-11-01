import Task29.IntervalOfTime;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        Map hm = new HashMap();                                      //Задание 29
        String str = "it is a wonderful life!";

                StringTokenizer tokenizer = new StringTokenizer(str, " .\t\n\r!@#$%^>&*()_|+-=`~][{}';?/,");
                while (tokenizer.hasMoreTokens()){
                    String word = (String) tokenizer.nextElement();
                    for(int i=0, j=1; i<word.length()+1 & j<word.length()+1; i++, j++){
                        String str1 = word.substring(i, j);
                        int z = (str + "\0").split(str1).length - 1;
                        hm.put(str1, z);
                    }
                }
                System.out.println(hm);


        IntervalOfTime time1 = new IntervalOfTime(12578);     //Задание № 22
        IntervalOfTime time2 = new IntervalOfTime(15,20,36);
        time1.printAllTime();
        time2.printDividedTime();
        time2.compareTime();
    }

}










