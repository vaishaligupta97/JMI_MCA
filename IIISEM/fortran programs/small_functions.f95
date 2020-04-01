//ALL SMALL FUCTIONS

//CSQRT() FUNCTION
complex,parameter:: a=5
complex:: b=csqrt(A)
print *,a,b
stop
end

//SQRT()FUNCTION
a=5
b=sqrt(A)
print *,a,b
stop
end

//ABS() FUNCTION
a=-5
b=abs(A)
print *,a,b
stop
end

//POWER OPERATOR
a=5
b=a**3
print *,a,b
stop
end

//LOG() FUNCTION
a=1
b=log(a)
print *,a,b
stop
end

//ALOG FUNCTION
a=15
b=alog(a)
print *,a,b
stop
end

//EXP FUNCTION
a=1
b=exp(a)
print *,a,b
stop
end


//MOD() FUNCTION
a=5
b=2
print *,mod(b,a)
stop
end

//SIGN() FUNCTION
program test_sign                                         //output
            print *, sign(-12,1) 							12
			print *, sign(-12,0)							12
			print *, sign(-12,-1)							-12
            print *, sign(-12.,1.)							12.0000000   
            print *, sign(-12.,0.)							12.0000000    
            print *, sign(-12.,-1.)							-12.0000000  				
			end program test_sign												 
															
														
            
          
		  

