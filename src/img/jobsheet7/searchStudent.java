package jobsheet7;

public class searchStudent {
    Student[] listStd;
    int idx;

    public searchStudent(int size) {
        listStd = new Student[size]; 
        idx = 0; 
    }

    public void add(Student std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void display(){
        for (Student student : listStd){
            student.display();
            System.out.println("----------------------------------");
        }
    }
    
    public int findSeqSearch(int search){
        int position = -1;
        for (int i = 0; i < listStd.length; i++){
            if (listStd[i].nim == search){
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos){
        if(pos != -1){
            System.out.println("Data: " + x + " is found in index-" + pos );
        } else {
            System.out.println("Data: " + x + " is not found");
        }
    }

    public void showData(int x, int pos){
        if( pos != -1){
            System.out.println("NIM: " + x);
            System.out.println("Name: " + listStd[pos].name);
            System.out.println("Age: " + listStd[pos].age);
            System.out.println("GPA: " + listStd[pos].gpa);
        }else{
            System.out.println("Data: " + x + " is not found");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid; 
        if(right>= left) {
            mid = (left + right) /2;
            if (cari == listStd[mid].nim){
                return (mid);
            } else if (listStd[mid].nim > cari){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        } return -1;
    }

    
}

