import java.io.PrintStream;

public class ShowBits {
    private int numbits;
    public ShowBits(int numbits) {
        this.numbits=numbits;
    }
    public String getBinaryFrom(long val) {
        long mask=1;
        String from=" ";
        mask<<=numbits-1;

        int spacer =0;
        for(; mask !=0; mask>>>=1) {

            if ((val&mask) !=0) {
                from += "1";
            } else {
                from +="0";
            }

            spacer++;
            if ((spacer %8) ==0) {
                from +=" ";
                spacer=0;
            }
        }
        return from;
    }
    public void show(long val, PrintStream out) {
        String binaryFrom = getBinaryFrom(val);
    }
}