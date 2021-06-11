import java.util.ArrayList;

public class CenterWrapper {
ArrayList<Center> centers;

  public CenterWrapper(ArrayList<Center> centerList) {
    this.centers = centerList;
  }

  public CenterWrapper() {
  }

  public ArrayList<Center> getCenters() {
    return centers;
  }

  public void setCenters(ArrayList<Center> centers) {
    this.centers = centers;
  }
}
