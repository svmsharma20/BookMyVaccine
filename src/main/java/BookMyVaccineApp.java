import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BookMyVaccineApp {

  public static void main(String[] args) throws IOException, InterruptedException {
    String url = new URLProvider().getURL();
//    System.out.println(url);
    var client = HttpClient.newHttpClient();

    var request = HttpRequest.newBuilder(
        URI.create(url)).header("accept", "application/json")
        .build();

    var response = client.send(request, BodyHandlers.ofString());
//    System.out.println(response.body());
    CenterWrapper centers = new Gson().fromJson(response.body(), CenterWrapper.class);

//    System.out.println(centers.centers);
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
    for (Center center: centers.centers) {
      if(center.isAFreeCenter()) {
        for (Session session: center.getSession()) {
          LocalDate date = LocalDate.parse(session.getDate(), dateTimeFormatter);
          if(session.getMin_age_limit()==18 && date.isEqual(LocalDate.now())){
            System.out.println(center.getName());
          }
        }

      }
    }

  }


}
