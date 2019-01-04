package com.hackathon.hackathon.model;

import java.util.Collections;
import java.util.List;

public class Participant {

    private String participantName;
    private String participantEmail;
    private String participantTeam;
    private List<String> languages;
    private List<String> submissions;


    public Participant(String participantName, String participantEmail, String participantTeam, List<String> languages, List<String> submissions) {
        this.participantName = participantName;
        this.participantEmail = participantEmail;
        this.participantTeam = participantTeam;
        this.languages = languages;
        this.submissions = submissions;

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


    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantEmail() {
        return participantEmail;
    }

    public void setParticipantEmail(String participantEmail) {
        this.participantEmail = participantEmail;
    }

    public String getParticipantTeam() {
        return participantTeam;
    }

    public void setParticipantTeam(String participantTeam) {
        this.participantTeam = participantTeam;
    }


}
