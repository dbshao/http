package Resquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Requests {

    public String getResponse(String strURL){
        try {
            URL url=new URL(strURL);
            HttpURLConnection con;
            con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) ...");
//            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            String responseBody = readResponseBody(con.getInputStream());
            return responseBody;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    private String readResponseBody(InputStream inputStream) throws IOException {

        BufferedReader in = new BufferedReader(
                new InputStreamReader(inputStream));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString();
    }

    public static String getHttpResponse(String url_str) {

        URL url = null;
        HttpURLConnection connection = null;
        String body = null;
        try {
            url = new URL(url_str);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection
                    .setRequestProperty(
                            "User-Agent",
                            "Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/30.0.1599.101 Safari/537.36");
            connection.connect();
            InputStream in = (InputStream) connection.getInputStream();
            body = org.apache.commons.io.IOUtils.toString(in,  "UTF-8");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }

}
