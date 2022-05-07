echo "Enter the 10 numbers : "
for((i=0;i<10;i++))
do
read arr[$i]
done
echo "The entered array is :"
echo ${arr[*]}