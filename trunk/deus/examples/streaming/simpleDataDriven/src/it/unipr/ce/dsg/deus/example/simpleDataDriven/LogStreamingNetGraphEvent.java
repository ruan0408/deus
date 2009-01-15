package it.unipr.ce.dsg.deus.example.simpleDataDriven;

import it.unipr.ce.dsg.deus.core.Engine;
import it.unipr.ce.dsg.deus.core.Event;
import it.unipr.ce.dsg.deus.core.InvalidParamsException;
import it.unipr.ce.dsg.deus.core.Process;
import it.unipr.ce.dsg.deus.core.RunException;

import java.util.Properties;

/**
 * <p>
 * This Event logs a number of statistics related to the current "snapshot" of
 * the StreamingPeer network:
 * <ol>
 * <li>mean value and variance of the chromosomes</li>
 * <li>initial and mean Streaming value</li>
 * <li>number of searchers (i.e. peers with at least 1 query sent)</li>
 * <li>average QHR (query hit ratio)</li>
 * </ol>
 * 
 * @author Michele Amoretti (michele.amoretti@unipr.it)
 * 
 */
public class LogStreamingNetGraphEvent extends Event {

	public LogStreamingNetGraphEvent(String id, Properties params,
			Process parentProcess) throws InvalidParamsException {
		super(id, params, parentProcess);
		initialize();
	}

	public void initialize() throws InvalidParamsException {
	}

	public void run() throws RunException {
		
		getLogger().info("#####################################################");
		getLogger().info("#NWB Data for Streaming P2P");
		getLogger().info("*Nodes "+ Engine.getDefault().getNodes().size());
		getLogger().info("id*int label*string color*string");
		
		ServerPeer serverPeer = (ServerPeer) Engine.getDefault().getNodes().get(0);

		getLogger().info(serverPeer.getKey()+ " "+ "\""+serverPeer.getId()+"\"" + " "+ "\""+ "red" +"\"");
		
		//Controllo le connessioni attive dei diversi nodi
		for(int index = 1; index < Engine.getDefault().getNodes().size(); index++ ){
			
			StreamingPeer peer = (StreamingPeer) Engine.getDefault().getNodes().get(index);
			
			String color = "";
			
			//Se il nodo � connesso
			if(peer.isConnected())
			{
			
				if(peer.getId().equals("pcNode"))
					color = "blue";
				
				if(peer.getId().equals("mobileNode"))
					color = "241,85,0";
				
				if(peer.getId().equals("mobile3GNode"))
					color = "green";
				
				getLogger().info(peer.getKey()+ " " + "\""+peer.getId()+"\""+ " "+ "\""+ color +"\"");
			}
			else
			{
				color = "white";
				getLogger().info(peer.getKey()+ " " + "\""+peer.getId()+"\""+ " "+ "\""+ color +"\"");
			}
		}
		
		
		getLogger().info("*DirectedEdges");
		getLogger().info("source*int	target*int color*string");
		
		//Controllo le connessioni attie dei diversi nodi
		for(int index = 1; index < Engine.getDefault().getNodes().size(); index++ ){
			
			StreamingPeer peer = (StreamingPeer) Engine.getDefault().getNodes().get(index);

			if(peer.isConnected())
			{

				String color = "";
				
				if(peer.getServerNode() != null)
				{
					color = "red";
					
					getLogger().info(peer.getKey() + " " + peer.getServerNode().getKey()  + " " +  "\""+ color +"\"");
				}

				if(peer.getSourceStreamingNode() != null)
				{
					
					if(peer.getSourceStreamingNode().getId().equals("pcNode"))
						color = "blue";
					
					if(peer.getSourceStreamingNode().getId().equals("mobileNode"))
						color = "241,85,0";
					
					if(peer.getSourceStreamingNode().getId().equals("mobile3GNode"))
						color = "green";
					
					getLogger().info(peer.getKey() + " " + peer.getSourceStreamingNode().getKey()  + " " +  "\""+ color +"\"");
					
				}
				
			}
		}

		getLogger().info("#####################################################");
	}

}