package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Track[] tracks = new Track[10];
    private List<Vehicle> competitors = new ArrayList<>();

    public void addCompetititor(int competitorCount) {
        for (int i = 0; i < competitorCount; i++) {
            Vehicle vehicle = new Vehicle();
            //vehicle details will be populated when we learn to get user's input
            competitors.add(vehicle);
        }
    }
        public void displayCompetitor(){
            System.out.println("Welcome! Race is starting with:");
            for (int i = 0; i< competitors.size(); i++) {
                if (competitors.get(i) != null)
                    System.out.println(competitors.get(i).getName());

                }
            }
    public void addTrack(int index, Track track) {
        tracks[index] = track;
    }

    public void displayAvailableTracks() {
        System.out.println("Available tracks");
//        // for loop
//        for (int i = 0; i < tracks.length; i++) {
//            if (tracks[i] != null) {
//                System.out.println(tracks[i].getName());
//            }
//        }
//    }
        //enhanced for loop (for-each)
        for (Track track : tracks) {
            if (track != null) {
                System.out.println(track.getName());
            }
        }
    }
}