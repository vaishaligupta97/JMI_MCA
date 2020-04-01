a=5
 b=6
if(a .eq. b)then
    print *,"a=b",a,b
else
    print *,"a is not equal to b"
endif
stop
end


//another method only one if statement not a block

a=5
 b=5
if(a .eq. b) print *,"a=b",a,b
stop
end