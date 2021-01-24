package kr.ac.mokpo;

import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args)
    {
        try
        {
            Socket server = new Socket("127.0.0.1", 5434);
            InputStream is = server.getInputStream();
            ObjectInput ois = new ObjectInputStream(is);
            String msg = (String)ois.readObject();
            System.out.println(msg);
            ois.close();
            server.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
