package edu.gmu.swe681.service;

import javax.ejb.Local;

import edu.gmu.swe681.domain.Player;

@Local
public interface PlayerServiceLocal {
	
	public Player createNewPlayer(Player player);

}
