integer x(3,3)
do i=1,3
    do j=1,3
        read *,x(i,j)
    end do
end do
do i=1,3
    do j=1,3
        print *,x(i,j)
    end do
end do
stop
end


integer x(3,3)
read *,((x(i,j),j=1,3),i=1,3)
do i=1,3
    do j=1,3
        print *,x(i,j)
    end do
end do
stop
end