n=int(input())
list1=[]
for i in range(0,n):
    k=int(input())
    list1.append(k)
s=sum(list1)
list2=[]
for i in range(0,n):
    if(s//n==list1[i]):
        continue
    else:
        list2.append(list1[i])
max=0
min=0
count=0
if(len(list2)!=0):
    for i in range(0,len(list2)):
        if(list2[i]>s//n):
            max=list2[i]-s//n
            list2[i]=s//n
            count+=1
        elif(list2[i]<s//n):
            min=s//n-list2[i]
            list2[i]=max-list2[i]
            count+=1
print(count*(s//n))    