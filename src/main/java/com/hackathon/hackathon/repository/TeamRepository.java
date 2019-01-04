package com.hackathon.hackathon.repository;

import com.hackathon.hackathon.model.Participant;
import com.hackathon.hackathon.model.Team;
import org.springframework.stereotype.Repository;

import javax.servlet.http.Part;
import java.util.*;

@Repository
public class TeamRepository {

    private static Map<Long, Team> teams = new HashMap<Long, Team>();
    private Long index = 2L;



    static {
        List<String> languages = new ArrayList<>();
        Collections.addAll(languages, "C", "JAVA");

        List<String> submissions = new ArrayList<>();
        Collections.addAll(submissions, "1 Submission", "2 Submission", "3 Submission");

        Map<Long, Participant> participants = new HashMap<Long, Participant>();
        Participant p1 = new Participant("p1", "p1@gmail.com", "",languages, submissions );
        participants.put(1L, p1);
        Participant p2 = new Participant("p2", "p2@gmail.com", "", languages,submissions );
        participants.put(2L, p2);

        Team t1 = new Team("Team1", new ArrayList<Participant>(participants.values()), languages, submissions );
         teams.put(1L, t1);
        Team t2 = new Team("Team2", new ArrayList<Participant>(participants.values()), languages, submissions );
        teams.put(2L, t2);
    }

    public List<Team> getTeams() {
        return new ArrayList<Team>(teams.values());
    }

    public Team getTeam(Long id) {
        return teams.get(id);
    }


    public String updateTeam(Long id, Team team) {
        String message = "";
        if( team.getLanguages().size() > 2) {
            message = "Maximum 2 languages are allowed in a Team";
        } else if ( team.getSubmissions().size() > 3) {
            message = "Maximum 3 submissions are allowed in a Team";
        }  else if ( team.getTeamParticipants().size() > 3) {
            message = "Maximum 3 Participants are allowed in a Team";
        } else {
            teams.put(id, team);
            message = "Successfully updated Team!!";
        }
        return message;
    }

    public String createTeam(Team team) {
        String message = "";
        if( team.getLanguages().size() > 2) {
            message = "Maximum 2 languages are allowed in a Team";
        } else if ( team.getSubmissions().size() > 3) {
            message = "Maximum 3 submissions are allowed in a Team";
        }  else if ( team.getTeamParticipants().size() > 3) {
            message = "Maximum 3 Participants are allowed in a Team";
        } else {
            index++;
            teams.put(index, team);
            message = "Successfully created Team!!";
        }
        return message;
    }

    public String createParticipantInTeam(Long id, Participant participant) {
        Team team = teams.get(id);
        String message = "";
         if ( team.getTeamParticipants().size() >= 3) {
            message = "Maximum 3 Participants are allowed in a Team";
        } else {
             team.getTeamParticipants().add(participant);
            teams.put(id, team);
            message = "Successfully added participant in Team!!";
        }
        return message;
    }


    public Team deleteParticipantInTeam(Long teamId, Long participantId ) {
        Team team = teams.get(teamId);
        team.getTeamParticipants().remove(participantId);
        teams.put(teamId, team);
        return team;
    }

    public Team deleteTeam(Long id) {
        return teams.remove(id);
    }
}
