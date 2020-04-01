program prime_20
integer:: i,n,flag=1
        print *,1, " is not prime number"
do j=2,20
    do i=2,j/2
         if(mod(j,i).eq.0)then
             flag=0
             exit
        else
            flag=1
         endif
    enddo
    
    if(flag.eq.0)then
        print *, j, " is not prime number"
    else
        print *, j, " is prime number"
    endif
enddo
stop
end program prime_20