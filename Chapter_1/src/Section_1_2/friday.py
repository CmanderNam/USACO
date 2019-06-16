"""
ID: samueln1
LANG: PYTHON3
TASK: friday
"""

import datetime
fin=open('friday.in','r')
fout=open('friday.out','w')

n=int(fin.readline())
i=1900
date=[0,0,0,0,0,0,0]

for i in range(n):
    for j in range(12):
        x=datetime.datetime(1900+i,j+1, 13)
        n=int(x.strftime("%w"))
        date[n]+=1

ans = str(date[6])
for i in range(6):
    ans+=" "+str(date[i])

fout.write(ans+"\n")
fin.close()
fout.close()