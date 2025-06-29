//http client - request send to server 
//req - http request class
//client - http client class

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class http {
    public static void main(String[] args) throws IOExpection, InterruptedException{
      var url = " ";
      //http request
      var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

      var client = HttpClient.newBuilder().build();

      var response = client.send(request,HttpResponse.BodyHandlers.ofString());

      System.out.println(response.body());
    }
}
