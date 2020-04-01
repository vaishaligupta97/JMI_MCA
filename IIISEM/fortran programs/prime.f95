program prime
integer:: i,n,flag=1
print *,"Enter a number"
read *,n
do i=2,n/2
    if(mod(n,i).eq.0)then
        flag=0
        exit
    endif
enddo
if(flag.eq.0)then
    print *,"number is not prime"
else
    print *,"number is prime"
endif
stop
end program prime