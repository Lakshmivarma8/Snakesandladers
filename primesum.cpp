#include <iostream>
using namespace std;
int primes(int n);

int main()
{
int n, i;

cout << "Enter the number: ";
cin >> n;
int flag = 0;
for(i = 2; i <= n/2; ++i)
{
if (primes(i) == 1)
{

if (primes(n-i) == 1)
{
cout << n << " = " << i << " + " << n-i << endl;
flag = 1;
}

}
}

if (flag == 0)
cout << n << " cannot be expressed as the sum of two prime numbers\n";
return 0;
}
int primes(int n)
{
int i, isPrime = 1;

for(i = 2; i <= n/2; ++i)
{
if(n % i == 0)
{
isPrime = 0;
break;
}
}
return isPrime;
}
