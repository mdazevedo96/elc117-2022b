import java.util.ArrayList;
public class ListOfTeamMates {

	public static void main(String[] args) {
		ArrayList<TeamMate> list = new ArrayList<TeamMate>();
		
		
		TeamMate t1 = new TeamMate();
		t1.setUserID("01");
		t1.setName("Igor");
		t1.setOnline(false);
		list.add(t1);
		
		TeamMate t2 = new TeamMate();
		t2.setUserID("02");
		t2.setName("Joao");
		t2.setOnline(true);
		list.add(t2);
		
		TeamMate t3 = new TeamMate();
		t3.setUserID("03");
		t3.setName("Paulo");
		t3.setOnline(true);
		
		list.remove(1);
		
		
		for (TeamMate item : list) {
			System.out.println(item.getName());
		}
		
		for (TeamMate item: list) {
			
				if (item.getOnline() == true) {
					System.out.println("Usuarios online:");
					System.out.println(item.getUserID()+'\n');
				}
		}
		
	}

}
