package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Intarface remota para classes do cliente
 * Receber emnsagens do servidor
 * Atualziar lista de usuarios
 */
public interface ChatClient3IF extends Remote{
	public void messageFromServer(String message) throws RemoteException;

	public void updateUserList(String[] currentUsers) throws RemoteException;
}
/**
 * 
 * 
 * 
 *
 */