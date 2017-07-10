from operator import itemgetter
 
t=int(input())
for i in range(t):
	n,d = map(int, input().split())
	trainers = []
	sadness = 0
	for j in range(n):
		trainer = []
		trainer=list(map(int, input().split()))
		trainers.append(trainer)
	trainers.sort(key=itemgetter(0))
	trainers.sort(key=itemgetter(2),reverse=True)
	# print(trainers)
	for i in range(1,d+1):
		# print(i)
		for trainer in trainers:
			if(trainer[0]<=i):
				# print("Got a trainer with sadness %d" % trainer[2])
				trainer[0]+=1
				trainer[1]-=1
				if(trainer[1]==0):
					trainers.remove(trainer)
				break
	for trainer in trainers:
			sadness+=trainer[1]*trainer[2]
	print(sadness) 