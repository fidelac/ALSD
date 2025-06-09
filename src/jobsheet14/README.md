|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020046  |
| Nama |  Fidela Clarisa |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/fidelac/ALSD.git) |

# Labs #14

## Question 14.2.2
1. Karena pada BST, data diatur sehingga node kiri selalu lebih kecil dan node kanan lebih besar dari node induknya/root. pencarian dilakukan dengan membandingkan dan langsung memilih cabang kiri atau kanan, sehingga waktu pencarian rata-rata O(log n). Dan Pada binary tree biasa, data tidak terurut sehingga pencarian harus menelusuri semua node (O(n)).

2. - left: Menunjuk ke anak kiri node (berisi nilai lebih kecil dari node saat ini).
    - right: Menunjuk ke anak kanan node (berisi nilai lebih besar dari node saat ini).

3.  
     a. Sebagai referensi ke node paling atas (akar) dari pohon, tempat semua operasi (tambah, cari, hapus) dimulai.

     b. root bernilai null / tree is empty

4. Node baru langsung dijadikan root (akar) pohon, karena belum ada node lain di dalam pohon.

5. Methode add() digunakan untuk menambahkan node baru ke BST, dengan memastikan/mengecek 
    - IPK lebih kecil dari node saat ini, akan ditempatkan di subtree kiri
    - IPK lebih besar dari node saat ini, akan ditempatkan di subtree kanan 
    - Tidak ada data/node yang sama/duplikat

6. Saat menghapus node dengan dua anak, getSuccessor() memastikan node pengganti diambil dari subtree kanan (nilai terkecil), sehingga BST tetap valid dan terurut setelah penghapusan.

## Question 14.3.2

1.  - data: Array yang menyimpan seluruh node (data) dari binary tree.
    - idxLast: Menyimpan indeks terakhir yang berisi data pada array (menandai posisi node terakhir yang valid).

2. populateData(),
Mengisi array data dengan objek-objek node (misal: Student00) hingga indeks tertentu, sehingga membentuk struktur binary tree dalam array.

3. traverseInOrder() , Melakukan penelusuran (traversal) in-order pada binary tree yang direpresentasikan dalam array, yaitu:
kiri → root → kanan.

4.  - Anak kiri: indeks 2 * 2 + 1 = 5
    - Anak kanan: indeks 2 * 2 + 2 = 6


5. int idxLast = 6, Menandakan bahwa data terakhir yang valid di array ada di indeks ke-6 (total ada 7 data/node).

6. Karena pada representasi binary tree dalam array:
    - Anak kiri node di indeks i ada di indeks 2*i + 1
    - Anak kanan node di indeks i ada di indeks 2*i + 2

    Ini mengikuti pola struktur binary tree secara level-order data

## Assignment
1. ![Screenshot](<Screenshot 2025-06-09 160630.png>)
2.  - ![Screenshot](<Screenshot 2025-06-09 162445.png>)
    - ![Screenshot](<Screenshot 2025-06-09 162450.png>)

3. ![Screenshot](<Screenshot 2025-06-09 162458.png>)

4.  - ![Screenshot](<Screenshot 2025-06-09 162615.png>)
    - ![alt text](<Screenshot 2025-06-09 162619.png>)