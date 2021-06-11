public class URLProvider {

  public String getURL(){
      String url = Constants.URL;
      return String.format(url, Constants.PINCODE, Constants.DATE);
  }

}
