#include<stdio.h>

int main() {
   int A[9],i,j,dummy,num;   //ประ�?าศตัว�?ปร
   for(i=0;i<3;i++){  //เปิloopรับค่า3ค่า
       printf("Input three digit number %d : ", i+1); 
       scanf("%d",&num);   //�?ล่องscanner
       printf("\n");  //เว้นบรรทัดตัวเอง input number1,2,3ให้อยู่คนละบรรทัด
       
       while(num>999 || num<100){     //whileคือเช็คจน�?ว่าจะจริง(จริงตามเงื่อนไขถึงจะทำในloop while)(ในวงเล็บจะต้องเป็นเงื่อนไขที่เราไม่ต้อง�?าร)
           printf("Input three digit number %d in range[100-999] : ", i+1);   //ให้รับค่าใหม่อี�?ครั้งเช่น27รับค่าไปเรื่อยๆที่เป็นเลข2หลั�?อะ
           scanf("%d",&num);   //เ�?็บค่าเฉยๆ�?บบscanner �?ต่ไม่ต้องปริ้น
           printf("\n");
       }
       
       A[3*i]=num/100;  //ใน1รอบรับมา3ช่อง (เราจะต้องเ�?็บ9ช่องนับตั้ง�?ต่0-8)รอบ�?ร�?i=0จะเ�?็บค่าที่ช่อง012 รอบถัดไปที่i=1 จะเ�?็บค่าที่ช่อง345รอบ ถัดไปที่i=2ได้ช่องที่678//เ�?็บA0
       num=num-(A[3*i]*100);   //ตัดที่หลั�?ร้อย
       A[3*i+1]=num/10;    //เ�?็บA1
       num=num-(A[3*i+1]*10);    //ตัดที่หลั�?สิบ
       A[3*i+2]=num;     //เ�?็บA2 สำหรับรอบที่i=0
   }
   
   for(i=0;i<9;i++){
       for(j=0;j<8;j++){
           if(A[j]>A[j+1]){
               dummy=A[j];
               A[j]=A[j+1];
               A[j+1]=dummy;
           }
       }
   }
   
   printf("Output :");
   for(i=0;i<9;i++){
   printf("%d ",A[i]);
   }
   return 0;
}