package com.hackathon.hackathon.repository;

import com.hackathon.hackathon.model.Participant;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ParticipantRepository {

    private static Map<Long, Participant> participants = new HashMap<Long, Participant>();
    private Long index = 2L;



    static {
        List<String> languages = new ArrayList<>();
        Collections.addAll(languages, "C", "JAVA");

        List<String> submissions = new ArrayList<>();
        Collections.addAll(submissions, "1 Submission", "2 Submission", "3 Submission");

        Participant p1 = new Participant("p1", "p1@gmail.com", "Team1",languages, submissions );
         participants.put(1L, p1);
        Participant p2 = new Participant("p2", "p2@gmail.com", "Team2", languages,submissions );
        participants.put(2L, p2);
    }

    public List<Participant> getParticipants() {
        return new ArrayList<Participant>(participants.values());
    }

    public Participant getParticipant(Long id) {
        return participants.get(id);
    }

    public String updateParticipant(Long id, Participant participant) {
        String message = "";
        if( participant.getLanguages().size() > 2) {
            message = "Maximum 2 languages are allowed";
        } else if ( participant.getSubmissions().size() > 3) {
            message = "Maximum 3 submissions are allowed";
        } else {
            participants.put(id, participant);
            message = "Successfully created!!";
        }
        return message;
    }

    public String createParticipant(Participant participant) {
        String message = "";
        if( participant.getLanguages().size() > 2) {
            message = "Maximum 2 languages are allowed";
        } else if ( participant.getSubmissions().size() > 3) {
            message = "Maximum 3 submissions are allowed";
        } else {
            index++;
            participants.put(index, participant);
            message = "Successfully created!!";
        }
        return message;
    }

    public Participant deleteParticipant(Long id) {
        return participants.remove(id);
    }
}
