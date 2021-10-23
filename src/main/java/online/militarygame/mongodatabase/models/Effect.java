package online.militarygame.mongodatabase.models;

public class Effect {
	private Integer capturedBy;
	private Integer capturePointsRemaining;

	public Integer getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(Integer capturedBy) {
		this.capturedBy = capturedBy;
	}

	public Integer getCapturePointsRemaining() {
		return capturePointsRemaining;
	}

	public void setCapturePointsRemaining(Integer capturePointsRemaining) {
		this.capturePointsRemaining = capturePointsRemaining;
	}
}
