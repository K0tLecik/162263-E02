package Z3;

import java.io.FilenameFilter;
import java.io.File;
import java.util.Arrays;

public class Zadanie3
{
    public static void main(String[] args)
    {
        File file = new File("src/");
        String[] katalogi = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
            }
        });
        System.out.println(Arrays.toString(katalogi));
    }


}
