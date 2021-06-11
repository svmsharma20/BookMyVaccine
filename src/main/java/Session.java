import java.util.List;

public class Session {
  String sessionId;
  String date;
  int available_capacity;
  int min_age_limit;
  List<String> slots;
  int available_capacity_dose1;
  int available_capacity_dose2;

  public Session() {
  }

  public Session(String sessionId, String date, int available_capacity, int min_age_limit,
      List<String> slots, int available_capacity_dose1, int available_capacity_dose2) {
    this.sessionId = sessionId;
    this.date = date;
    this.available_capacity = available_capacity;
    this.min_age_limit = min_age_limit;
    this.slots = slots;
    this.available_capacity_dose1 = available_capacity_dose1;
    this.available_capacity_dose2 = available_capacity_dose2;
  }

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getAvailable_capacity() {
    return available_capacity;
  }

  public void setAvailable_capacity(int available_capacity) {
    this.available_capacity = available_capacity;
  }

  public int getMin_age_limit() {
    return min_age_limit;
  }

  public void setMin_age_limit(int min_age_limit) {
    this.min_age_limit = min_age_limit;
  }

  public List<String> getSlots() {
    return slots;
  }

  public void setSlots(List<String> slots) {
    this.slots = slots;
  }

  public int getAvailable_capacity_dose1() {
    return available_capacity_dose1;
  }

  public void setAvailable_capacity_dose1(int available_capacity_dose1) {
    this.available_capacity_dose1 = available_capacity_dose1;
  }

  public int getAvailable_capacity_dose2() {
    return available_capacity_dose2;
  }

  public void setAvailable_capacity_dose2(int available_capacity_dose2) {
    this.available_capacity_dose2 = available_capacity_dose2;
  }

  @Override
  public String toString() {
    return "Session{" +
        "date='" + date + '\'' +
        ", available_capacity=" + available_capacity +
        ", min_age_limit=" + min_age_limit +
        ", available_capacity_dose1=" + available_capacity_dose1 +
        ", available_capacity_dose2=" + available_capacity_dose2 +
        '}';
  }
}
