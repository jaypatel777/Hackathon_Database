/**
* The ParticipantController class implements RESTful CRUD services
* of the participants.
*
* @author  Jay Patel
* @version 1.0 
*/
package com.hackathon.hackathon.controller;


import com.hackathon.hackathon.model.Participant;
import com.hackathon.hackathon.repository.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParticipantController {

    @Autowired
    private ParticipantRepository participantRepository;


    @RequestMapping(value  = "/participants", method = RequestMethod.GET)
    public List<Participant> getParticipants() {
        return participantRepository.getParticipants();
    }

    @RequestMapping(value  = "/participants/{id}", method = RequestMethod.GET)
    public Participant getParticipant(@PathVariable Long id) {
        return participantRepository.getParticipant(id);
    }

    @RequestMapping(value  = "/participants/{id}", method = RequestMethod.PUT)
    public String updateParticipant(@PathVariable Long id, @RequestBody Participant participant) {
        return participantRepository.updateParticipant(id, participant);
    }

    @RequestMapping(value  = "/participants", method = RequestMethod.POST)
    public String createParticipant(@RequestBody Participant participant) {
        return participantRepository.createParticipant(participant);
    }

    @RequestMapping(value  = "/participants/{id}", method = RequestMethod.DELETE)
    public Participant deleteParticipant(@PathVariable Long id) {
        return participantRepository.deleteParticipant(id);
    }


}
