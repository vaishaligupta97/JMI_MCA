real a,b,c,r1,r2
complex cr1,cr2,d
print *,"Enter a,b,c"
read *,a,b,c
d=b*b-4*a*c
if((b*b-4*a*c).gt.0)then
    r1=(-b + sqrt(b*b-4*a*c))/2*a
    r2=(-b - sqrt(b*b-4*a*c))/2*a
    print *,r1,r2,"d=",d
elseif((b*b-4*a*c).lt.0)then
    cr1=(-b + csqrt(d))/2*a
    cr2=(-b - csqrt(d))/2*a
    print *,cr1,cr2
else
    r1=-b/(2*a)
    r2=r1
    print *,r1,r2,"d=",d
endif
stop
end

//another

real a,b,c,r1,r2,d
complex cr1,cr2
print *,"Enter a,b,c"
read *,a,b,c
d=b*b-4*a*c
if(d.gt.0)then
    r1=(-b + sqrt(d))/2*a
    r2=(-b - sqrt(d))/2*a
    print *,r1,r2,"d=",d
elseif(d.lt.0)then
    cr1=(-b + csqrt(b*b-4*a*c))/2*a
    cr2=(-b - csqrt(d))/2*a
    print *,cr1,cr2
else
    r1=-b/(2*a)
    r2=r1
    print *,r1,r2,"d=",d
endif
stop
end