package l.ia.skywalker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.JSONArray;


public class GetURLContent {

    public static String getContentFromJson(String word) {
        URL url;
        try {
            // get URL content
            url = new URL("https://fr.wikipedia.org/w/api.php?format=json&action=query&prop=extracts&exintro=&explaintext=&titles=" + word);
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String inputLine;
            String result="";
      
            while ((inputLine = br.readLine()) != null) {
                //bw.write(inputLine);
                result+=inputLine;
            }
            
            JSONObject json;
            try {
                String str ="";
                json = new JSONObject(result);
                
                //JSONArray genreArray = (JSONArray) json.get("query");
        // get the first genre
                //JSONObject firstGenre = (JSONObject) genreArray.get(1);
                str = json.getJSONObject("query").getJSONObject("pages").toString();
                //getJSONObject("extract")
                //String str = json.getString("query");
                
                    HashMap<String, String> map = new HashMap<String, String>();
                    JSONObject jObject = new JSONObject(str);
                    Iterator<?> keys = jObject.keys();
                    String id ="";
                    while( keys.hasNext() ){
                        String key = (String)keys.next();
                        String value = jObject.getString(key); 
                        map.put(key, value);
                        id = key;
                    }
                    str = json.getJSONObject("query").getJSONObject("pages").getJSONObject(id).getString("extract");
                return str;
                //JSONObject object = new JSONObject(myJSONString);
                //String[] keys = JSONObject.getNames(json);
                
                
/*
                for (String key : keys){
                    Object value = json.get(key);
                    System.out.println(key);
                    // Determine type of value and do something with it...
                }
                */
                
                //return str;
                } catch (JSONException ex) {
                Logger.getLogger(GetURLContent.class.getName()).log(Level.SEVERE, null, ex);
            }            

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
