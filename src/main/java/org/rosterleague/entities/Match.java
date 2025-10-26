package org.rosterleague.entities;

import java.io.Serializable;

public class Match implements Serializable {
    public String id;
    public String leagueId;
    public String team1Id;
    public String team2Id;
    public int scoreteam1;
    public int scoreteam2;

    public Match(String id, String leagueId, String team1Id, String team2Id, int scoreteam1, int scoreteam2) {
        this.id = id;
        this.leagueId = leagueId;
        this.team1Id = team1Id;
        this.team2Id = team2Id;
        this.scoreteam1 = scoreteam1;
        this.scoreteam2 = scoreteam2;
    }

    public String getId() {
        return id;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getTeam1Id() {
        return team1Id;
    }

    public String getTeam2Id() {
        return team2Id;
    }

    public int getScoreTeam1() {
        return scoreteam1;
    }

    public int getScoreTeam2() {
        return scoreteam2;
    }

    public String toString() {
        return id+" "+team1Id+ " "+scoreteam1+ " - "+ scoreteam2+" "+team2Id;
    }
}