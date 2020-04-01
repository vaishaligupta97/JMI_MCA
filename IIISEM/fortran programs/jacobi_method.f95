!jacobi's method
parameter(maxit=100,eps=1.0e-5)
real oldx(10),x(10),a(10,11),maxerr
print*,"enter n"
read *,n
read(*,*)((a(i,j),j=1,n+1),i=1,n)
do i=1,n
 do j=1,n+1
 print '(1x,f10.2,/)',a(i,j)
 enddo
 print *
 enddo
 do i=1,n
 oldx(i)=0.0
 enddo
 do k=1,maxit
 maxerr=0.0
 do i=1,n
 sum=0.0
 do j=1,n
  if(i.ne.j)then
  sum=sum+a(i,j)*oldx(j)
  endif
  enddo
  t=(a(i,n+1)-sum)/a(i,j)
  relerr=abs((oldx(i)-t)/t)
  if(relerr.gt.maxerr)maxerr=relerr
   x(i)=t
   enddo
   do j=1,n
   oldx(i)=x(i)
   enddo
   if(maxerr.le.eps)then
   print *,"converges"
   do i=1,n
   print *,x(i)
   enddo
   stop "converges"
    endif
    enddo
    print *,"does not converges"
    stop "does not converges"
    end 