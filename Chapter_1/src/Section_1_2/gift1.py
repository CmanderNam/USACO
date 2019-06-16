"""
ID: samueln1
LANG: PYTHON3
TASK: gift1
"""

fin=open("gift1.in","r")
fout=open("gift1.out","w")
n=int(fin.readline()[:-1])

person = []
money = []
i=0
for i in range(n):
    person.append(fin.readline()[:-1])
    money.append(0)
i=0
for i in range(n):
    p = person.index(fin.readline()[:-1])
    l = fin.readline()[:-1].split()
    m=int(l[0])
    d = int(l[1])
    if(d==0):
        continue
    dm = m//d
    left = m%d
    
    for j in range(d):
        money[person.index(fin.readline()[:-1])]+=dm
    money[p]=money[p]-m+left

i=0
for i in range(n):
    print(person[i], str(money[i]))

fout.close()
fin.close()