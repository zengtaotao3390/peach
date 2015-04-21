package com.peach.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by y400 on 2015/4/21.
 */
public class MyRemoteTestImpl extends UnicastRemoteObject implements MyRemoteTest {

    protected MyRemoteTestImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "test remote hello";
    }

    public static void main(String[] args){
        try {
            MyRemoteTest service = new MyRemoteTestImpl();
            Naming.rebind("remoteHello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
