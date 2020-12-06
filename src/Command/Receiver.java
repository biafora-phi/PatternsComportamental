package Command;

import java.io.IOException;
import java.io.InputStream;

import static jdk.nashorn.internal.runtime.ScriptingFunctions.exec;

public class Receiver {


    public void list(){
        System.out.println( exec("dir c:\\"));
    }

    private String exec(String command){
        String s = null;
        Runtime runtime = Runtime.getRuntime();
        Process process = null;
        try {

            process = runtime.exec("cmd /C" + command);
            process.waitFor();
            InputStream inputStream = process.getInputStream();
            int full = inputStream.available();
            byte[] out = new byte[full];
            inputStream.read(out, 0, (full - 1));
            s = new String(out);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return s;
    }

    public void path() {
        System.out.println(exec("cd"));
    }
}
