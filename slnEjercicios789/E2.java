package slnEjercicios789;

public class E2 {

	public static void main(String[] args) {
		int[][] ages= {{23,25,64,64},{2000,1997,1958,1959}};
		for (int i = 0; i < ages.length; i++) {
			for (int j = 0; j < ages[i].length; j++) {
				if (i==0) {
					System.out.println("The ages of the family are: "+ages[i][j]);
				}else {
					System.out.println("The id's family are: "+ages[i][j]);
				}
			}
		}
	}

}
