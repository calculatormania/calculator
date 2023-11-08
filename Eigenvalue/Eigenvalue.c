#include <stdio.h>
//#include <math.h>
//二分法による解の近似値計算

//double sq(double);
//double bi(double, double);


int main(void)
{

	double A[][3] = {{1,2,3} , {4,5,6}, {7,8,9}};
	double B[][3] = {{1,1,0} , {-1,-3,6}, {-2,1,0}};

	showmat(A);

	double C[3][3];
	for(int i=0; i<sizeof(A)/sizeof(A[0]); i++){
		for(int j=0; j<sizeof(A)/sizeof(A[0]); j++){
			C[i][j] = 0;
			for(int k=0; k<sizeof(A)/sizeof(A[0]); k++){
				C[i][j] = C[i][j] + A[i][k]*B[k][j];
			}

		}
	}

	for(int i=0; i<sizeof(A)/sizeof(A[0]); i++){
		for(int j=0; j<sizeof(A)/sizeof(A[0]); j++){
			printf("%f\t", C[i][j]);
		}
		printf("\n");
	}

	return 0;
}

/*double [3][3] Prod(double A[3][3], double B[3][3])
{
	double C[3][3];
	for(int i=0; i<sizeof(A)/sizeof(A[0]); i++){
		for(int j=0; j<sizeof(A)/sizeof(A[0]); j++){
			C[i][j] = 0;
			for(int k=0; k<sizeof(A)/sizeof(A[0]); k++){
				C[i][j] = C[i][j] + A[i][k]+B[k][j];
			}

		}
	}
	return C;
}*/

void showmat(double A[3][3])
{
	for(int i=0; i<sizeof(A)/sizeof(A[0]); i++){
		for(int j=0; j<sizeof(A)/sizeof(A[0]); j++){
			printf("%f\t", A[i][j]);
		}
		printf("\n");
	}
}
