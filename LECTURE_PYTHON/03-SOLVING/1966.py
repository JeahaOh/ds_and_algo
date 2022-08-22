test_case = int(input())

for _ in range(test_case) :
  n, m = list(map(int, input().split(' ')))
  queue = list(map(int, input().split(' ')))
  # list를 튜플로 변경 [(val, idx), (val, idx), ...]
  queue = [(i, idx) for idx, i in enumerate(queue)]

  count = 0

  while True :
    if queue[0][0] == max(queue, key = lambda x : x[0])[0]:
      # 중요도가 높은 문서가 앞에 있다면
      count +=1
      if queue[0][1] == m :
        print(count)
        break
      else :
        queue.pop(0)
    else :
      # 중요도가 낮다면 뒤로 옮김
      queue.append(queue.pop(0))
