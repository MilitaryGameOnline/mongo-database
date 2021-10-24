package online.militarygame.mongodatabase.models;

public class DamageValue {
	private int targetId;
	private Double damage;

	public DamageValue() {
	}

	public DamageValue(int targetId, Double damage) {
		this.targetId = targetId;
		this.damage = damage;
	}

	public int getTargetId() {
		return targetId;
	}

	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}

	public Double getDamage() {
		return damage;
	}

	public void setDamage(Double damage) {
		this.damage = damage;
	}
}
