package ma.kriauto.rest.dao;

import java.util.List;

import ma.kriauto.rest.domain.Item;
import ma.kriauto.rest.domain.Notification;

public interface NotificationDao {
	public void addNotification(Notification notification);
	public List<Notification> getNotificationByDevice(Integer deviceid, String date, String token);
	public List<Notification> getPushTokenByProfile(String login);
	public List<Item> getDatesNotificationByDevice(Integer deviceid);

}
