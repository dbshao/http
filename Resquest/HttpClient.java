package Resquest;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class HttpClient {

    public String getResponse(String strURL) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpGet request = new HttpGet(strURL);
        request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) ...");
        CloseableHttpResponse response = httpclient.execute(request);
        return null;
    }
}
