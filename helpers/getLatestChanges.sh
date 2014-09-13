#!/bin/bash
#
# To use this script execute it from the root Directory of USS-Battleship-681
#
# Example:   sh ./helpers/getLatestChanges.sh
#
#

echo = About to fetch the changes on master and merging them into the current branch =

git branch

echo = Fetching from base =

git fetch base

echo = Merging the base/master into the current branch = 

git merge base/master --ff-only

echo = Process complete =
