#include <iostream>
#include <iomanip>

using namespace std;

const int MAX = 100;

void nhapMaTran(int mat[MAX][MAX], int rows, int cols, char ten) {
    cout << "Nhap ma tran " << ten << " (" << rows << "x" << cols << "):\n";
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cin >> mat[i][j];
        }
    }
}

void xuatMaTran(int mat[MAX][MAX], int rows, int cols) {
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << setw(5) << mat[i][j] << " ";
        }
        cout << endl;
    }
}

void congMaTran(int A[MAX][MAX], int B[MAX][MAX], int C[MAX][MAX], int r, int c) {
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
}

void truMaTran(int A[MAX][MAX], int B[MAX][MAX], int C[MAX][MAX], int r, int c) {
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            C[i][j] = A[i][j] - B[i][j];
        }
    }
}

void nhanMaTran(int A[MAX][MAX], int B[MAX][MAX], int C[MAX][MAX], int r1, int c1, int c2) {
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
            C[i][j] = 0;
            for (int k = 0; k < c1; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
}

int main() {
    int A[MAX][MAX], B[MAX][MAX], Res[MAX][MAX];
    int r1, c1, r2, c2;

    cout << "Kich thuoc ma tran A (row col): "; cin >> r1 >> c1;
    cout << "Kich thuoc ma tran B (row col): "; cin >> r2 >> c2;

    nhapMaTran(A, r1, c1, 'A');
    nhapMaTran(B, r2, c2, 'B');

    if (r1 == r2 && c1 == c2) {
        cout << "\n--- Tong A + B ---\n";
        congMaTran(A, B, Res, r1, c1);
        xuatMaTran(Res, r1, c1);
        
        cout << "\n--- Hieu A - B ---\n";
        truMaTran(A, B, Res, r1, c1);
        xuatMaTran(Res, r1, c1);
    } else {
        cout << "\nKich thuoc khong phu hop de cong/tru.\n";
    }

    if (c1 == r2) {
        cout << "\n--- Tich A * B ---\n";
        nhanMaTran(A, B, Res, r1, c1, c2);
        xuatMaTran(Res, r1, c2);
    } else {
        cout << "\nKich thuoc khong phu hop de nhan.\n";
    }

    return 0;
}