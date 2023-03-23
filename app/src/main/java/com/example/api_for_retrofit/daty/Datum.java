package com.example.api_for_retrofit.daty;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {


    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("matchType")
    @Expose
    private String matchType;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("venue")
    @Expose
    private String venue;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("dateTimeGMT")
    @Expose
    private String dateTimeGMT;
    @SerializedName("teams")
    @Expose
    private List<String> teams;
    @SerializedName("teamInfo")
    @Expose
    private List<TeamInfo> teamInfo;
    @SerializedName("score")
    @Expose
    private List<Score> score;
    @SerializedName("series_id")
    @Expose
    private String seriesId;
    @SerializedName("fantasyEnabled")
    @Expose
    private Boolean fantasyEnabled;
    @SerializedName("bbbEnabled")
    @Expose
    private Boolean bbbEnabled;
    @SerializedName("hasSquad")
    @Expose
    private Boolean hasSquad;
    @SerializedName("matchStarted")
    @Expose
    private Boolean matchStarted;
    @SerializedName("matchEnded")
    @Expose
    private Boolean matchEnded;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateTimeGMT() {
        return dateTimeGMT;
    }

    public void setDateTimeGMT(String dateTimeGMT) {
        this.dateTimeGMT = dateTimeGMT;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public List<TeamInfo> getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(List<TeamInfo> teamInfo) {
        this.teamInfo = teamInfo;
    }

    public List<Score> getScore() {
        return score;
    }

    public void setScore(List<Score> score) {
        this.score = score;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public Boolean getFantasyEnabled() {
        return fantasyEnabled;
    }

    public void setFantasyEnabled(Boolean fantasyEnabled) {
        this.fantasyEnabled = fantasyEnabled;
    }

    public Boolean getBbbEnabled() {
        return bbbEnabled;
    }

    public void setBbbEnabled(Boolean bbbEnabled) {
        this.bbbEnabled = bbbEnabled;
    }

    public Boolean getHasSquad() {
        return hasSquad;
    }

    public void setHasSquad(Boolean hasSquad) {
        this.hasSquad = hasSquad;
    }

    public Boolean getMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(Boolean matchStarted) {
        this.matchStarted = matchStarted;
    }

    public Boolean getMatchEnded() {
        return matchEnded;
    }

    public void setMatchEnded(Boolean matchEnded) {
        this.matchEnded = matchEnded;
    }

}