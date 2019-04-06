/* 
 * Travelguide - An open source project for the Android platform, gives the tourist attractions, restaurants and hotels to visit for a given location within the given  * given radius in miles. The app supports English and Spanish languages for users.
 * Application written in Java
 * Application uses Google Places API.
 * the supported language texts are generated with the help of google translator.
 */
package com.travelguide;

import java.util.ArrayList;
import android.util.Log;

public class tgxml {
	private ArrayList<String> name = new ArrayList<String>();
    private  ArrayList<String> address = new ArrayList<String>();
    private  ArrayList<String> rating = new ArrayList<String>();
    
    //***** getters  *****
    public ArrayList<String> getName() {
        return name;
    }
    public ArrayList<String> getAddress() {
        return address;
    }
    public ArrayList<String> getRating() {
        return rating;
    }
    
  //***** setters *****
    public void setName(String name) {
        this.name.add(name);
        Log.i("This is the name:", name);
    }
    public void setAddress(String address) {
        this.address.add(address);
        Log.i("This is the address:", address);
      
    }
    public void setRating(String rating) {
    	 int i = this.getName().size();
         if (this.getRating().size() == i)
         {
            //***** If rating size is equal to name size then we already added the default rating to this array element *****
            this.rating.set(i-1,rating);
         }
         else
         {
         	this.rating.add(i-1,rating);
         }
         
         Log.i("Rating Index", ""+i);
         Log.i("This is the rating:", rating);
       
    }

}
