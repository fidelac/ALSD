package jobsheet3;

public class Blocks {
    public int width, length, heigth;

    public Blocks(int p, int l, int t){
        length = p;
        width = l;
        heigth =t;
    }

    public Blocks(int p, int l){
        length = p;
        width = l;
        heigth = 1;
    }

    public Blocks(){
        length = 1;
        width = 1;
        heigth = 1;
    }
    
    public int countVolume(){
        return length*width*heigth;
    }
}
