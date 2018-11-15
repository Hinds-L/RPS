package edu.cnm.deepdive.rps.model;

import edu.cnm.deepdive.rps.model.Location;
import java.util.Random;

public interface Neighborhood {

  Location[] neighbors();

  default Location randomNeighbor(Random rng){
    Location[] neighbors = this.neighbors();
    return neighbors[rng.nextInt(neighbors.length)];
  }


}
