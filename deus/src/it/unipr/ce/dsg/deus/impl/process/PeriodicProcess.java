package it.unipr.ce.dsg.deus.impl.process;

import java.util.ArrayList;
import java.util.Properties;

import it.unipr.ce.dsg.deus.core.Event;
import it.unipr.ce.dsg.deus.core.InvalidParamsException;
import it.unipr.ce.dsg.deus.core.Node;
import it.unipr.ce.dsg.deus.core.Process;

/**
 * This class represents a generic periodic process. It accept one parameter
 * called "period" (float) that is used to generate the triggering time. Each
 * time the process receive a request for generating an new triggering time, it
 * will compute it by adding the period value to the current simulation virtual
 * time.
 * 
 * @author Matteo Agosti (agosti@ce.unipr.it)
 * @author Michele Amoretti (michele.amoretti@unipr.it)
 * 
 */
public class PeriodicProcess extends Process {
	private static final String PERIOD = "period";

	private float period = 0;

	public PeriodicProcess(String id, Properties params,
			ArrayList<Node> referencedNodes, ArrayList<Event> referencedEvents)
			throws InvalidParamsException {
		super(id, params, referencedNodes, referencedEvents);
		initialize();
	}

	@Override
	public float getNextTriggeringTime(float virtualTime) {
		return virtualTime + period;
	}

	@Override
	public void initialize() throws InvalidParamsException {
		if (params.getProperty(PERIOD) == null)
			throw new InvalidParamsException(PERIOD + " param is expected.");

		try {
			period = Float.parseFloat(params.getProperty(PERIOD));
		} catch (NumberFormatException ex) {
			throw new InvalidParamsException(PERIOD
					+ " must be a valid float value.");
		}

	}

}
