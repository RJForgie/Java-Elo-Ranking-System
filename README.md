# Personal Project - Elo Tables Tennis Ranking System

Work in progress

## The idea

Java implementation of the [Elo Ranking System](https://en.wikipedia.org/wiki/Elo_rating_system) for table tennis players.

Project has a dual purpose; to practice Java concepts and to decide once and for all who the best table tennis player in my class is.

I plan to record results of games played at CodeClan and use the program to decide the seeding for a knockout tournament.

## Functionality

* Players can be added to a playerPool, sorting this playerPool by player rating produces the ranking order.
* A game takes in 2 players and their respective scores.
* The ranking calculator takes in a game and uses the Elo formula to decide new ratings based on the score and original player ratings before the game.
* Once calculated, the player ratings are updated.
* The runner file simulates 1000 games to show the progression of the rating system.
* The playerPool can be logged out as a table to facilitate easy viewing (see below).

![screenshots](https://github.com/RJForgie/Java-Elo-Ranking-System/blob/master/ranking_table_screenshot.png)

## Future extensions

Develop and an Android user interface which shows current player rankings and allows logging of new game results.
