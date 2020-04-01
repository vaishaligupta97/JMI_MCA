!gfortran, gcc version 5.4.0 20160609

program simpson_3
   real a,b,sum1,sum2,integral,sum
   integer n,i
   f(x)=exp(-0.5*x*x)
   print *,"Enter a,b,n: "
   read *,a,b,n
   h=(b-a)/n
   sum=f(a) + f(b)
   sum1=0
   sum2=0
   do i=2,n,2
       sum1=sum1 + f( a+ (i-1)*h)
   end do
   do i=3,n-1,2
       sum2=sum2 + f(a+(i-1)*h)
   end do
   
   integral=h*(sum+4*sum1 + 2*sum2)/3
   print *,"integral" ,integral
   stop
end program simpson_3