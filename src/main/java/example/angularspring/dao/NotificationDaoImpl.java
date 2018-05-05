package example.angularspring.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import example.angularspring.dto.Notification;

@Repository
@Qualifier("notificationDao")
public class NotificationDaoImpl implements NotificationDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void addNotification(Notification notification) {
		// TODO Auto-generated method stub
		System.out.println("addNotification ");
	    jdbcTemplate.update("INSERT INTO messages(deviceid, texte) VALUES (?,?)", new Object[] {notification.getDeviceid(),notification.getTexte()});
		
	}

	@Override
	public List<Notification> getNotificationByDevice(Integer deviceid) {
		System.out.println("getNotificationByDevice " + deviceid);
		GregorianCalendar date = new GregorianCalendar();
		date.add(Calendar.MONTH, -1);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		String day = formater.format(date.getTime());
		List<Notification> notifications = new ArrayList<Notification>();
		notifications = jdbcTemplate.query(" select to_char(creationdate , 'YYYY-MM-DD HH24:MI:SS') AS creationdate, texte "
						+ "  from  messages" 
				        + "  where deviceid = ? "
						+ "  and   to_char(creationdate,'YYYY-MM-DD') >= '"
						+ day + "'" + " order by creationdate desc",new Object[] { deviceid }, new BeanPropertyRowMapper(Notification.class));
		return notifications;
	}

}
