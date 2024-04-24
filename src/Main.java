public class Main {
    public static void main(String[] args) {
        int[] grade;
        grade = new int[3];
        grade[0] = 70;
        grade[1] = 80;
        grade[2] = 90;
        for (int i = 0; i < grade.length; i++) {
            if(grade[i] < 80){
                System.out.println("Belum Lulus");
            }
            else {
                System.out.println("Lulus");
            }
        }

    }
}