real x(7)
integer i
integer ::s=0
do i=1,5
    read *, x(i)
    s=s + x(i)
enddo
do i=1,5
    print *, x(i)
enddo
print *,s
end