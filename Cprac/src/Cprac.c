#include <stdio.h>
#include <math.h>
//二分法による解の近似値計算

double sq(double);
double bi(double, double);

int main(void)
{
		printf("根は %.17f \n", bi(1.0, 2.0));
	return 0;
}

double bi(double a, double b)
{
	while(b-a > pow(10,-15)){
		if(sq(a)*sq((a+b)/2.0) < 0){
			b = (a+b)/2.0;
		} else {
			a = (a+b)/2.0;
		}
	}
	return (a+b)/2.0;
}

double sq(double x)
{
	double y;
    y = x*x - 2;
    return y;
}


