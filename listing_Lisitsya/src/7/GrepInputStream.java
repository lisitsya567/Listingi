import java.io.*;

public class GrepInputStream extends FilterInputStream {
    String substring = null;
    BufferedReader br;

    public GrepInputStream(InputStream in, String substring)
    {
        super(in);
        this.br = new BufferedReader(new InputStreamReader(in));
        this.substring = substring;
    }
    public final String readLine() throws IOException {
        String line;
        do {
            line = br.readLine();
        } while ((line !=null) && line.indexOf(substring)==-1);
        return line;
    }
}