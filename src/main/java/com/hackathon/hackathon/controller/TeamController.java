/**
* The TeamController class implements RESTful CRUD services
* of the teams.
*
* @author  Jay Patel
* @version 1.0 
*/
package com.hackathon.hackathon.controller;

import com.hackathon.hackathon.model.Participant;
import com.hackathon.hackathon.model.Team;
import com.hackathon.hackathon.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;


    @RequestMapping(value  = "/teams", method = RequestMethod.GET)
    public List<Team> getTeams() {
        return teamRepository.getTeams();
    }

    @RequestMapping(value  = "/teams/{id}", method = RequestMethod.GET)
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.getTeam(id);
    }

    @RequestMapping(value  = "/teams/{id}", method = RequestMethod.PUT)
    public String updateTeam(@PathVariable Long id, @RequestBody Team team) {
        return teamRepository.updateTeam(id, team);
    }

    @RequestMapping(value  = "/teams", method = RequestMethod.POST)
    public String createTeam(@RequestBody Team team) {
        return teamRepository.createTeam(team);
    }

    @RequestMapping(value  = "/teams/{id}", method = RequestMethod.POST)
    public String createParticipantInTeam(@PathVariable Long id, @RequestBody Participant participant) {
        return teamRepository.createParticipantInTeam(id, participant);
    }

    @RequestMapping(value  = "/teams/{id}", method = RequestMethod.DELETE)
    public Team deleteTeam(@PathVariable Long id) {
        return teamRepository.deleteTeam(id);
    }

    @RequestMapping(value  = "/teams/{teamid}/{participantid}", method = RequestMethod.DELETE)
    public Team deleteParticipantInTeam(@PathVariable Long teamid, @PathVariable Long participantid) {
        return teamRepository.deleteParticipantInTeam(teamid, participantid);
    }


}
