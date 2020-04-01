real a(10,10),b(10,10),c(10,10)
call rd(a)
call rd(b)
call wt(a)
call wt(b)
call matmul(a,b,c)
call wt(c)
stop
end

subroutine rd(a)
    real a(10,10)
    print *,"Enter 3*3 matrix values"
    do i=1,3
        do j=1,3
            read *,a(i,j)
        end do
    end do
return 
end

subroutine wt(x)
    real x(10,10)
    print *,"3*3 matrix is"
    do i=1,3
        do j=1,3
            print '(1x ,f10.2,/)',x(i,j)
        end do
    end do
return 
end

subroutine matmul(a,b,c)
    real a(10,10),b(10,10),c(10,10)
    do i=1,3
        do j=1,3
            c(i,j)=0
            do k=1,3
                c(i,j)=c(i,j)+a(i,k)*b(k,j)
            end do
        end do
    end do
 return
 end
        