package com.sister.kelompok5;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

	private void startServer(){
        try {        
            /*
             * register server in port 5000 and bind as service named "ConvertColor"
             */
            Registry registry = LocateRegistry.createRegistry(5000);                        
            registry.rebind("ConvertColor", new Message());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }      
        System.out.println("Server is ready");
    }
	
	public static void main(String[] args) {
        RMIServer main = new RMIServer();
        main.startServer();
    }
	
}
