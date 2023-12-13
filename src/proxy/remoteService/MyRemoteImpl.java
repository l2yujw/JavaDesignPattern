package proxy.remoteService;

import java.rmi.*;
import java.rmi.server.*;
/**
 *      2단계
 *      1. 서비스 클래스에 원격 인터페이스를 구현
 *      2. UnicastRemoteObject를 확장
 *      3. RemoteException을 선언하는 생성자를 구현
 *      4. 서비스를 RMI 레지스트리에 등록
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 1L;


    public MyRemoteImpl() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }
}
