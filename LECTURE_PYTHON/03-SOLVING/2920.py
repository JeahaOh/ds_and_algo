# 백준 2920 음계
notes = list(map(int, input().split(' ')))

isAsc = True
isDesc = True

for i in range(1, 8):
  if notes[i] > notes[i - 1] :
    isDesc = False
  elif notes[i] < notes[i -1] :
    isAsc = False

if isAsc :
  print('ascending')
elif isDesc :
  print('descending')
else :
  print('mixed')