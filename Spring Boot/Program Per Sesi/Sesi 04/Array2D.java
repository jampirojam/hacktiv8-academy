public class Array2D {
    public static void main(String[] args) {
        String[][] fw = {
                { "Java", "Springboot" },
                { "JavaScript", "React" },
                { "PHP", "Laravel" }
        };

        for (int i = 0; i < fw.length; i++) {
            System.out.println("Bahasa: " + fw[i][0]);
            System.out.println("Framework: " + fw[i][1]);
        }

        for (int i = 0; i < fw.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(fw[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
