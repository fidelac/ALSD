package jobsheet14;

public class BinaryTreeArray00 {
    Student00[] data;
    int idxLast;

    public BinaryTreeArray00() {
        data = new Student00[10];
        idxLast = -1;
    }

    void populateData(Student00[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Student00 data) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = data;
                idxLast = i;
                return;
            }
        }
        System.out.println("Tree array is full!");
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && data[idxStart] != null) {
            data[idxStart].print();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
