package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        renderText("Welcome to piTunes");
    }
    
    public static void getNextTrack() {
    	Random randomGenerator = new Random();
    	
    	List<String> searches = new ArrayList<String>();
    	searches.add("dubstep");
    	searches.add("dnb");
    	searches.add("trance");
    	searches.add("beefy");
    	searches.add("hiphop");
    	searches.add("rave");
    	searches.add("oldskool");
    	searches.add("gabba");
    	searches.add("swing");
    	searches.add("pop");
    	searches.add("grime");
    	searches.add("jungle");
    	searches.add("crap");
    	searches.add("polka");
    	
    	List<String> messages = new ArrayList<String>();
    	messages.add("7 months on remand");
    	messages.add("this ones for my mum");
    	messages.add("this is genos favourite");
    	messages.add("pete raved to this one");
    	messages.add("rob lost his cherry to this");
    	messages.add("I HATE this one");
    	messages.add("any new jungle in?");
    	messages.add("hackday rulez!");
    	messages.add("Janusz headbangs to this!");
    	messages.add("this one is for YOUR mum!");
    	messages.add("this is better than the share price!");
    	
    	List<String> users = new ArrayList<String>();
    	users.add("geno");
    	users.add("rob");
    	users.add("peter");
    	users.add("nacho");
    	users.add("janusz");
    	users.add("matt");
    	users.add("andy");
    	users.add("russ");
    	users.add("jet");
    	users.add("rachel");
    	users.add("francesco");
    	    	
    	int index = randomGenerator.nextInt(searches.size());
    	
    	TrackRequest req = new TrackRequest();

    	req.search = searches.get(index);
    	
    	index = randomGenerator.nextInt(messages.size());
    	req.message = messages.get(index);
    	
    	index = randomGenerator.nextInt(users.size());
    	req.username = users.get(index);
    	
    	renderJSON(req);
    }

}