package it.unipr.ce.dsg.deus.example.jxta;

import java.util.Properties;

import it.unipr.ce.dsg.deus.core.Engine;
import it.unipr.ce.dsg.deus.core.InvalidParamsException;
import it.unipr.ce.dsg.deus.core.Node;
import it.unipr.ce.dsg.deus.core.NodeEvent;
import it.unipr.ce.dsg.deus.core.Process;
import it.unipr.ce.dsg.deus.core.RunException;

/**
 * This event represents the birth of a simulation JXTAPeer. During its execution an
 * instance of the node associated to the event will be created.
 * 
 * @author Stefano Sebastio
 * 
 */

public class JXTABirthEvent extends NodeEvent {

	public JXTABirthEvent(String id, Properties params, Process parentProcess)
			throws InvalidParamsException {
		super(id, params, parentProcess);
		initialize();
	}

	public void initialize() throws InvalidParamsException{
		
	}
	
	public void run() throws RunException {
		
		// TODO Auto-generated method stub
		if(getParentProcess() == null)
			throw new RunException(
					"A parent process must be set in order to run "
					+ getClass().getCanonicalName());
		
		Node n = (Node) getParentProcess().getReferencedNodes().get(
				Engine.getDefault().getSimulationRandom().nextInt(
						getParentProcess().getReferencedNodes().size()))
				.createInstance(Engine.getDefault().generateKey());
		
		Engine.getDefault().getNodes().add(n);
		associatedNode = n;
		System.out.println("BIRTH : " + associatedNode);
		JXTAEdgePeer app = (JXTAEdgePeer) n;
		app.setConnected(true);
		
		app.keyspace = Engine.getDefault().getKeySpaceSize();
		app.JXTAID =Engine.getDefault().generateKey();
		System.out.println("k " + app.keyspace + " id "+ app.JXTAID);
		//app.ciao();
//		for(int i = 0; i <app.getResourcesNode(); i++)
//			try {
//				app.chordResources.add(new ChordResourceType(Engine.getDefault().generateResourceKey()));
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	
//	}
	}

}
