package example.angularspring.dto;

public class Car {
	
	private Integer id;
	private Integer agencyid;
	private String imei;
	private String simnumber;
	private String immatriculation;
	private String vin;
	private String mark;
	private String model;
	private String color;
	private String photo;
	private Integer status;
	private Integer deviceid;
	private Integer maxspeed;
	private Integer mileage;
	private Double consumption;
	private String fuel;
	private Double latitude1;
	private Double longitude1;
	private Double latitude2;
	private Double longitude2;
	private Double latitude3;
	private Double longitude3;
	private Double latitude4;
	private Double longitude4;
	private Double latitude5;
	private Double longitude5;
	private Double latitude6;
	private Double longitude6;
	private String colorcode;
	private boolean isgeofence;
	private boolean isnotifgeofence;
	private boolean isnotifdefaultgeofence;
	
	
	public Car() {
		super();
	}
	

	public Car(String immatriculation, Integer deviceid) {
		super();
		this.immatriculation = immatriculation;
		this.deviceid = deviceid;
	}

	public Car(Integer id, Integer agencyid, String imei, String simnumber,
			String immatriculation, String vin, String mark, String model,
			String color, String photo, Integer status, Integer deviceid,
			Integer maxspeed, Integer mileage,Double consumption, String fuel, Double latitude1,
			Double longitude1, Double latitude2, Double longitude2,
			Double latitude3, Double longitude3, Double latitude4,
			Double longitude4, Double latitude5, Double longitude5,
			Double latitude6, Double longitude6, String colorcode,
			boolean isgeofence, boolean isnotifgeofence,
			boolean isnotifdefaultgeofence) {
		super();
		this.id = id;
		this.agencyid = agencyid;
		this.imei = imei;
		this.simnumber = simnumber;
		this.immatriculation = immatriculation;
		this.vin = vin;
		this.mark = mark;
		this.model = model;
		this.color = color;
		this.photo = photo;
		this.status = status;
		this.deviceid = deviceid;
		this.maxspeed = maxspeed;
		this.mileage = mileage;
		this.consumption = consumption;
		this.fuel = fuel;
		this.latitude1 = latitude1;
		this.longitude1 = longitude1;
		this.latitude2 = latitude2;
		this.longitude2 = longitude2;
		this.latitude3 = latitude3;
		this.longitude3 = longitude3;
		this.latitude4 = latitude4;
		this.longitude4 = longitude4;
		this.latitude5 = latitude5;
		this.longitude5 = longitude5;
		this.latitude6 = latitude6;
		this.longitude6 = longitude6;
		this.colorcode = colorcode;
		this.isgeofence = isgeofence;
		this.isnotifgeofence = isnotifgeofence;
		this.isnotifdefaultgeofence = isnotifdefaultgeofence;
	}


	public boolean isIsgeofence() {
		return isgeofence;
	}


	public void setIsgeofence(boolean isgeofence) {
		this.isgeofence = isgeofence;
	}


	public boolean isIsnotifgeofence() {
		return isnotifgeofence;
	}


	public void setIsnotifgeofence(boolean isnotifgeofence) {
		this.isnotifgeofence = isnotifgeofence;
	}


	public boolean isIsnotifdefaultgeofence() {
		return isnotifdefaultgeofence;
	}


	public void setIsnotifdefaultgeofence(boolean isnotifdefaultgeofence) {
		this.isnotifdefaultgeofence = isnotifdefaultgeofence;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getAgencyid() {
		return agencyid;
	}


	public void setAgencyid(Integer agencyid) {
		this.agencyid = agencyid;
	}


	public String getImei() {
		return imei;
	}


	public void setImei(String imei) {
		this.imei = imei;
	}


	public String getSimnumber() {
		return simnumber;
	}


	public void setSimnumber(String simnumber) {
		this.simnumber = simnumber;
	}


	public String getImmatriculation() {
		return immatriculation;
	}


	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	public String getVin() {
		return vin;
	}


	public void setVin(String vin) {
		this.vin = vin;
	}


	public String getMark() {
		return mark;
	}


	public void setMark(String mark) {
		this.mark = mark;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getPhoto() {
		return photo;
	}


	public void setPhoto(String photo) {
		this.photo = photo;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Integer getDeviceid() {
		return deviceid;
	}


	public void setDeviceid(Integer deviceid) {
		this.deviceid = deviceid;
	}


	public Integer getMaxspeed() {
		return maxspeed;
	}


	public void setMaxspeed(Integer maxspeed) {
		this.maxspeed = maxspeed;
	}


	public Integer getMileage() {
		return mileage;
	}


	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	
	
	public Double getConsumption() {
		return consumption;
	}


	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public Double getLatitude1() {
		return latitude1;
	}


	public void setLatitude1(Double latitude1) {
		this.latitude1 = latitude1;
	}


	public Double getLongitude1() {
		return longitude1;
	}


	public void setLongitude1(Double longitude1) {
		this.longitude1 = longitude1;
	}


	public Double getLatitude2() {
		return latitude2;
	}


	public void setLatitude2(Double latitude2) {
		this.latitude2 = latitude2;
	}


	public Double getLongitude2() {
		return longitude2;
	}


	public void setLongitude2(Double longitude2) {
		this.longitude2 = longitude2;
	}


	public Double getLatitude3() {
		return latitude3;
	}


	public void setLatitude3(Double latitude3) {
		this.latitude3 = latitude3;
	}


	public Double getLongitude3() {
		return longitude3;
	}


	public void setLongitude3(Double longitude3) {
		this.longitude3 = longitude3;
	}


	public Double getLatitude4() {
		return latitude4;
	}


	public void setLatitude4(Double latitude4) {
		this.latitude4 = latitude4;
	}


	public Double getLongitude4() {
		return longitude4;
	}


	public void setLongitude4(Double longitude4) {
		this.longitude4 = longitude4;
	}


	public Double getLatitude5() {
		return latitude5;
	}


	public void setLatitude5(Double latitude5) {
		this.latitude5 = latitude5;
	}


	public Double getLongitude5() {
		return longitude5;
	}


	public void setLongitude5(Double longitude5) {
		this.longitude5 = longitude5;
	}


	public Double getLatitude6() {
		return latitude6;
	}


	public void setLatitude6(Double latitude6) {
		this.latitude6 = latitude6;
	}


	public Double getLongitude6() {
		return longitude6;
	}


	public void setLongitude6(Double longitude6) {
		this.longitude6 = longitude6;
	}


	public String getColorcode() {
		return colorcode;
	}


	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", agencyid=" + agencyid + ", imei=" + imei
				+ ", simnumber=" + simnumber + ", immatriculation="
				+ immatriculation + ", vin=" + vin + ", mark=" + mark
				+ ", model=" + model + ", color=" + color + ", photo=" + photo
				+ ", status=" + status + ", deviceid=" + deviceid
				+ ", maxspeed=" + maxspeed + ", mileage=" + mileage + ", fuel="
				+ fuel + ", latitude1=" + latitude1 + ", longitude1="
				+ longitude1 + ", latitude2=" + latitude2 + ", longitude2="
				+ longitude2 + ", latitude3=" + latitude3 + ", longitude3="
				+ longitude3 + ", latitude4=" + latitude4 + ", longitude4="
				+ longitude4 + ", latitude5=" + latitude5 + ", longitude5="
				+ longitude5 + ", latitude6=" + latitude6 + ", longitude6="
				+ longitude6 + ", colorcode=" + colorcode + ", isgeofence="
				+ isgeofence + ", isnotifgeofence=" + isnotifgeofence
				+ ", isnotifdefaultgeofence=" + isnotifdefaultgeofence + "]";
	}

}
