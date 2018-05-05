package test;

public class CalculateDistance {
	
	 public static double distance(double lat1, double lon1, double lat2, double lon2, char unit) {
	      double theta = lon1 - lon2;
	      double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
	      dist = Math.acos(dist);
	      dist = rad2deg(dist);
	      dist = dist * 60 * 1.1515;
	      if (unit == 'K') {
	        dist = dist * 1.609344;
	      } else if (unit == 'N') {
	        dist = dist * 0.8684;
	        }
	      return (dist);
	    }

	    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	    /*::  This function converts decimal degrees to radians             :*/
	    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	 public static double deg2rad(double deg) {
	      return (deg * Math.PI / 180.0);
	    }

	    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	    /*::  This function converts radians to decimal degrees             :*/
	    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
	 public static double rad2deg(double rad) {
	      return (rad * 180.0 / Math.PI);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(distance(33.972861, -6.842999, 33.972585, -6.843181, 'M') + " Miles\n");
	    System.out.println(distance(33.972861, -6.842999, 33.972585, -6.843181, 'K') + " Kilometers\n");
	    System.out.println(distance(33.972861, -6.842999, 33.972585, -6.843181, 'N') + " Nautical Miles\n");

	}

}
