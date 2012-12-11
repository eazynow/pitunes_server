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
    	TrackRequest req = new TrackRequest();
    	req.username = "erol";
    	req.search = "dubstep";
    	req.message = "7 months on remand";
    	
    	renderJSON(req);
    }

}