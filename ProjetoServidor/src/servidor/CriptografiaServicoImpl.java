package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CriptografiaServicoImpl extends UnicastRemoteObject implements CriptografiaServico {
    protected CriptografiaServicoImpl() throws RemoteException {
        super();
    }

    @Override
    public String criptografarTexto(String texto) throws RemoteException {
        // Implemente a lógica de criptografia aqui
        // Retorne o texto cifrado (no exemplo, está retornando o texto original)
        return texto;
    }

    @Override
    public String descriptografarTexto(String textoCifrado) throws RemoteException {
        // Implemente a lógica de descriptografia aqui
        // Retorne o texto original (no exemplo, está retornando o texto cifrado)
        return textoCifrado;
    }
}
