package Exercise.DataReader;

import java.io.IOException;

/**
 * Created by ArmenianCodeAcademy on 3/25/2017.
 */
public abstract class DataReader {
    protected String fileUrl = "C:\\Users\\СЕВАК\\Desktop\\files";

    public abstract int[] read() throws IOException;
}
