real a,b,c,ar,x
area(a,b,c)=sqrt(((a+b+c)/2)* ((a+b+c)/2-a) * ((a+b+c)/2-b)* ((a+b+c)/2-c) )
print *,"Enter a,b,c"
read *,a,b,c
print *,area(a,b,c)
end