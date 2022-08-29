package Collections;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Collection {
    public static void main(String[] args) throws IOException {

        FileInputStream stream = new FileInputStream("src/Collections/testText.txt");
        int lenght = stream.available();
        byte [] data = new byte[lenght];
        stream.read(data);
        String text = new String(data);
        String [] myArr = text.split(" ");


        ArrayList<String> MyArrayList = new ArrayList<>();
        for (String words:myArr) {
            MyArrayList.add(words);
        }
        System.out.println("--------------Слова в файле: ");
        System.out.println();
        System.out.println(MyArrayList);
        Collections.sort(MyArrayList);
        System.out.println();
        System.out.println("--------------Слова в алфавитном порядке: ");
        System.out.println();
        System.out.println(MyArrayList);

        Set<String> noDubl = new HashSet<String>(MyArrayList);

        ArrayList<String> MyArrayList1 = new ArrayList<>();
        for (String ewords:noDubl){
            MyArrayList1.add(ewords);
        }
        int kol;
        int max=0;
        int kolMax=0;
        System.out.println();
        System.out.println("--------------Слово встречается в файле: ");
        System.out.println();

        for (int i=0; i<MyArrayList1.size(); i++){
            String oneWord = MyArrayList1.get(i);
            kol=0;
            for (int j=0; j<MyArrayList.size(); j++){
                String dubWord = MyArrayList.get(j);
                if(oneWord.equals(dubWord)){
                    kol++;
                }
            }
            if (kolMax<kol){
                max = i;
                kolMax = kol;
            }

            System.out.println(oneWord + " - " + kol);
        }
        System.out.println("-----------------Чаще всего встречается:");
        System.out.println();
        System.out.println(MyArrayList1.get(max) + " - "+ kolMax);
    }
    }

