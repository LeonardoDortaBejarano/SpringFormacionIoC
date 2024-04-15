package com.Final.springMyApp;

public class GoldArmor implements DefenseArtifact {

	@Override
	public int getDefensivePoints() {
		return 50;
	}
	
	public String getDefenseArtifactName() {
		return "Golden Armor";
	}

}
