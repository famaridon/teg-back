package com.code.some.games.tegback.games.teg.api;

import com.code.some.games.tegback.games.teg.impl.beans.TurnPlayer;

public interface Ship {
	
	void travel(Planet planet);
	
	void progress(PlanetType type);
	
	boolean canHarvestEnergy();
	
	boolean canHarvestCulture();
	
	Planet getPlanet();
}
