package udemyDSCourseByHolczerBalazs.arraysPrograms;

public class AnagramProblemTest {

    public static void main(String args[]){

        char[] s1 = {'f','l','u','s','t','e','r'};
        char[] s2 = {'r','e','s','t','f','u','l'};

        AnagramProblem ap = new AnagramProblem();
        System.out.println(ap.solve(s1,s2));

    }

}
