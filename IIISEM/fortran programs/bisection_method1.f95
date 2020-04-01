parameter(eps=0.0001)
real x1,x2,x3
integer i/0/
logical flag/.true./
F(x)=x**3-47
print *,"Enter x1,x2="
read (*,*), x1,x2
do while(F(x1)*F(x2) .GT. 0)
    print *,"F(x1)*F(x2) should less than 0"
    print *,"x1=",x1
    print *,"x2= ",x2
    print *,"F(x1)=",F(x1),"F(x2)= ",F(x2)
    read *,x1,x2
    read *
end do
print *,"x1=",x1,"x2= ",x2
 print *,"F(x1)=",F(x1),"F(x2)= ",F(x2)
do while(flag .AND. i < 100)
    x3=(x1+x2)/2
    if(abs(F(x3)) .LT. eps) then
        flag= .false.
    else
        i=i+1
        if(F(x1)*F(x3) < 0) then
            x2=x3
        else
            x1=x3
        end if
    end if
enddo
print *,"x3= ",x3
print *,"iteration",i
stop
end
