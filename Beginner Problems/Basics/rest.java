//speech to text
//api - application program interface - way for two programs to talk with each other - web service that can handle http requests - rest - represential state transfer
//http methods - get,put,post,patch
//json - request body through the documentation
//headers - include meta data for request - like credential
//http status code 

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandler;

public class rest {

  public static void main(String[] args) {
    
    HttpRequest postRequest = HttpRequest.newBuilder().uri(new URI("https://api.assemblyai.com/v2/transcript")).header("Authorization", 6ddd4ee5eb0a466e92958c58fffddf23).POST(BodyPublishers.ofString()).build();

    Gson gson = new Gson();
    gson.toJson(transcript);

    HttpClient httpclient = HttpClient.newHttpClient();

    HttpResonse<String> postResponse = httpClient.send(postRequest,BodyHandler.ofString());

    System.out.println(postResponse.body());
  }
  
}
