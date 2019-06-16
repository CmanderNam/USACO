"""
ID: samueln1
LANG: PYTHON3
TASK: ride
"""
def convert (s):
    r=1
    for c in s:
        r*=ord(c)-ord('A')+1
    return r%47

fin=open("ride.in","r")
fout=open("ride.out","w")

comet = fin.readline()[:-1]
group = fin.readline()[:-1]

if convert(comet)==convert(group):
    fout.write("GO\n")
else:
    fout.write("STAY\n")

fout.close
fin.close