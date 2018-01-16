package br.com.caelum.livraria.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class LogPhaseListener implements javax.faces.event.PhaseListener {

	private static final long serialVersionUID = 1L;

	@Override
	public void afterPhase(PhaseEvent event) {	}

	@Override
	public void beforePhase(PhaseEvent event) {
		System.out.println("FASE: " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
