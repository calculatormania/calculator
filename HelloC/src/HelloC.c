#include <stdio.h>

int main(void)
{
	double height, weight;
	printf("身長と体重を入力せよ。ただし、身長はcm換算でよい\n");
	scanf("%lf%lf", &height, &weight);
	double BMI = (weight/(height*height))*10*10*10*10;
	printf("あなたのBMIは...%f！\n", BMI);
	if(BMI < 18.5){
		printf("痩せすぎ！\n");
	} else if (18.5 <= BMI && BMI <25){
		printf("ふつう...\n");
	} else {
		printf("太りすぎ！\n");
	}
	return 0;
}
