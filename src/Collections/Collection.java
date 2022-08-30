package Collections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import static java.lang.System.*;

public class Collection {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream("src/Collections/testText.txt");
        int lenght = stream.available();
        byte [] data = new byte[lenght];
        final int read = stream.read(data);
        String text = new String(data);
        String [] myArr = text.split(" ");


        ArrayList<String> MyArrayList = new ArrayList<>();
        Collections.addAll(MyArrayList, myArr);
        out.println("--------------Слова в файле: ");
        out.println();
        out.println(MyArrayList);
        Set<String> noDubl = new TreeSet<>(MyArrayList);
        out.println();
        out.println("--------------Слова в алфавитном порядке: ");
        out.println();
        out.println(noDubl);


        ArrayList<String> MyArrayList1 = new ArrayList<>(noDubl);
        int kol;
        int max=0;
        int kolMax=0;
        out.println();
        out.println("--------------Слово встречается в файле: ");
        out.println();

        for (int i=0; i<MyArrayList1.size(); i++){
          

            String oneWord = MyArrayList1.get(i);
            kol=0;
            for (String dubWord : MyArrayList) {
                if (oneWord.equals(dubWord)) {
                    kol++;
                }
            }
            if (kolMax<kol){
                max = i;
                kolMax = kol;
            }

            out.println(oneWord + " - " + kol);
        }
        out.println("-----------------Чаще всего встречается:");
        out.println();
        out.println(MyArrayList1.get(max) + " - "+ kolMax);
    }
    }

