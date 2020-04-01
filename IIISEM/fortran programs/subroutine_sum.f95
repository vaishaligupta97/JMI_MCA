x1=5
x2=3
call sum(x1,x2,x3)
print *,"x3= ",x3
stop
end

subroutine sum(a,b,c)
    real a,b,c
    c=a+b
return 
end