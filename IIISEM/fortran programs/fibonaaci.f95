program fibonaaci
integer::i,a=0,b=1,c
print *,a
print *,b
do i=1,8
    c=a+b
    print *,c
    a=b
    b=c
enddo
end program fibonaaci