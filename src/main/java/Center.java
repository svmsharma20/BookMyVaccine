import java.util.List;

public class Center {
  int center_id;
  String name;
  String address;
  String state_name;
  String district_name;
  String block_name;
  int pincode;
  int lat;
  String from;
  String to;
  String fee_type;
  List<Session> sessions;

  public Center(int center_id, String name, String address, String state_name,
      String district_name, String block_name, int pincode, int lat, String from, String to,
      String fee_type, List<Session> session) {
    this.center_id = center_id;
    this.name = name;
    this.address = address;
    this.state_name = state_name;
    this.district_name = district_name;
    this.block_name = block_name;
    this.pincode = pincode;
    this.lat = lat;
    this.from = from;
    this.to = to;
    this.fee_type = fee_type;
    this.sessions = session;
  }

  public Center() {
  }

  public int getCenter_id() {
    return center_id;
  }

  public void setCenter_id(int center_id) {
    this.center_id = center_id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getState_name() {
    return state_name;
  }

  public void setState_name(String state_name) {
    this.state_name = state_name;
  }

  public String getDistrict_name() {
    return district_name;
  }

  public void setDistrict_name(String district_name) {
    this.district_name = district_name;
  }

  public String getBlock_name() {
    return block_name;
  }

  public void setBlock_name(String block_name) {
    this.block_name = block_name;
  }

  public int getPincode() {
    return pincode;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }

  public int getLat() {
    return lat;
  }

  public void setLat(int lat) {
    this.lat = lat;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public String getFee_type() {
    return fee_type;
  }

  public void setFee_type(String fee_type) {
    this.fee_type = fee_type;
  }

  public List<Session> getSession() {
    return sessions;
  }

  public void setSession(List<Session> session) {
    this.sessions = session;
  }

  @Override
  public String toString() {
    return "Center{" +
        "name='" + name + '\'' +
        ", address='" + address + '\'' +
        ", pincode=" + pincode +
        ", fee_type='" + fee_type + '\'' +
        ", session=" + sessions +
        '}';
  }

  public boolean isAFreeCenter() {
    return fee_type.equals("Free");
  }
}
