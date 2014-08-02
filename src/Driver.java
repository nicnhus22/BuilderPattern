import java.util.ArrayList;
import java.util.List;


public class Driver {

	public static void main (String[] args){
		
		List<RubiksCube> rubiksList = new ArrayList<RubiksCube>();
		
		rubiksList.add(new RubiksCube.Builder()
				.withName("NicsCube")
				.withSize(RubiksCubeHelper.Size._7x7)
				.withType(RubiksCubeHelper.Type.REGULAR)
				.build());
		
		System.out.println(rubiksList.get(0));
	}
}
