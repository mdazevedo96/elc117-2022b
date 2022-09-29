
public class TeamMate {
	private String userId;
	private String name;
	boolean online;

	public TeamMate() {
		userId = null;
		name = null;
		online = false;
	}
	
	public TeamMate(String userId, String name, boolean online) {
		userId = "01";
		name = "Igor";
		online = true;
		
	}
	
	public TeamMate(String userId, String name) {
		userId = "666";
		online = false;
	}
	
	public void setUserID(String userId) {
		this.userId = userId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setOnline(boolean online) {
		this.online = online;
	}
	
	public String getUserID() {
		return this.userId;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getOnline() {
		return this.online;
	}
	
}



