package com.peach.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by y400 on 2015/4/21.
 */
public class MyRemoteClient {

    public static void main(String[] args){
        new MyRemoteClient().go();
    }

    public void go(){
        try {
            MyRemoteTest service = (MyRemoteTest) Naming.lookup("rmi://127.0.0.1/remoteHello");
            String str = service.sayHello();
            System.out.println(str);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
