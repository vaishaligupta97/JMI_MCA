do i=1,10,2
print *,"i=",i
enddo
stop
end

//another do loop which is not working 

real r
do r=0.1,5.9,2.0
print *,"r=",r
enddo
stop
end

//it is showing the error

jdoodle.f95:2:3:

 do r=0.1,5.9,2.0
   1
Error: Deleted feature: Loop variable at (1) must be integer

//this loop is working well

do i=10,1,-1
print *,"i=",i
enddo
stop
end

//output

 i=          10
 i=           9
 i=           8
 i=           7
 i=           6
 i=           5
 i=           4
 i=           3
 i=           2
 i=           1