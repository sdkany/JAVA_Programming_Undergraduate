import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author SDKany
 * @ClassName Exp06
 * @Date 2023/5/29 14:02
 * @Version V1.0
 * @Description
 */
public class Exp06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("四级常用单词.txt"));
        String a = null;
        int[] counts = new int[26];
        while ((a = br.readLine()) != null){
            a = a.trim().toLowerCase();
            //System.out.println(a);
            if (!a.isEmpty()){
                String[] strs = a.split("[^a-zA-Z]");
                //System.out.println(strs[0]);
                for (int i = 0; i < strs[0].length(); i++) {
                    counts[strs[0].charAt(i) - 'a'] ++;
                }
            }
        }
        for (int i = 0; i < counts.length; i++) {
            //System.out.println((char)(i + 'a') + " : " + counts[i]);
        }
        br.close();

        TreeMap<Integer, Character> tree = new TreeMap<>();
        for (int i = 0; i < counts.length; i++) {
            tree.put(counts[i], (char)(i + 'a'));
            //System.out.println((char)(i + 'a') + " : " + counts[i]);
        }

        for (int i = 0; i < counts.length; i++) {
            Map.Entry entry = tree.pollLastEntry();
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }

        BufferedWriter bw;

    }
}
