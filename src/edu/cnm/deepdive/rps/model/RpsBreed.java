package edu.cnm.deepdive.rps.model;

import java.util.Comparator;

public enum RpsBreed  {
  ROCK,
  PAPER,
  SCISSORS;

  private static final int[][] DOMINANCE = {
      //ROCK, PAPER, SCISSORS
      { 0,      -1,       1}, //Rock
      { 1,       0,      -1}, //Paper
      {-1,       1,       0} //Scissors
  };

  public static final Comparator<RpsBreed> REFEREE = new Comparator<RpsBreed>() {
    @Override
    public int compare(RpsBreed rps1, RpsBreed rps2) {
      return DOMINANCE[rps1.ordinal()][rps2.ordinal()];
    }
  };

}
