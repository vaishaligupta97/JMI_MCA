real a,b,c,ar
print *,"Enter a,b,c"
read *,a,b,c
call triarea(a,b,c,ar)
print *,"Area of triangle",ar
stop
end

subroutine triarea(a,b,c,area)
    real a,b,c,area,s
    s=(a+b+c)/2
    area=sqrt(s*(s-a)*(s-b)*(s-c))
return 
end