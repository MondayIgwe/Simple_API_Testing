package deleteThisFolder;

import java.io.DataOutputStream;
import java.io.IOException;

public class A {

    public final DataOutputStream dataOutputStream;

    public A(DataOutputStream dataOutputStream) {
        this.dataOutputStream = dataOutputStream;
    }

    public void Output(int b) throws IOException {
        dataOutputStream.write(b);
    }
}
