package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.pueo;
import views.html.aukahi;
import views.html.v6;
import views.html.about;


/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * @return The pueo page.
   */
  public static Result pueo() {
    return ok(pueo.render("Welcome to Page1."));
    
  }

/**
 * @return The aukahi page.
 */
public static Result aukahi() {
  return ok(aukahi.render("Welcome to Page1."));
  
}


/**
 * @return The Kamanu V6 page.
 */
public static Result v6() {
  return ok(v6.render("Welcome to Page1."));
  
}


/**
 * @return The about page.
 */
public static Result about() {
  return ok(about.render("Welcome to Page1."));
  
 }
}
