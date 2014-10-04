package ejb.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import app.models.User_reg;
import ejb.dao.GameDaoLocal;
import ejb.dao.GameStatDaoLocal;
import ejb.dao.UserDaoLocal;
import ejb.domain.Game;
import ejb.domain.User;

@Stateless
public class UserServiceImpl implements UserServiceLocal {

	@EJB UserDaoLocal udl;
	@EJB GameStatDaoLocal gsdl;
	@EJB GameDaoLocal gdl;
	
	public User createNewUserInDb(User user) {
		return udl.create(user);
	}

	@Override
	public User findUserByEmail(User user) {
		return udl.findUserByEmail(user.getEmail());
	}

	@Override
	public void addWin(User user) {
		gsdl.increaseWins(user.getGameStat());
	}

	@Override
	public boolean doesUserExist(User user) {
		return this.doesUserExist(user.getEmail());
	}

	@Override
	public boolean checkPassword(User_reg user_reg) {
		return udl.findUserReg(user_reg);
	}

	@Override
	public boolean doesUserExist(String email) {
		User dbuser = udl.findUserByEmail(email);
		if (dbuser.getEmail() == null || dbuser.getEmail().isEmpty()) return false;
		return true;
	}

	@Override
	public Game createNewGame(User user1, User user2) {
		Game game = new Game();
		game.setGameCreated(new Date());
		game.setUser1(user1);
		game.setUser2(user2);
		return gdl.create(game);
	}

	
}
