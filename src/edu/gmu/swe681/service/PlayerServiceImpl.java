package edu.gmu.swe681.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.gmu.swe681.dao.PlayerDaoLocal;
import edu.gmu.swe681.domain.Player;

@Stateless
public class PlayerServiceImpl implements PlayerServiceLocal {

	@EJB PlayerDaoLocal pdl;
	
	public Player createNewPlayer(Player player) {
		return pdl.create(player);
	}
}
