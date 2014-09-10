USS Battleship 681
=============

Game Instructions



The object of the game is to be the first one to sink your opponents ships.

Their will be two grids, the top one with be the target grid and the bottom one will be your ocean grid. The ocean grid is where you will
place your individual battle ships. 

http://www.hasbro.com/common/instruct/battleship.pdf


Key git commands:

// In order to use any git commands, you must be cd'ed into your repo directory. 

// retrieve the latest stuff from the master branch
git fetch base

// now that you fetched the latest stuff from master, you should merge it into your branch. For example develop
git merge base/master --ff-only


// to list your branches
git branch

// create new branch
git checkout -b <branchNameGoes>

// change branches
git checkout <name of branch you would like to change to>

// check the status of your changes
git status

// add changes
git add .

// commit changes
git commit -m 'commit message goes here'

// pushing your changes to your own online repo
git push origin <current branch name>

// To get your branch merged into the master branch.  Go to your githib, select the branch you just pushed.  And place a 
// pull request.



