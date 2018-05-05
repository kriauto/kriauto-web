package example.angularspring.util;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Constant {
	
	private static Map labels = new HashMap();

	public static Map getLabels() {
		return labels;
	}

	public static void setLabels(Map labels) {
		Constant.labels = labels;
	}

	@PostConstruct
	public void initConstants() {
		labels.put("LOGIN_REQUIRED", "Le login est obligatoire");
		labels.put("PASSWORD_REQUIRED", "le mot de passe est obligatoire.");
		labels.put("LOGIN_NOT_FOUND", "le login n'existe pas.");
		labels.put("PASSWORD_FAILED", "le mot de passe est incorrect.");
		labels.put("LOGIN_SUCCES", "Vous �tes bien connectes.");
		labels.put("MAIL_REQUIRED", "l'email est obligatoire.");
		labels.put("MAIL_NOT_FOUND", "l'email n'existe pas.");
		labels.put("PASSWORD_SEND", "le nouveau mot de passe vient d'�tre envoyer");
		labels.put("LOGOUT_SUCCES", "vous �tes d�connect�s");
		labels.put("STOP_CAR", "vous seriez notifi� par sms une fois la demande d'arr�t est trait�e");
		labels.put("START_CAR", "vous seriez notifi� par sms une fois la demande de d�marrage est trait�e");
		labels.put("GEOFENCE_SUCCES", "Les coordonn�es sont enregistr�es avec succ�s");
		labels.put("ACTION_FAILED", "cette action n'est pas autoris�e");

	}
}
