class Bubble {
public static void main(String args[]) {
int num[]={-12,13,54,90,87,54,34,20,78,57};
int a, b, i, temp=0;
int size;
size=10;
for(i=0; i<10; i++)
System.out.println("Original array is=" +num [i]);
for(a=1; a<size; a++)
for(b=size-1; b>=a; b--) {
if (num[b-1]>num[b]){
temp=num[b];
num[b-1]=num[b];
num[b]=temp;
}}
System.out.println("The sorted array is=" +num[i]);
}
}