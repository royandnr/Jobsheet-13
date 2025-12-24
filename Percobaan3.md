Jawaban Percobaan 3

1. code bagian Base case :
if (tahun == 0) { return saldo; }

code bagian Recursion call
return (1.11 * HitungLaba(saldo, tahun - 1));

2. 
Fase ekspansi adalah proses pemanggilan fungsi secara berulang sampai mencapai base case.

Pemanggilan pertama
HitungLaba(100000, 3)
→ 1.11 × HitungLaba(100000, 2)

Pemanggilan kedua
HitungLaba(100000, 2)
→ 1.11 × HitungLaba(100000, 1)

Pemanggilan ketiga
HitungLaba(100000, 1)
→ 1.11 × HitungLaba(100000, 0)

Base Case
HitungLaba(100000, 0)
→ return 100000

Fase substitusi adalah pengembalian nilai dari base case ke pemanggilan sebelumnya.

Dari pemanggilan ke-3
HitungLaba(100000, 1)
= 1.11 × 100000
= 111000

Dari pemanggilan ke-2
HitungLaba(100000, 2)
= 1.11 × 111000
= 123210

Dari pemanggilan ke-1
HitungLaba(100000, 3)
= 1.11 × 123210
= 136763.10

Jadi Hasil Akhirnya adalah 136763.10

