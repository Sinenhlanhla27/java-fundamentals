package Chapter5;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        String[] arStudents = new String[]{"John", "Kate", "Jessica", "Carol"};
        int[][] arTestMarks = new int[][]{{75,74,36},
                {85,69,74},{74,52,46},{69,74,52}};

        System.out.println("Student\tTest1\tTest2\tTest3");
        for(int i=0; i<arTestMarks[0].length;i++) {
            System.out.print(arStudents[i] + "\t\t");
            for(int j=0; j<arTestMarks[0].length;j++){
                System.out.print(arTestMarks[i][j] + "\t\t");
            }
            System.out.println();
        }
    }
}
