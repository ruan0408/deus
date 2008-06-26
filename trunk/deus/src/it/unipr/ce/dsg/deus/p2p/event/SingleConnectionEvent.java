package it.unipr.ce.dsg.deus.p2p.event;

import it.unipr.ce.dsg.deus.core.Engine;
import it.unipr.ce.dsg.deus.core.Event;
import it.unipr.ce.dsg.deus.core.InvalidParamsException;
import it.unipr.ce.dsg.deus.core.Node;
import it.unipr.ce.dsg.deus.core.Process;
import it.unipr.ce.dsg.deus.core.RunException;
import it.unipr.ce.dsg.deus.p2p.node.Peer;

import java.util.Properties;

public class SingleConnectionEvent extends Event {
	private static final String IS_BIDIRECTIONAL = "isBidirectional";
	
	private boolean isBidirectional = false;
	private Peer initiator = null;
	private Peer target = null;
	
	public SingleConnectionEvent(String id, Properties params, Process parentProcess)
			throws InvalidParamsException {
		super(id, params, parentProcess);
		initialize();
	}

	@Override
	public void initialize() throws InvalidParamsException {
		if (params.containsKey(IS_BIDIRECTIONAL))
			isBidirectional = Boolean.parseBoolean(params.getProperty(IS_BIDIRECTIONAL)); 
	}

	public void setNodesToConnect(Peer initiator, Peer target) {
		this.initiator = initiator;
		this.target = target;
	}

	public Object clone() {
		SingleConnectionEvent clone = (SingleConnectionEvent) super.clone();
		clone.target = null;
		return clone;
	}

	@Override
	public void run() throws RunException {
		if (target == null) {
			if (Engine.getDefault().getNodes().size() > 1) {
				//System.out.println("target is null and nodes are " + Engine.getDefault().getNodes().size());			
				do {
					int randomInt = Engine.getDefault().getSimulationRandom().nextInt(
							Engine.getDefault().getNodes().size());
					//System.out.println("this id " + this.initiator.getId() + "\t randomInt = " + randomInt);
					Node n = Engine.getDefault().getNodes().get(randomInt);
					if (!(n instanceof Peer)) {
						target = null;
						continue;
					}
					target = (Peer) n; 
				} while ( (target == null) || target.getId().equals(initiator.getId()));
			}
			else
				return;
		}
		initiator.addNeighbor(target);
		initiator.setReachable(true);
		if (isBidirectional)
			target.addNeighbor(initiator);
	}

}
