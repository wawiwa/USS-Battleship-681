#!/bin/bash

echo = About to fetch the changes on master and merging them into the current branch =

git branch

echo = Fetching from base =

git fetch base

echo = Merging the base/master into the current branch = 

git merge base/master --ff-only

echo = Process complete =