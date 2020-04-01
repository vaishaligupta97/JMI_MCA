parameter (eps=0.0001,maxit=100)
integer i/0/
real x,xnew
logical flag /.true./
f(x)=x**3-4*x-9
fd(x)=3*x**2-4
print *,"Enter guess"
read *,x
print *,"x= ",x
if(abs(f(x)) < 0) Stop "Divided by zero"
do while(flag .AND. i.LT.maxit)
    xnew=x-(f(x)/fd(x))
    if(abs(xnew-x) .lt. eps)then
        flag=.false.
    else
        i=i+1
        x=xnew
    endif
    print *,"x= ",x,"f(X)= ",f(X)
end do
if(i .eq. maxit) then
    print *,"Does not converge"
    stop "Does not converge"
end if
print *,"root= ",xnew
print *,"iteration",i
stop
end
    