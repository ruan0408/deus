package it.unipr.ce.dsg.deus.example.life;

import java.util.Properties;

import it.unipr.ce.dsg.deus.core.InvalidParamsException;
import it.unipr.ce.dsg.deus.core.NodeEvent;
import it.unipr.ce.dsg.deus.core.Process;
import it.unipr.ce.dsg.deus.core.RunException;

public class LifeUpdateWorldEvent extends NodeEvent {

	public LifeUpdateWorldEvent(String id, Properties params,
			Process parentProcess) throws InvalidParamsException {
		super(id, params, parentProcess);
	}

	public void run() throws RunException {
		((LifeRegion)this.associatedNode).updateRegion(false);
		
		try {
			Thread.currentThread();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
