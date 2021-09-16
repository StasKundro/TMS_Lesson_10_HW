import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

/**
 * файл TMS в репозитории для проверки
 * C:\TMS\file1.txt
 * C:\TMS\file2.txt
 * C:\TMS\file3.txt
 */

public class TaskThird {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        HashMap<String, String> result = new HashMap();
        String str1 = "";
        String str2 = "";
        int i = 0;
        int stop = 1;
        while (i == 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите адрес файла file" + stop + ".txt");
            str1 = scanner.nextLine();
            if (str1.equals("0")) {
                i++;

            } else {
                myArrayList.add(str1);
            }
            stop++;
        }
        str2 = myArrayList.get(0).replace("file1", "result");

        for (int s = 0; s < stop -2; s++) {
            try {
                String str = "";
                Scanner in = new Scanner(new File(myArrayList.get(s)));
                while (in.hasNext()) {
                    str += in.nextLine() + "\r\n";
                }
                in.close();

                String[] x = str.split("\n");
                for (int z = 0; z < x.length; z++) {
                    if (x[z].startsWith("docnum") || x[z].startsWith("kontract")) {
                        if (x[z].length() == 16) {
                            result.put("валиден\n", x[z]);

                        } else {
                            result.put("не верная длина\n", x[z]);
                        }
                    } else {
                        result.put("не верный формат документа\n", x[z]);
                    }
                }
                Set<String> keys = result.keySet();

                for (String item : keys) {
                    Files.write(Paths.get(str2), result.get(item).getBytes(), StandardOpenOption.APPEND);
                    Files.write(Paths.get(str2), item.getBytes(), StandardOpenOption.APPEND);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
