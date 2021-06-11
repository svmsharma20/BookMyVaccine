import java.util.ArrayList;

public class SessionWrapper {
  ArrayList<Session> sessions;

  public SessionWrapper() {
  }

  public SessionWrapper(ArrayList<Session> sessions) {
    this.sessions = sessions;
  }

  public ArrayList<Session> getSessions() {
    return sessions;
  }

  public void setSessions(ArrayList<Session> sessions) {
    this.sessions = sessions;
  }
}
