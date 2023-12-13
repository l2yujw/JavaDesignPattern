package proxy.remoteService;

import java.rmi.*;

/**
 *      1단계
 *      1. java.rmi.Remote를 확장
 *      2. 모든 메소드를 RemoteException을 던지도록 선언
 *      3. 원격 메소드의 인자와 리턴값은 반드시 원시 형식(primitive) 또는 Serializable 형식으로 선언
 */

public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
