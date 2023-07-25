package Collection;

// SetOperations.java
import java.util.HashSet;
import java.util.Set;

public class HashSet_SetOperations {
	public static Set<String> union(Set<String> s1, Set<String> s2) {
		Set<String> un = new HashSet<String>(s1);
		un.addAll(s2);
        return un;
	}

	public static Set<String> intersection(Set<String> s1, Set<String> s2) {
		Set<String> un = new HashSet<String>(s1);
        un.retainAll(s2);
        return un;
	}

    // s1 - s2
	public static Set<String> asymmetricDifference(Set<String> s1, Set<String> s2) {
		Set<String> un = new HashSet<String>(s1);
        un.removeAll(s2);
		return un;
	}

    // (s1-s2) U (s2-s1)
    public static Set<String> symmetricDifference(Set<String> s1, Set<String> s2){
        Set<String> un = HashSet_SetOperations.union(s1, s2);
        Set<String> inter = HashSet_SetOperations.intersection(s1, s2);
        return HashSet_SetOperations.asymmetricDifference(un, inter);
    }


	public static void main(String args[]) {
		Set<String> footBallTeam = new HashSet<String>();
		footBallTeam.add("Frank");
		footBallTeam.add("Amjad");
		footBallTeam.add("Jim");

		Set<String> basketBallTeam = new HashSet<String>();
		basketBallTeam.add("David");
		basketBallTeam.add("Frank");
		basketBallTeam.add("Scott");

        System.out.println("=====================================");

		Set<String> unionSet = union(footBallTeam, basketBallTeam);
        System.out.println(unionSet);
        System.out.println("------------------------");

		Set<String> intersectionSet = intersection(footBallTeam, basketBallTeam);
        System.out.println(intersectionSet);
        System.out.println("------------------------");

		Set<String> differenceSets1 = asymmetricDifference(footBallTeam, basketBallTeam);
        System.out.println(differenceSets1);
        System.out.println("------------------------");

		Set<String> differenceSets2 = asymmetricDifference(basketBallTeam, footBallTeam);
        System.out.println(differenceSets2);
        System.out.println("------------------------");

		Set<String> symDifferenceSet = symmetricDifference(footBallTeam, basketBallTeam);
        System.out.println(symDifferenceSet);
        
        System.out.println("=====================================");
	} // end of main()
}// end of the class
