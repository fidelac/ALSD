package jobsheet3;

public class ArrayBlocks {
    public static void main(String[] args) {
        Blocks[] blArray = new Blocks[4];

        blArray[0] = new Blocks(100, 30, 12);
        blArray[1] = new Blocks(120, 40, 15);
        blArray[2] = new Blocks(210, 50, 25);
        blArray[3] = new Blocks(); //Constructor addition
        countVolume(blArray);
    }

    static void countVolume(Blocks[] blArray) {

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume Block - " + i + " : " + blArray[i].countVolume());
        }
    }
}
