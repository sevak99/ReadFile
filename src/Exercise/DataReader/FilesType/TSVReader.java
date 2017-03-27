package Exercise.DataReader.FilesType;

import Exercise.DataReader.DataReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ArmenianCodeAcademy on 3/25/2017.
 */
public class TSVReader extends DataReader {

    private String fileName;

    public TSVReader(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
    }

    @Override
    public int[] read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileUrl + "\\" + fileName));
        String line = bufferedReader.readLine();
        String[] strArray = line.split("\t");
        int[] array = new int[strArray.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Integer(strArray[i]);
        }
        return array;
    }
}
