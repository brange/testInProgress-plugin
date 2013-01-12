package org.jenkinsci.plugins.testinprogress.events.build;

import org.jenkinsci.plugins.testinprogress.events.run.IRunTestEvent;

public class BuildTestEvent {
	private final String runId;
	private final IRunTestEvent testEvent;

	public BuildTestEvent(String runId, IRunTestEvent testEvent) {
		this.runId = runId;
		this.testEvent = testEvent;
	}

	public String getRunId() {
		return runId;
	}

	public IRunTestEvent getRunTestEvent() {
		return testEvent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((runId == null) ? 0 : runId.hashCode());
		result = prime * result
				+ ((testEvent == null) ? 0 : testEvent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuildTestEvent other = (BuildTestEvent) obj;
		if (runId == null) {
			if (other.runId != null)
				return false;
		} else if (!runId.equals(other.runId))
			return false;
		if (testEvent == null) {
			if (other.testEvent != null)
				return false;
		} else if (!testEvent.equals(other.testEvent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return runId + " - " + testEvent.toString();
	}

}
