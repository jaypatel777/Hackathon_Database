/**
* The Team class gets the team name, team participants, 
* language and submission of the teams.
*
* @author  Jay Patel
* @version 1.0 
*/
package com.hackathon.hackathon.model;

import java.util.List;

public class Team {

    private String teamName;
    private List<Participant> teamParticipants;
    private List<String> languages;
    private List<String> submissions;

    public Team(String teamName, List<Participant> teamParticipants, List<String> languages, List<String> submissions) {
        this.teamName = teamName;
        this.teamParticipants = teamParticipants;
        this.languages = languages;
        this.submissions = submissions;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Participant> getTeamParticipants() {
        return teamParticipants;
    }

    public void setTeamParticipants(List<Participant> teamParticipants) {
        this.teamParticipants = teamParticipants;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(List<String> submissions) {
        this.submissions = submissions;
    }


}
