package com.peach.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by y400 on 2015/4/21.
 */
public interface MyRemoteTest extends Remote{
    public String sayHello() throws RemoteException;
}
