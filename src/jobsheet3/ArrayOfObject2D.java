package jobsheet3;

public class ArrayOfObject2D {
    public static void main(String[] args) {
        Rectangle[][] rectangleArray = new Rectangle[2][3];

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                rectangleArray[i][j] = new Rectangle();
                rectangleArray[i][j].length = (i + 1) * 10;
                rectangleArray[i][j].width = (j + 1) * 5;
                System.out.println("Rectangle[" + i + "][" + j + "] - Length: " 
                + rectangleArray[i][j].length + ", Width: " + rectangleArray[i][j].width);
            }
        }
    }
}
