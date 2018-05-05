package example.angularspring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import example.angularspring.dto.Profile;
import example.angularspring.dto.ResponseMessage;
import example.angularspring.exception.ValidationErrorException;
import example.angularspring.service.ProfileService;
import example.angularspring.service.SenderService;
import example.angularspring.util.Constant;

/**
 * Controller for profile actions.
 */
@Controller
public class ProfileController {  
	
	@Autowired
    private ProfileService profileService;
	
	@Autowired
    private SenderService senderService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Profile login(@RequestBody Profile profile, HttpServletRequest request, HttpServletResponse response) {
    	System.out.println("Begin login -->"+profile);
    	if(profile.getLogin() == null || profile.getLogin().equals("")){
    		throw new IllegalArgumentException("LOGIN_REQUIRED");
    	}else if(profile.getPassword() == null || profile.getPassword().equals("")){
    		throw new IllegalArgumentException("PASSWORD_REQUIRED");
    	}
    	
    	Profile currentprofile = profileService.getProfileByLogin(profile.getLogin());
    	if(null == currentprofile){
    		throw new IllegalArgumentException("LOGIN_NOT_FOUND");
    	}else if(!currentprofile.getPassword().equals(profile.getPassword())){
    		throw new IllegalArgumentException("PASSWORD_FAILED");
    	}else{
    		String token = profileService.hash256Profile(currentprofile);
    		String key = profileService.getKeyMap();
    		currentprofile.setToken(token);
    		currentprofile.setGooglekey(key);
    		profileService.updateProfile(currentprofile);
        	System.out.println("End login -->"+profile);
    		return currentprofile;
    	}
    }
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseBody
    public ResponseMessage logout(@RequestHeader(value="Authorization") String authorization) {
    	System.out.println("Begin logout -->"+authorization);
    	String token = authorization.replaceAll("Basic", "");
    	Profile profile = profileService.getProfileByToken(token);
    	if(null == profile){
    		throw new IllegalArgumentException("ACTION_FAILED");
    	}
    	System.out.println("End logout -->");
        return new ResponseMessage(ResponseMessage.Type.success, "LOGOUT_SUCCES",Constant.getLabels().get("LOGOUT_SUCCES").toString());
    }
	
	@RequestMapping(value = "/getProfile", method = RequestMethod.GET)
    @ResponseBody
    public Profile getProfile(@RequestHeader(value="Authorization") String authorization) {
    	System.out.println("Begin login -->"+authorization);
    	String token = authorization.replaceAll("Basic", "");
    	Profile profile = profileService.getProfileByToken(token);
    	if(null == profile){
    		throw new IllegalArgumentException("ACTION_FAILED");
    	}
    	return profile;
    }
	
	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage updateProfile(@RequestHeader(value="Authorization") String authorization, @RequestBody Profile profile) {
    	System.out.println("Begin login -->"+profile);
    	String token = authorization.replaceAll("Basic", "");
    	Profile profil = profileService.getProfileByToken(token);
    	if(null == profil){
    		throw new IllegalArgumentException("ACTION_FAILED");
    	}
    	profileService.updateProfile(profile);
    	if(profile.getPassword() == null || profile.getPassword().equals("")){
    		throw new IllegalArgumentException("PASSWORD_REQUIRED");
    	}
    	return new ResponseMessage(ResponseMessage.Type.success, null,null);
    }
	
	@RequestMapping(value = "/initPassword", method = RequestMethod.POST)
    @ResponseBody
    public ResponseMessage initPassword(@RequestBody Profile profile) {
    	System.out.println("Begin initPassword -->"+profile);
    	if(null == profile.getMail()){
    		throw new IllegalArgumentException("MAIL_REQUIRED");
    	}
    	Profile profiletmp = profileService.getProfileByMail(profile.getMail());
    	if(null == profiletmp){
    		throw new IllegalArgumentException("MAIL_NOT_FOUND");
    	}
    	String from = "contact@kriauto.ma";
    	String to = profiletmp.getMail();
    	String subject = "Identifiants de connexion";
    	String message = "Bonjour "+profiletmp.getName()+", <br/><br/> Veuillez trouver vos identifiants de connexion : <br/><br/> - login : "+profiletmp.getLogin()+" <br/> - Mot de passe : "+profiletmp.getPassword()+" <br/><br/> l'�quipe KriAuto.";
    	senderService.sendMail(from, to, subject, message);
    	return new ResponseMessage(ResponseMessage.Type.success, "PASSWORD_SEND",Constant.getLabels().get("PASSWORD_SEND").toString());
    }

}
