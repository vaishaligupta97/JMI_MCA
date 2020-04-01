program prime_between_100_and_200
integer:: i,n,flag=1
do j=100,200
    do i=2,j/2
         if(mod(j,i).eq.0)then
             flag=0
             exit
        else
            flag=1
         endif
    enddo
    
    if(flag.eq.1)then
        print *, j, " is prime"
    endif
enddo
stop
end program prime_between_100_and_200